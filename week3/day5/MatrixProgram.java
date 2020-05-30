package workout.week3.day5;

public class MatrixProgram {
/**
 * 1. Write a java program to transpose the matrix.
Actual Matrix
1 2 3 
4 5 6 
7 8 9 
Transposed Matrix
1 4 7 
2 5 8 
3 6 9 
 * 
 */
	public static void main(String[] args) {
		int mat[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		for (int i = 0; i < mat.length; i++) {
			System.out.println("\n");
			for (int j = 0; j < mat.length; j++) {
				System.out.print(" " + mat[j][i]);

			}
		}
	}

}
