package Matrix_2D;

public class Main {

	public static void main(String[] args) {
		int[][] matrix = new int[100][50];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = (int) (Math.random() * 2);
				System.out.print(matrix[i][j]);
			}
			System.out.println();
		}
	}
}
