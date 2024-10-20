import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if(num == 0 || num == 1) {
			System.out.println(num + " is not a Prime");
			return;
		}
		int f = 0;
		for(int i=2; i<num; i++) {
			if(num%i==0) {
				System.out.println(num + " is not a Prime");
				f = 1;
			}
		}
		if(f==0) {
			System.out.println(num + " is a Prime");
		}
	}

}
