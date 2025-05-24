package Strings;

public class stringsearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String srt = " hi this is sriram";

String searchstring = "sriramd";
int strindex = srt.indexOf(searchstring);
if(strindex>-1) {
	
	System.out.println("string found");
}
else
	System.err.println("not fountd");

	}

}
