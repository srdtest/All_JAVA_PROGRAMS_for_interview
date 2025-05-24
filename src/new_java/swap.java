package new_java;

public class swap {
	
	public static void swapint(int a, int b) {
		int temp;
		System.out.println("befor swaping a is "+a);
		System.out.println("befor swaping b is "+b);
		temp =a;
		a=b;b=temp;
		
		System.out.println("after swaping a is "+a);
		System.out.println("after swaping b is "+b);
	}
	public static void swapwithouttemp(int a , int b) {
		System.out.println("befor swaping a is "+a);
		System.out.println("befor swaping b is "+b);
		a= a+b;
	    b=a-b;
	    a=a-b;
		System.out.println("after swaping a is "+a);
		System.out.println("after swaping b is "+b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  swapint(4,6);
  swapwithouttemp(8,9);
	}

}
