
public class Q50 {
	public static String play(int toy, int age) {
		final String game;
		if (toy < 2)
			game = age > 1 ? 1 : 10; // p1
		// Type mismatch: cannot convert from int to String
		else
			game = age > 3 ? "Ball" : "Swim";// p2
		return game;
	}

	public static void main(String[] args) {
		System.out.print(play(5, 2));

	}
}
