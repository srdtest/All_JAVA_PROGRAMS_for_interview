package new_java;

import java.util.Scanner;

public class Exceptionhandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a; int b; int result = 0;
		Scanner sc = new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		try {
		result= a/b;
		System.out.println(result);
		String[] subs= {"python","java","php","c++"};
		for  (int i=0;i<subs.length;i++) {
			System.out.println(subs[i]);
		}
		}
		catch(Exception e) {
			System.out.println("exception caught"+e);
		}
		finally {
			System.out.println("this is finally block");
		}
		
	}

}
