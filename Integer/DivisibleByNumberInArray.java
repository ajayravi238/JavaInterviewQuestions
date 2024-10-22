import java.util.Scanner;

public class DivisibleByNumberInArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int size = sc.nextInt();
		int[] arr = new int[size];
		for(int i=0; i<size; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("These are the numbers divisible by " + num);
		for(int i=0; i<size; i++) {
			if(arr[i]%num == 0) {
				System.out.println(arr[i]);
			}
		}
	}

}
