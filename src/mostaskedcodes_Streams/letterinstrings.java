package mostaskedcodes_Streams;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import java.util.*;
import java.util.stream.Collectors;

public class letterinstrings {

    public static void main(String[] args) {

        List<String> words = Arrays.asList("sri", "ram", "is", "a");

        List<Character> commonChars = words.stream()
            .map(word -> word.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting())))
            .reduce((map1, map2) -> {
                map1.keySet().retainAll(map2.keySet());
                for (Character key : map1.keySet()) {
                    map1.put(key, Math.min(map1.get(key), map2.getOrDefault(key, 0L)));
                }
                return map1;
            })
            .orElse(Map.of())
            .entrySet().stream()
            .flatMap(e -> Collections.nCopies(e.getValue().intValue(), e.getKey()).stream())
            .collect(Collectors.toList());

        System.out.println("Common characters: " + commonChars);
    }
}