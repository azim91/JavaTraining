package Q20;

public class Oxygen extends Element {
	public int getSymbol() {
		return 8;
	} // g2

	public void printData() { 
		try { 
			System.out.print(getSymbol()); 
	}catch
	{ // g3   catch yaz�lm�s ama f�nally gibi kullan�lm��
		System.out.print("Unable to read data");
	}
}
}