package HW1;

public class Q12 {
	int birds = 10;  //statik deðil

	public static void main(String[] data) {   ///statik
		int trees = 5;
		System.out.print(trees + birds);
	}
}

/*
Main () method statiktir ve herhangi bir class insteance deðiþkeine eriþimi yoktur. 
Birds deðiþkeni statik deðildir ve eriþmek için class instance gerektirir. 
Bu nedenle, statik sýnýfýn bir örneði olmadan statik olmayan bir deðiþkene eriþmeye çalýþtýðýnda kod derlenmez. 
 */
