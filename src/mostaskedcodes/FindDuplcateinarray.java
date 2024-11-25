package mostaskedcodes;

public class FindDuplcateinarray{

	public static void main(String[] args) {
		int a[]= {1,2,5,3,2,1,2,9};
		boolean status = false;
		
		int len =a.length;
		for(int i=0;i<len;i++) {
			for(int j=i+1;j<len;j++) {
				if(a[i]==a[j]) {
					System.out.println("The duplicate elements in an array is "+a[i]);
					status=true;
				}
				
			}
		}
		if(status==false) {
		System.out.println("Duplicate elements not found");
		}
	}

}
