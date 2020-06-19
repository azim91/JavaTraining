
package unix;

import java.util.*;

public class EchoFirst {
	public static void main(String[] args) {
		int result = Arrays.binarySearch(args, args[0]);
		System.out.println(result);
	}
}