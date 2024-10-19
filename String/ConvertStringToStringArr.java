import java.util.Arrays;
import java.util.Scanner;
public class ConvertStringToStringArr {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] res = str.split(" ");
		System.out.println(Arrays.toString(res));
	}
}
