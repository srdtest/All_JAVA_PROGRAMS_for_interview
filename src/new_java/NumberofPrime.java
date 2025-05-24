package new_java;

import java.util.Scanner;

public class NumberofPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int  i;int cnt=1;int num=3;int status =1;boolean flag=false;
		
		for (int j=3; j<100;j++) {
		for ( i=2;i<j/2;i++) {
			if(j%i==0) {
				
				break;
			}
			
		
		}
		if(flag==false) {
			
			System.out.println(j);
		}
		
		}
		}
	}
		

		

