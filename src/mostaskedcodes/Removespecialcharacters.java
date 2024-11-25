package mostaskedcodes;

public class Removespecialcharacters {

	public static void main(String[] args) {
		String str= "learnautomationtesting!@$^&$#$^&";
		str= str.replaceAll("[^a-zA-Z0-9]","");
		System.out.println(str);
	}

}
