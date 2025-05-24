package new_java;

public class swapstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String x ="im striram";
		
		String a = "hello";
		String b = "world";
		System.out.println("Before swapping a ="+a);
		System.out.println("Before swapping b ="+b);
		a = a+b;
		b=a.substring(0,a.length()-b.length());
		a=a.substring(b.length());
		
		System.out.println("after swapping a ="+a);
		System.out.println("after swapping b ="+b);
		
		System.out.println(x.substring(0,7));
		
	}

}
