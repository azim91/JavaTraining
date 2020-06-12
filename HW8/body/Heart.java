package body;
public class Heart extends Organ {
		public void operate() throws Exception {
			System.out.print("beat");
		}
		//Organ sýnýfýndan extend edilmiþ ve organ sýnýfý runTimeExceptiondan thrown edilmiþken 
		//thrown exception denilerek  üst sýnýfý thrown edilmeye calýlþýlýyor
		public static void main(String... cholesterol) throws Exception {
			try {
				new Heart().operate();
			} finally {
			}
		}
}