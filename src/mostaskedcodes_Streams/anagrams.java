package mostaskedcodes_Streams;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class anagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> words = Arrays.asList("listen","silent","enlist","rat","tar","art");
		
		Map<String,List<String>> anagram = words.stream()
				.collect(Collectors.groupingBy(
						word ->word.chars()
						.sorted()
						.mapToObj(c-> String.valueOf((char) c))
					  .collect(Collectors.joining())
					  ));
						
		System.out.println(anagram);
				}

}
