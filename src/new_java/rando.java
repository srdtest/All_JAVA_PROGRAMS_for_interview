package new_java;

import java.util.Random;
import java.util.Scanner;

public class rando {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner sca = new Scanner(System.in);
		System.out.println("enter howmany random number you want");
		int n = sca.nextInt();
		Random r  = new Random();
		for (int i=0; i<n;i++) {
						System.out.println(r.nextInt(200));
		}
		
	}

}
