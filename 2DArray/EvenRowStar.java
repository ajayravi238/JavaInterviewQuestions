import java.util.*;

public class EvenRowStar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[][] arr2 = new int[num][num];
		for(int i=0; i<num; i++) {
			for(int j=0; j<num; j++) {
				arr2[i][j] = sc.nextInt();
			}
		}
		for(int i=0; i<num; i++) {
			for(int j=0; j<num; j++) {
				if(i%2!=0) {
					System.out.print("*" + " ");
				}
				else {
					System.out.print(arr2[i][j] + " ");
				}
			}
			System.out.println();
		}
	}
}
