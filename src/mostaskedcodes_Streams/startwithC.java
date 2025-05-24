package mostaskedcodes_Streams;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class startwithC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> names= Arrays.asList("sriram","chari","chetan","mokshi");
		
	Optional<String> cnames = names.stream()
				.filter(name -> name.startsWith("c"))
				.findAny();
				
	cnames.ifPresent(System.out::println);
				
	}

}
