package mostaskedcodes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class sum17 {
	
	
	public static List<Integer> sum(int arr[]){
		
		List<Integer> a= new ArrayList<>();
		int n= arr.length;
		int sum=0;
		for(int i=0;i<n;i++) {
			for (int j=0;j<i+1;j++) {
				for (int k=0;k<n;k++) {
					 sum = arr[i]+arr[j]+arr[k];
				
				if (sum==17) {
					
				a = Arrays.asList(arr[i],arr[j],arr[k]);
				
				
				}
					 
				}
			}
		}
		
		return a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {2,4,6,1,12};
		System.out.println("the combination of digits which make the sum  17 is ");
		List <Integer> l = sum(arr);
		Set<Integer> s= new HashSet<>();
		s.addAll(l);
		for (int i : s) {
			System.out.println(s);
		}

	}

}
