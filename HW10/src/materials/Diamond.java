package materials;
import java.io.*;

public class Diamond extends CarbonStructure {
 public Diamond() { super(15); }
 public Long getCount() throws FileNotFoundException { // q2
 return count;
 }
 public static void main(String[] cost) {
 try {
 final CarbonStructure ring = new Diamond(); // q3
 System.out.print(ring.getCount()); // q4
 } catch (IOException e) {
 e.printStackTrace();
 }
 }
}