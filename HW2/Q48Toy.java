

public class Q48Toy {
public void play() {
System.out.print("play-");
}
public void finalize() {
System.out.print("clean-");
}
public static void main(String[] args) {
	Q48Toy car = new Q48Toy();
car.play();
System.gc();
Q48Toy doll = new Q48Toy();
doll.play();
}
}