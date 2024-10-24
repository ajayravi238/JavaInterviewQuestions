import java.util.Arrays;
import java.util.Scanner;

public class SortTheArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr = new int[size];
		for(int i=0; i<size; i++) {
			arr[i] = sc.nextInt();
		}
		for(int i=0; i<size; i++) {
			for(int j=0; j<size-1; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
