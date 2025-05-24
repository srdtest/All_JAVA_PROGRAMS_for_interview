package mostaskedcodes;



	
	import java.util.stream.Stream;

	public class stream_test {
	   public static void main(String[] args) {
		   car car = (distance) -> System.out.println("distance is "+distance);
		   car.run(20);
	   }
	   
	   
	   @FunctionalInterface 
	   interface car {
		   void run(int distance);
	   }
	}
	   
