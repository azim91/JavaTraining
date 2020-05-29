package paper;

public class Encyclopedia extends Book {
	public static String material = "cellulose";

	public Encyclopedia() {
		super();
	}

	public String getMaterial() {
		return super.material;
	}

	public static void main(String[] pages) {
		System.out.print(new Encyclopedia().getMaterial());
	}
}
