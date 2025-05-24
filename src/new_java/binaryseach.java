package new_java;

import java.util.Arrays;
import java.util.Scanner;

public class binaryseach {
	
	public static int[] sort(int[] arr) {
		
		Arrays.sort(arr);
		
		
		return arr;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
		
		System.out.println("enter howmany elements ");
		int n=sc.nextInt();
		
		int[] array = new int[n];
		System.out.println("enter "+n+" elements ");
		for(int i=0;i<n;i++) {
			array[i] = sc.nextInt();
		}
			System.out.println("enter the value for search");
			int search = sc.nextInt();
			sort(array);
			for(int k=0;k<array.length;k++) {
				System.out.println(array[k]);
			}
			
			int first =0 ;
			int last =n-1;
			
			int middle =first+last/2;
			
		if(array[middle]<search) {
			last= middle-1;
			
		}
			
			
			
			
			
			
			
	}

}
