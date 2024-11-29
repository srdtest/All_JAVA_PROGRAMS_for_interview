package mostaskedcodes;

public class Countvowelsandconsonants{

	public static void main(String[] args) {
		String name= "sanjaykumarsanjay";
		
		int len= name.length();
		int ovels_count=0;
		int cons_count=0;
		for(int i=0;i<len;i++) {
			Character ch = name.charAt(i);
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
				ovels_count++;
			}else {
				cons_count++;
			}
		
		}
		System.out.println("numbers ovwels in a given string is "+ovels_count);
		System.out.println("number of consonants in a given string is "+cons_count);
	}

}
