package mostaskedcodes_Streams;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class countwordsineachsentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<String> sentences = Arrays.asList("Java is a language","python is also a language, but flexible than java", "java and python are competetive");
	Map<String, Long> occur = sentences.stream()
			.flatMap(sentence -> Arrays.stream(sentence.toLowerCase().split("\\s+")))
					.collect(Collectors.groupingBy(word -> word, Collectors.counting()));
			System.out.println(occur);
		
	}

}
