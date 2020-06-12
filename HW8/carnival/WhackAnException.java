package carnival;

public class WhackAnException {
	public static void main(String... hammer) {
		try {
			System.out.println("azim1");
			throw new ClassCastException();
		} catch (IllegalArgumentException e) {
			System.out.println("azim2");
			throw new IllegalArgumentException();
		} catch (RuntimeException e) {
			System.out.println("azim3");
			throw new NullPointerException();
		} finally {
			System.out.println("azim4");
			throw new RuntimeException();
			
		}
	}
}