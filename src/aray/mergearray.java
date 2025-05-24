package aray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class mergearray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String[] abc = {"a","b","c","d"};
		String[] ABC = {"A","B","C"};
		
		List<String> l = new ArrayList<String>(Arrays.asList(abc));
		l.addAll(Arrays.asList(ABC));
		Object[] c = l.toArray();
		System.out.println(Arrays.toString(c));
		
		

	}

}
