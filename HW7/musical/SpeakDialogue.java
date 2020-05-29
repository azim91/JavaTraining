package musical;

interface SpeakDialogue {
	default int talk() {
		return 7;
	}
}

interface SingMonologue {
	default int talk() {
		return 5;
	}
}
