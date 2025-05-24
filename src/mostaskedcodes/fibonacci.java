package mostaskedcodes;

import java.util.ArrayList;
import java.util.List;

public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l = new ArrayList();
		int n=10;
		int num1=0;int num2=1;
		l.add(num1);
		l.add(num2);
		for(int k =2;k<n;k++) {
			int num3= num1+num2;
			num1=num2;num2=num3;
			System.out.println(num3);
			l.add(num3);
		}
		System.out.println(l);

	}

}
