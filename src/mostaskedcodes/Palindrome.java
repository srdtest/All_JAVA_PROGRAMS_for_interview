package mostaskedcodes;

public class Palindrome {

	public static void main(String[] args) {
		String s = "madam";
		String rev = "";
		int len = s.length();
		for(int i=len-1;i>=0;i--) {
			rev = rev+s.charAt(i);
		}
			if(rev.equals(s)) {
				System.out.println("given string is palindrome");
			}else {
				System.out.println("given string is not palindrome");
			}
			
		

	}

}
