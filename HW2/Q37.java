
public class Q37 {
	public String first = "instance";

	public Q37() {
		first = "constructor";
	}

	{  // instance initialization block”  obje her instantiate edildiðinde çalýsýr.
		first = "block";
	}

	public void print() {
		System.out.println(first);
	}

	public static void main(String... args) {
		new Q37().print();
	}
}