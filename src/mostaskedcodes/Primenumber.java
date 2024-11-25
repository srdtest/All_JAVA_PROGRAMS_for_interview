package mostaskedcodes;

public class Primenumber {

	public static void main(String[] args) {
		int num = 1;
		int count = 0;
		if(num>1) {
			for(int i=1;i<=num;i++) {
				if(num%i==0)
					count++;
			}
			if(count==2) {
				System.out.println("the given number is a prime number");
			}else {
				System.out.println("The given number is not a primee number");
			}
		}else {
			System.out.println("The given number is not a prime number");
			
		}

	}

}
