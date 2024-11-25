package mostaskedcodes;

public class Reverseanumber {

	public static void main(String[] args) {
		//stringbuffer
		int s = 123456789;
		StringBuffer sb = new StringBuffer(String.valueOf(s));
		StringBuffer rev = sb.reverse();
		System.out.println(rev);
		
		//stringbuilder
		StringBuilder ss= new StringBuilder();
		ss.append(s);
		StringBuilder rev1 = ss.reverse();
		System.out.println(rev1);
		
		
		
	
		

	}

}
