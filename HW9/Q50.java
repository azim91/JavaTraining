import java.time.LocalDate;

public class Q50 {
	public static void main(String[] args) {
		LocalDate xmas = LocalDate.of(2016, 12, 25);
		xmas.withYear(2017);
		System.out.println(xmas.getYear());
	}
}
