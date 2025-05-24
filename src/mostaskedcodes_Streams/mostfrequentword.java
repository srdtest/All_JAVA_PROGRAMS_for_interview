package mostaskedcodes_Streams;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class mostfrequentword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<String> words = Arrays.asList("app", "bap","cap","dap","app");
		
		String mostfreq = words.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
				.entrySet().stream()
				.max(Map.Entry.comparingByValue())
				.map(Map.Entry::getKey)
				.orElse(null);
		
		System.out.println(mostfreq);
	}

}
