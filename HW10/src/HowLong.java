import java.time.*;
import java.time.format.*;

public class HowLong {
	public void main(String h) {
		LocalDate newYears = new LocalDate(2017, 1, 1);
		Period period = Period.ofYears(1).ofDays(1);
		DateTimeFormat format = DateTimeFormat.ofPattern("MM-dd-yyyy");
		System.out.print(format.format(newYears.minus(period)));
	}
}