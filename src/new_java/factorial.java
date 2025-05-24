package new_java;

import java.util.Scanner;

public class factorial {

		public static int facte(int n) {
					
				int fact=1;
				while(n>0) {
					
						fact=fact*n;
						n=n-1;
					}
				return fact;
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
	       int  n= sc.nextInt();
		System.out.println(facte(n));
	}
		
	
	

}


