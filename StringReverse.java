import java.util.Scanner;
public class StringReverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		for(int i=str.length(); i>=0; i--) {
			System.out.println(str.charAt(i));
		}
	}
}
