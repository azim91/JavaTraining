package HW1;

public class Q44 {
private boolean numLock = true;
static boolean capLock = false;
public static void main(String... shortcuts) {
System.out.print(numLock+""+capLock);  
//numLock degiskeni static olmadigi icin static olan bir method da calisamaz.
//"Cannot make a static reference to the non-static field numLock"
}
}