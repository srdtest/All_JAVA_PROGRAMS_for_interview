package new_java;

import java.util.Scanner;

public class reva {

	
	
	
	
	public static int rev(int n) {
	int rev = 0;
	
		while(n>0) {
		int r= n%10;
		rev= rev*10+r;
		n= n/10;
		}
		return rev;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
	int reverse = rev(n);
		
		if(reverse==n) {
			System.out.println("palindrome");
			
		}
		else
		{System.out.println("not a palindrome");
		
		
	}
	}
}
