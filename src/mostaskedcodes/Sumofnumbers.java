package mostaskedcodes;

public class Sumofnumbers {

	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,6,7,8,9};
		int len= a.length;
		int sum=0;
		int count=0;
		for(int i=0;i<len;i++) {
			count++;
			sum=sum+a[i];
			
		}
		System.out.println(sum);
		System.out.println(count);
		
		
		
		

	}

}
