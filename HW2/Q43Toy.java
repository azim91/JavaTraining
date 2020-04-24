
public class Q43Toy {
	public void play() {
		System.out.print("play-");
	}

	public void finalizer() {
		System.out.print("clean-");
	}

	public static void main(String[] fun) {
		Q43Toy car = new Q43Toy();
		car.play();
		System.gc();
		Q43Toy doll = new Q43Toy();
		doll.play();
	}
}