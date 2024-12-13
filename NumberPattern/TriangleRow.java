//5
//     1 
//    222 
//   33333 
//  4444444 
// 555555555

import java.util.Scanner;

public class TriangleRow {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for(int i=0; i<num; i++) {
			for(int j=i; j<num; j++) {
				System.out.print(" ");
			}
			for(int j=0; j<=i; j++) {
				System.out.print(i+1);
			}
			for(int j=0; j<=i-1; j++) {
				System.out.print(i+1);
			}
			System.out.println(" ");
		}
	}

}
