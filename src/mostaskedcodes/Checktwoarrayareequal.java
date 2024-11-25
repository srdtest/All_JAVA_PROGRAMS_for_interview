package mostaskedcodes;

public class Checktwoarrayareequal {

	public static void main(String[] args) {
		int a[] = {1,2,3,4,5,6,7,8,9,10};
		int b[] = {1,2,3,4,5,6,7,8,9,10};
		
		int alen=a.length;
		int blen= b.length;
		
		if(alen==blen) {
			for(int i=0;i<alen;i++) {
				for(int j=0;j<blen;j++) {
					if(a[i]==b[j]) {	
					}
				}
			}
			System.out.println("The two arrays are equal");
			
		}else {
			System.out.println("The given two arrays are not equal");
		}

	}

}
