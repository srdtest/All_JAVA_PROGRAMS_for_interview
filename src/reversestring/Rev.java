package reversestring;

import java.util.List;

public class Rev {

	
	public static String rev(String s) {
		String rev = "";
		for (int i=0;i<s.length();i++) {
			rev=s.charAt(i)+rev;
			
		}
		
		
		return rev;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
	String str ="Sriram is agood boy";
	String[] words= str.split(" ");
	for (String word:words) {
	System.out.println(rev(word));
	}
}
}
