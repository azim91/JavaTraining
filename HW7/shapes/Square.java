package shapes;

public final class Square extends Rectangle {
	public int getEqualSides() {
		return 4;
	} // x2

	public static void main(String[] corners) {
		final Square myFigure = new Square(); // x3
		System.out.print(myFigure.getEqualSides());
	}
}