
public class Q50Sand {
public Q50Sand() {
System.out.print("a");
}
public void Q50Sand() {
System.out.print("b");
}
public void run() {
new Q50Sand();
Q50Sand();
}
public static void main(String... args) {
new Q50Sand().run();
}
}