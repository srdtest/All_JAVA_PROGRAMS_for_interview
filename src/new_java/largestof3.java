package new_java;

import java.util.Scanner;

public class largestof3 {
	
	
	
	public static void large() {
		
		Scanner sc = new Scanner(System.in);
		int x= sc.nextInt();
		int y =sc.nextInt();
		int z= sc.nextInt();
		
		
		if(x>y && x>z) {
			System.out.println(" larger is" +x);
		}
		else if(y>z) {
			System.out.println(" greater is "+y);
		}
		else {
			System.out.println(" greater"+z);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		large();
		
		
	}

}
