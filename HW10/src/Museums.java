
import java.util.*;

public class Museums {
	public static void main(String[] args) {
		String[] array = { "Natural History", "Science", "Art" };
		List<String> museums = Arrays.asList(array);
		museums.remove(2);
		//cal�st�r�ld�g�nda yukar�dak� sat�rdan dolay� hata akl�n�yor. kaynak bulamama sorunu
		
		System.out.println(museums);
	}
}