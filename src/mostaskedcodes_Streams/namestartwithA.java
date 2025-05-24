package mostaskedcodes_Streams;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class namestartwithA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> names = Arrays.asList("sriram", "Asriram","Andy","amber");
		
		List<String> awords = names.stream()
				.filter(name->name.startsWith("A"))
				.collect(Collectors.toList());
		System.out.println(awords);
		
	}

}
