package mostaskedcodes_Streams;
import java.util.Arrays;
import java.util.List;

public class sumofsquares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<Integer> nums = Arrays.asList(1,2,3,4,5,6);
		Integer sumofnums = nums.stream()
				.map(i-> i*i)
				.reduce(0,Integer::sum);
		System.out.println(sumofnums);
		
			  
 	}

}
