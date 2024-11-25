package mostaskedcodes;

public class MissingnumberinArray {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,6,7,8,9,10};
		int len = a.length;
		int sum=0;
		int sum1=0;
		for(int i=0;i<len;i++) {
			sum=sum+a[i];
			}
			
			for(int j=0;j<=10;j++) {
				sum1=sum1+j;
		}
			int missingnum= sum1-sum;
		System.out.println(sum);
		System.out.println(sum1);
		
		System.out.println("The missing number in an array is "+ missingnum);
		
		

	}

}
