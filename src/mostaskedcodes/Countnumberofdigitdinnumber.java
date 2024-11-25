package mostaskedcodes;

public class Countnumberofdigitdinnumber {

	public static void main(String[] args) {
		int num= 123456;
		String s= Integer.toString(num);
		int count =0;
		for(int i=0;i<s.length();i++) {
			
			count++;
		}
		System.out.println(count);

	}

}
