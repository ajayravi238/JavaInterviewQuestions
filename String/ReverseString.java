import java.util.Scanner;
public class ReverseString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String s = "";
		for(int i=str.length()-1; i>=0; i--) {
			s += str.charAt(i);
		}
		System.out.println(s);
	}
}
