package lighting;

public class LightBulb implements Source {
	public void flipSwitch() { 
		try { 
			throws new RuntimeException("Circuit Break!"); 
			// throws deðil throw keyword ü kullanýlmasý gerekiyor
			} finally { 
				System.out.print("Flipped!"); 
				} }

	public static void main(String... electricity) throws Throwable {
		final Source bulb = new LightBulb();
		bulb.flipSwitch();
	}
}