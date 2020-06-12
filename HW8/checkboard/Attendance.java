package checkboard;

public class Attendance {
	private Boolean[] list = // buraya ekleyerek dene .. 

	public int printTodaysCount() {
		int count = 0;
		for (int i = 0; i < 10; i++) {
			if (list[i]) ++count;
		}
		return count;
	}

	public static void main(String[] roster) {
		new Attendance().printTodaysCount();
	}
}