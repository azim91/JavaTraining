package city;

public class Street {
	public static void dancing() throws RuntimeException { 
		try { 
			throw new IllegalArgumentException(); 
			} catch (Error) { 
				System.out.print("Unable!"); 
				} }

	public static void main(String... count) throws RuntimeException {
		dancing();
	}
}