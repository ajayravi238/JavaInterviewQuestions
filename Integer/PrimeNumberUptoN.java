import java.util.Scanner;

public class PrimeNumberUptoN {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for(int i=0; i<=num; i++) {
			if(isPrime(i))
			System.out.println(i);
		}
	}
	public static boolean isPrime(int num) {
		if(num == 0 || num == 1) {
			return false;
		}
		for(int i=2; i<num; i++) {
			if(num%i==0) {
				return false;
			}
		}
			return true;
	}

}
