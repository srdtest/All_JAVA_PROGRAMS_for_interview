package mostaskedcodes_Streams;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class duplicatenumoccurences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<Integer> nums = Arrays.asList(2,3,4,5,3,2,3,4,3,2,3,4,5,4,3);
		
		
		Map<Integer, Long> numoicc = nums.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
				.entrySet().stream()
				.filter(e -> e.getValue() >1 )
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
 		System.out.println(numoicc);
	}

}
