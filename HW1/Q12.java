package HW1;

public class Q12 {
	int birds = 10;  //statik de�il

	public static void main(String[] data) {   ///statik
		int trees = 5;
		System.out.print(trees + birds);
	}
}

/*
Main () method statiktir ve herhangi bir class insteance de�i�keine eri�imi yoktur. 
Birds de�i�keni statik de�ildir ve eri�mek i�in class instance gerektirir. 
Bu nedenle, statik s�n�f�n bir �rne�i olmadan statik olmayan bir de�i�kene eri�meye �al��t���nda kod derlenmez. 
 */
