package castles;

public class Citadel {
	public void openDrawbridge() throws RuntimeException { // q1
		try {
			throw new KnightAttackingException();
		} catch (Exception e) {
			throw new ClassCastException();
		} finally {
			throw new CastleUnderSiegeException(); // q2  bu exception throws edilmediði için tanýnmýyor
		}
	}

	public static void main(String[] moat) {
		new Citadel().openDrawbridge(); // q3
	}
}