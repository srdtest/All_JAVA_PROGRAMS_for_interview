package mostaskedcodes_Streams;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ListofEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//To find the number pairs which sum makes 10 but should not repeat
		List<Integer> numbers =Arrays.asList(1,2,3, 4,5,6,7,8,9);
		int target=10;
		List<List<Integer>> pairs = numbers.stream()
	            .flatMap(i -> numbers.stream()
	                .filter(j -> i < j && i + j == target)
	                .map(j -> Arrays.asList(i, j)))
	            .collect(Collectors.toList());

	        System.out.println(pairs);
		
		
	}

}

