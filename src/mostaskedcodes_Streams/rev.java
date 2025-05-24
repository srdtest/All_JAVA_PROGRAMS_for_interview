package mostaskedcodes_Streams;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class rev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list = Arrays.asList(1,5,4,2,6,7,3);
		List<Integer>  new1 = IntStream.range(0, list.size())
				.mapToObj(i ->list.get(list.size()-i-1))
				.collect(Collectors.toList());
		System.out.println(new1);
		
	
	
	
	}

}
