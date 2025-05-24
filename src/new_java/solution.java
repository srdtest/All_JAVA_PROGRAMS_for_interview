package new_java;

import java.util.Scanner;

public class solution {
	
	static Scanner sc = new Scanner(System.in);
	static int B = sc.nextInt();
	static int H = sc.nextInt();
	static boolean flag;
	 public static void peru() {
		try {
			if (B > 0 && H > 0) {
				flag = true;
			} else {
				throw new Exception("Breadth and height must be positive");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("perimeter is "+B*H);
		
	}

}
