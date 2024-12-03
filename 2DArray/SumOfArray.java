import java.util.*;

public class SumOfArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[][] arr1 = new int[num][num];
		for(int i=0; i<num; i++) {
			for(int j=0; j<num; j++) {
				arr1[i][j] = sc.nextInt();
			}
		}
		int[][] arr2 = new int[num][num];
		for(int i=0; i<num; i++) {
			for(int j=0; j<num; j++) {
				arr2[i][j] = sc.nextInt();
			}
		}	
		int[][] sum = new int[num][num];
		for(int i=0; i<num; i++) {
			for(int j=0; j<num; j++) {
				sum[i][j] = arr1[i][j] + arr2[i][j];
			}
		}
		for(int i=0; i<num; i++) {
			for(int j=0; j<num; j++) {
				System.out.print(sum[i][j] + " ");
			}
			System.out.println();
		}
	}

}
