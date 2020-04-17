package HW1;

public class Q27 {

	public static void main(String... args) {
		String chair, table = "metal";   //table = "metal" olarak bir baþlangýc degeri verilmiþtir 
		chair = chair + table;           //ama String chair baslangýc degerine sahip deðildir. Bu yüzden kod derlenmeyecektir.
		System.out.println(chair);
		}
	
}


