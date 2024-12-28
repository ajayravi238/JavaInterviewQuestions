import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr = new int[size];
		for(int i=0; i<size; i++) {
			arr[i] = sc.nextInt();
		}
		int sum = 0;
		for(int i=0; i<size; i++) {
			sum += arr[i];
		}
		System.out.println(sum/size);
	}
}
