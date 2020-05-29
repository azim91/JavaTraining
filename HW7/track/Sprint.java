package track;

public class Sprint implements Run, Jog {
	
	public void walk() {
		System.out.print("Sprinting!");
	}

	public static void main() {
		new Sprint().walk();
	}
}
