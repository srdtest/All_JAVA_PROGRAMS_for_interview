package mostaskedcodes_Streams;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class removeduplicatesfromlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> l1= Arrays.asList(1,6,5,4,4,5,6,2);
		List<Integer> nodups = l1.stream().distinct().collect(Collectors.toList());
		System.out.println(nodups);
	}

}
