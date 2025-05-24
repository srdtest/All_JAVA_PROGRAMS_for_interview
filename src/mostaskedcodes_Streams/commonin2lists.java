package mostaskedcodes_Streams;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class commonin2lists {

	public static void main(String[] args) {
		
		
		List<Integer> l1 = Arrays.asList(1,2,4,3,5,67,8);
		List<Integer> l2 = Arrays.asList(11,2,14,3,5,67,18);
		
		List<Integer> comm = l1.stream()
				.filter(l2::contains)
				.collect(Collectors.toList());
		
		System.out.println(comm);
	}
}
