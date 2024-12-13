//5
//1 2 3 4 5  
//1 2 3 4  
//1 2 3  
//1 2  
//1 

import java.util.Scanner;

public class RightHalfPyramidCol1 {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();
			for(int i=0; i<num; i++) {
				int k=1;
				for(int j=i; j<num; j++) {
					System.out.print(k + " ");
					k++;
				}
				System.out.println(" ");
			}
		}
}
