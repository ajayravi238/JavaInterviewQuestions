import java.util.Scanner;

public class GeometricSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int noOfElement = sc.nextInt();
		int startTerm = sc.nextInt();
		int diff = sc.nextInt();
		int res = 0;
		for(int i=0; i<noOfElement; i++) {
			res = startTerm;
			System.out.println(res);
			res *= diff;
			startTerm = res;
		}
	}
}
