import java.util.function.Predicate;

public class Q28 {
	public static void main(String[] args) {
		Predicate dash = c -> c.startsWith("-");
		// The method startsWith(String) is undefined for the type Object
		System.out.println(dash.test("–"));
	}
}
