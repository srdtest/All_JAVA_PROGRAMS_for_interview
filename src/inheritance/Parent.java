package inheritance;

public class Parent  extends Grandparent{

	private int b;

	Parent(int a, int b){
		super(a);
		this.b=b;
	}
	void shpw() {
		System.out.println("tha value of a is "+a);
		System.out.println("value of b is "+b);
	}
}
