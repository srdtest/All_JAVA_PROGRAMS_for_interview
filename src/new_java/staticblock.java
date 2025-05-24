package new_java;

public class staticblock {
	
	static int a=100;
	static int b=20;
 static  int c=0;

	
	static {
		c=a+b;
		System.out.println("the sum of a and b is "+c);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	System.out.println("sum of a and b in the main method is "+c);
		System.out.println("operating system is "+System.getenv("OS"));
		
		System.out.println(Math.min(200, 100));
		
	}

}
