package Strings;

public class strrconcat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long starttime = System.currentTimeMillis();
		for (int i=0;i<5000;i++) {
			String result = "this is "+"sriram "+"with "+"string caoncatenations using +";
		}
		long endtime = System.currentTimeMillis();
		System.out.println("time taken for the string concatenations with + is "+(endtime-starttime));
		
		long starttime1 = System.currentTimeMillis();
		for (int i=0;i<5000;i++) {
		StringBuffer sb= new StringBuffer();
		sb.append("this is ");
		sb.append("sriram ");
		sb.append("with  "); 
		sb.append("string caoncatenations using +"); 
		}
		long endtime1 = System.currentTimeMillis();
		System.out.println("time taken for the string concatenations  with buffer is "+(endtime1-starttime1));
		}
		
		
		


}
