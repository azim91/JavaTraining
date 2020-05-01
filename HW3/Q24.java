
public class Q24 {
	public static void main(String[] args) {
		int flavors = 30;
		int eaten = 0;
		switch (flavors) {
		case 30: //break konulmadıgı için sırayla hepsine girecek
			eaten++; // eaten 1 oldu
		case 40:
			eaten += 2; // eaten 3 oldu
		default:
			eaten--; //eaten 2 oldu
		}
		System.out.println(eaten);
	}
}
