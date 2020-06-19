
package fun;

import java.util.ArrayList;
import java.util.List;

public class Sudoku {
	static int[][] game;

	public static void main(String args[]) {
		game[3][3] = 6;
		//üsteki satýr yüz<ünden nullpointer xception
		Object[] obj = game;
		obj[3] = 'X';
		System.out.println(game[3][3]);
	}
		
}
