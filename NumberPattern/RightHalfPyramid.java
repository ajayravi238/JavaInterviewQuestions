//5
//1  
//1 2  
//1 2 3  
//1 2 3 4  
//1 2 3 4 5

import java.util.Scanner;

public class RightHalfPyramid {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();
			for(int i=0; i<num; i++) {
				for(int j=0; j<=i; j++) {
					System.out.print(j+1 + " ");
				}
				System.out.println(" ");
			}
		}	
}
