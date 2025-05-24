package mostaskedcodes_Streams;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class groupofwords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<String> words = Arrays.asList("Sriram","swetha","nihira","mokshith");
		Map<Integer,List<String>> groupbylen = words.stream()
				.collect(Collectors.groupingBy(String::length));
		System.out.println(groupbylen);
		
	}

}
