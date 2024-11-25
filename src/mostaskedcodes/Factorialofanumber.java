package mostaskedcodes;

public class Factorialofanumber {

	public static void main(String[] args) {
		int num = 6;
		long factorial=1;
		
		for(int i=1;i<=num;i++) {
			factorial = factorial*i;
		}
		System.out.println("The factorial of a given number "+num+ " "+"is" +factorial);

	}

}
