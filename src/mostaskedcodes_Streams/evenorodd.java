package mostaskedcodes_Streams;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class evenorodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<Integer> number = Arrays.asList(2,5,3,6,8,9);
		
		List<String> evenodd = number.stream()
				.map(n-> n%2==0 ?"even" :"Odd ")
				.collect(Collectors.toList());
		System.out.println(evenodd);
				
	}

}
