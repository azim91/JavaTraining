package office;
import java.io.*;
public class Printer {
	public void print() {
		try {
			throw new FileNotFoundException();
		} catch (IOException exception) {
			System.out.print("Z");
		} catch (FileNotFoundException enfe) {
	//Unreachable catch block for FileNotFoundException. It is already handled by the catch block for IOException
			System.out.print("X");
		} finally {
			System.out.print("Y");
		}
	}

	public static void main(String... ink) {
		new Printer().print();
	}
}