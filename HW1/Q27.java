package HW1;

public class Q27 {

	public static void main(String... args) {
		String chair, table = "metal";   //table = "metal" olarak bir ba�lang�c degeri verilmi�tir 
		chair = chair + table;           //ama String chair baslang�c degerine sahip de�ildir. Bu y�zden kod derlenmeyecektir.
		System.out.println(chair);
		}
	
}


