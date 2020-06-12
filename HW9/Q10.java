
public class Q10 {
	public static void main(String[] args) {
		StringBuilder line = new StringBuilder("-");
		StringBuilder anotherLine = line.append("-");
		System.out.print(line == anotherLine);
		System.out.print(" ");
		System.out.print(line.length());
	}
}
