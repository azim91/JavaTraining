
package fun;

import java.util.ArrayList;
import java.util.List;

public class Sudoku {
	static int[][] game;

	public static void main(String args[]) {
		game[3][3] = 6;
		//�steki sat�r y�z<�nden nullpointer xception
		Object[] obj = game;
		obj[3] = 'X';
		System.out.println(game[3][3]);
	}
		
}
