package examples;

public class MatrixAddition {

	public static void main(String[] args) {
		int[][] matrix1={{1,2},{3,4}}, matrix2, matrix3;

	//	matrix1 = new int[2][2];
		matrix2 = new int[2][2];
		matrix3 = new int[2][2];
		
		int x1[][]= {{1,2},{3,4}};
		
	//	matrix1={{1,2},{3,4}};

		matrix1[0][0] = 1;
		matrix1[0][1] = 2;
		matrix1[1][0] = 3;
		matrix1[1][1] = 4;

		matrix2[0][0] = 1;
		matrix2[0][1] = 2;
		matrix2[1][0] = 3;
		matrix2[1][1] = 4;

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				matrix3[i][j] = matrix1[i][j] + matrix2[i][j];
			}

		}

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print("  "+matrix3[i][j]);
			}
			
			System.out.println();
		}
	}
}
