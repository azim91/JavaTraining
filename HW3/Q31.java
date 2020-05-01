
public class Q31 {
	public static void main(String[] args) {
		String bob = new String("bob");
		String notBob = bob;
		System.out.print((bob == notBob) + " " + (bob.equals(notBob)));

	}
}
