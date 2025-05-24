package mostaskedcodes_Streams;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class sortalistofstrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		List<String> names = Arrays.asList("ASriram","Bswwtha","CNihira","Dmokshi");
		
		List<Integer> nums = Arrays.asList(4,2,7,1,5);
		List <String > sorted =names.stream()
				.sorted(Comparator.reverseOrder())
				.collect(Collectors.toList());
		
		System.out.println(sorted);
		List<Integer> sortednums = nums.stream()
				.sorted(Comparator.reverseOrder())
				.collect(Collectors.toList());
		System.out.println("Sorted numbers order is "+sortednums);
		
		
		
	}

}
