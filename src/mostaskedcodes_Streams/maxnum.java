package mostaskedcodes_Streams;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class maxnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> nums = Arrays.asList(1,54,32,76,98,45,323);
		Optional<Integer> max= nums.stream()
				.max(Integer::compare);
		max.ifPresent(System.out::println);

	}

}
