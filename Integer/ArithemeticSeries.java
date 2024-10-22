import java.util.Scanner;

public class ArithemeticSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numOfElement = sc.nextInt();
		int firstTerm = sc.nextInt();
		int diff = sc.nextInt();
		int sum = 0;
		for(int i=0; i<numOfElement; i++) {
			sum = firstTerm;
			System.out.println(sum);
			sum += diff;
			firstTerm = sum;
		}
	}

}
