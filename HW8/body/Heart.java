package body;
public class Heart extends Organ {
		public void operate() throws Exception {
			System.out.print("beat");
		}
		//Organ s�n�f�ndan extend edilmi� ve organ s�n�f� runTimeExceptiondan thrown edilmi�ken 
		//thrown exception denilerek  �st s�n�f� thrown edilmeye cal�l��l�yor
		public static void main(String... cholesterol) throws Exception {
			try {
				new Heart().operate();
			} finally {
			}
		}
}