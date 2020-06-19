
import java.util.*;

public class Museums {
	public static void main(String[] args) {
		String[] array = { "Natural History", "Science", "Art" };
		List<String> museums = Arrays.asList(array);
		museums.remove(2);
		//calýstýrýldýgýnda yukarýdaký satýrdan dolayý hata aklýnýyor. kaynak bulamama sorunu
		
		System.out.println(museums);
	}
}