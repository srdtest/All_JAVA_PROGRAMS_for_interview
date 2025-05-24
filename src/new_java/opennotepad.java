package new_java;

import java.io.IOException;

public class opennotepad {

	public static void main(String[] args) throws IOException {
		
		Runtime rs = Runtime.getRuntime();
		rs.exec("notepad");
	}
}
