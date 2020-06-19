
package fly;

public class Helicopter {
 public int adjustPropellers(int length, String[] type) {
 length++;
 type[0] = "LONG";
 return length;
 }
 public static void main(String[] climb) {
 final Helicopter h = new Helicopter();
 int length = 5;
 String[] type = new String[1];
 length = h.adjustPropellers(length, type);
 System.out.print(length+","+type[0]);
 }
}