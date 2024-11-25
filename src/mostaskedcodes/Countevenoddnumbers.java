package mostaskedcodes;

public class Countevenoddnumbers {

	public static void main(String[] args) {
		int num =123456789;
		int evencount=0;
		int oddcount=0;
		while(num>0) {
			int rem=num%10;
			if(rem%2==0) {
				evencount++;
			}else {
				oddcount++;
			}
			num=num/10;
		}
		
		System.out.println("number of even numbers = "+evencount);
		System.out.println("number of odd numbers are ="+oddcount);
	}
	

}
