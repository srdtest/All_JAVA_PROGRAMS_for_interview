package mostaskedcodes;

public class Commonelementsintwoarraylist {

	public static void main(String[] args) {
	int arr1[] = {1,2,3,4,5,6,7,8,9};
	int arr2[] = {1,2,3,4,5,6,7,8,9,10};
	
	int arr1len= arr1.length;
	int arr2len = arr2.length;
	int count=0;
	for(int i=0;i<arr1len;i++) {
		for(int j= 0;j<arr2len;j++) {
			if(arr1[i]==arr2[j]) {
				System.out.println(arr1[i]);
				count++;
			}
		}
	}
	System.out.println("The count of reoccurance elements in an arralist are" +" "+count);
	} 
}
