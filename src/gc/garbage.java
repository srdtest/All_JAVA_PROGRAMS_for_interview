package gc;

public class garbage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Runtime rs = Runtime.getRuntime();
System.out.println("free memory in JVM before gc " +rs.freeMemory());

rs.gc();
System.out.println("free memory in JVM after gc " +rs.freeMemory());
	}

}
