package mostaskedcodes;

public class Reverseastring {

	public static void main(String[] args) {
		//using forloop
		String s = "sanjaykumar";
		String rev= "";
		for(int i=s.length()-1;i>=0;i--) {
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
		
		//stringbuffer
		
		StringBuffer sb = new StringBuffer(s);
		StringBuffer rev1 = sb.reverse();
		System.out.println(rev1);
	}

}
