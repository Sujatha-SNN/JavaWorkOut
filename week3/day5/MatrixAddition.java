package workout.week3.day5;

public class MatrixAddition {
/**
 * 2. Write a java program to add to matrices
Matrices 1:
1 2 3 
4 5 6 
7 8 9 
Matrices 2:
9 8 7 
6 5 4 
3 2 1 
Solution: 
10 10 10 
10 10 10 
 * 
 * */
	public static void main(String[] args) {
		int mat1[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int mat2[][] = { { 9, 8, 7 }, { 6, 5, 4 }, { 3, 2, 1 } };
		for (int i = 0; i < mat1.length; i++) {
			System.out.println("\n");
			for (int j = 0; j < mat1.length; j++) {
				System.out.print( mat1[i][j] + mat2[i][j]);
				System.out.print(" ");
			}
		}
	}

}
