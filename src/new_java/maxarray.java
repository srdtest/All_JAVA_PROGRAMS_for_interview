package new_java;

public class maxarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] numbers = {1,2,3,4,7,12};
		int max=numbers[0];
		for (int num : numbers) {
			if (num>max) {
				max=num;
			}
			
		}
		System.out.println("tha maximum number is "+max);
	}

}
