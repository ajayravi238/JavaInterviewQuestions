import java.util.*;
public class PrintConsonants {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String res = "";
		for(int i=0; i<str.length(); i++) {
			if(!(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || 
					str.charAt(i) == 'u' || str.charAt(i) == 'A' || str.charAt(i) == 'E' || 
					str.charAt(i) == 'I' || str.charAt(i) == 'O' || str.charAt(i) == 'U'))
					{
				res += str.charAt(i);
			}
		}
		System.out.println(res);
	}
}
