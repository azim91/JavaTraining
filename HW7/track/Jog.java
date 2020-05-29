package track;

interface Jog {
	default void walk() {
		System.out.print("Walking and jogging!");
	}
}
