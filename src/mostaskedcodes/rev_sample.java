package mostaskedcodes;

public class rev_sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "hi hello how are you";
		char[] ch = str.toCharArray();
		int left=0;
		int right = ch.length-1;
		
		while(left<right) {
			char temp=ch[left];
			ch[left]=ch[right];
			ch[right]=temp;
			left ++;
			right --;
		}
		System.out.println(ch);
	}

}
