package new_java;

public class rev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str = " hi this is srira";
		String newstr = "";
		for(int i=0;i<str.length()-1;i++) {
			newstr=str.charAt(i)+newstr;
			
		}
		System.out.println(newstr);	
		
	}

}
