package mostaskedcodes_Streams;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class freqofcharsinstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String st= "hi this is sriram deshmukh";
		Map<Character, Long> fre = st.chars()
				.mapToObj(c->(char) c)
				.filter(c->c!=' ')
				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
				
		System.out.println(fre);
		
		
	}

}
