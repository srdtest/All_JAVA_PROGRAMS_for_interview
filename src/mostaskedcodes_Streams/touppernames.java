package mostaskedcodes_Streams;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
//program to convert all the strings into uppper case 

public class touppernames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  List<String> names = Arrays.asList("sriram","swetha","nihira","mkokshith");
  
  List<String> upperNames = names.stream()
		  .map(String::toUpperCase)
		  .collect(Collectors.toList());
  System.out.println(upperNames);
	}

}
