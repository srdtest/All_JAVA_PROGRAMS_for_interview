package mostaskedcodes;

public class Sumofelementsinarray {

	public static void main(String[] args) {
		int num[] = {1,5,8,6,10,9};
		int len = num.length;
		int count=0;
		int sum=0;
		for(int i=0;i<len;i++) {
			count++;
			sum= sum+num[i];
			
		}
		System.out.println(count);
		System.out.println(sum);

	}

}
