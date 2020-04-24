
public class Q46Person {
	public Q46Person youngestChild;

	public static void main(String... args) {
		Q46Person elena = new Q46Person();
		Q46Person diana = new Q46Person();
		elena.youngestChild = diana;
		diana = null;
		Q46Person zoe = new Q46Person();
		elena.youngestChild = zoe;
		zoe = null;
	}
}