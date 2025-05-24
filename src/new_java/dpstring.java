package new_java;

import java.util.HashSet;
import java.util.Set;

public class dpstring {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1= "hi this this hi ius rajdfasd";
		
		String[] strings = s1.split(" ");
			Set<String> s = new HashSet<>();
		for(String str:strings) {
			s.add(str);
		}
		System.out.println(s);
	}
}
	
	
	


