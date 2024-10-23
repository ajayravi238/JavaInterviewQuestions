import java.util.Scanner;

public class FirstLetterCaps {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] arr = str.split(" ");
		for(int i=0; i<arr.length; i++) {
			char res = arr[i].charAt(0);
			System.out.print((char)(res-32));
			System.out.print(arr[i].substring(1, arr[i].length()) + " ");
		}
	}

}
