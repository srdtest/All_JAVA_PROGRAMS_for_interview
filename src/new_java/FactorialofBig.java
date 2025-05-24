package new_java;

import java.math.BigInteger;
import java.util.Scanner;

public class FactorialofBig {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc= new Scanner(System.in);
		int  n= sc.nextInt();
		
		BigInteger inc=new BigInteger("1");
		BigInteger fact=new BigInteger("1");
		
		
		for (int i=1;i<n;i++) {
			fact=fact.multiply(inc);
			inc= inc.add(BigInteger.ONE);
		}
		System.out.println(fact);
	}

}
