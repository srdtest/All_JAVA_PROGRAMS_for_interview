package new_java;

import java.util.Scanner;

public class linearsearch {

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
			for(int j=0;j<n;j++) {
			if(array[j]==search) {
				System.out.printf("element found at %d location ",j+1);
				break;
			}
			}
			
		}
	}
		


		
	


