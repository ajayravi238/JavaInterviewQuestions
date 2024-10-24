import java.util.Scanner;

public class PrintOddAndEven {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] num = new int[size];
		for(int i=0; i<size; i++) {
			num[i] = sc.nextInt();
		}
		System.out.println("Even numbers present in array are: ");
		for(int i=0; i<size; i++) {
			if(num[i]%2==0) {
				System.out.println(num[i]);
			}
		}
		System.out.println("Odd numbers present in array are: ");
		for(int i=0; i<size; i++) {
			if(num[i]%2!=0) {
				System.out.println(num[i]);
			}
		}
	}

}
