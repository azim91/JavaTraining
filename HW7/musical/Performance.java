package musical;

public class Performance implements SpeakDialogue, SingMonologue {
	public int talk(String... x) {
		return x.length;
	}

	public static void main(String[] notes) {
		System.out.print(new Performance().talk(notes));
	}
}
