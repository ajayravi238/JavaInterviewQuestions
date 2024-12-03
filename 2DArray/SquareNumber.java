import java.util.Scanner;

public class SquareNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int col = sc.nextInt();
		int[][] arr = new int[row][col];
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		int[][] res = new int[row][col];
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				res[i][j] = arr[i][j] * arr[i][j];
			}
		}
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				System.out.print(res[i][j] + " ");
			}
			System.out.println();
		}
	}

}
