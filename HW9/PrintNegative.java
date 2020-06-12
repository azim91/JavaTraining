import java.util.*;
import java.util.function.*;

public class PrintNegative {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("-5");
		list.add("0");
		list.add("5");
		print(list, e -> e < 0);
	}

	public static void print(List<String> list, Predicate<Integer> p) {
		for (String num : list)
			if (p.test(num))
				// The method test(Integer) in the type Predicate<Integer> is not applicable for
				// the arguments (String)
				System.out.println(num);
	}
}