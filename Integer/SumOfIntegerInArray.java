import java.util.Scanner;

public class SumOfIntegerInArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr = new int[size];
		int sum = 0;
		for(int i=0; i<size; i++) {
			arr[i] = sc.nextInt();
		}
		for(int i=0; i<size; i++) {
			sum += arr[i];
		}
		System.out.println(sum);
	}

}
