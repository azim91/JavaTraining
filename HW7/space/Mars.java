package space;

public class Mars extends Sphere implements Planet {
	public Mars() {
		super();
	}

	public String getName() {
		return "Mars";
	}

//	public static void main(final String[] probe) {
//		System.out.print(((Planet) new Mars()).getName());
//	}
}
