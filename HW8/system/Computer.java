package system;
public class Computer {
	public void compute() throws Exception {
		throw new RuntimeException("Error processing request");
	}

	public static void main(String[] bits) {
		try {
			new Computer().compute();
			// Unhandled exception type Exception 
			System.out.print("Ping");
		} catch (NullPointerException e) {
			System.out.print("Pong");
			throw e;
		}
	}
}
