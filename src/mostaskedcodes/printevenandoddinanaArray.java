package mostaskedcodes;

public class printevenandoddinanaArray {

	public static void main(String[] args) {
		int a[]= {1,5,6,3,7,8,2,10};
		int len= a.length;
		int evencount=0;
		int oddcount=0;
		for(int i=0;i<len;i++) {
			if(a[i]%2==0) {
				evencount++;
			}else {
				oddcount++;
			}
		}
		System.out.println("The number of even numbers in an array is "+evencount);
		System.out.println("The number of odd numbers in an array is "+oddcount);
		

	}

}
