import java.util.Scanner;

public class SquareRow {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for(int i=0; i<num; i++) {
			for(int j=0; j<num; j++) {
				System.out.print(i+1);
			}
			System.out.println(" ");
		}
	}

}
