package mostaskedcodes_Streams;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class maptolist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, List<List<Integer>>> map = 	new HashMap<>();
				map.put("a" ,Arrays.asList(Arrays.asList(1,2), Arrays.asList(2,3)));
				map.put( "b", Arrays.asList(Arrays.asList(4,5),Arrays.asList(4,7)));
		
		List<Integer> lis = map.values().stream().flatMap(List::stream).flatMap(List::stream)
				.collect(Collectors.toList());
		
		System.out.println(lis);
		
	}

}
