import java.util.Scanner;
public class EvenLengthString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] res = str.split(" ");
		for(int i=0; i<res.length; i++) {
			if(res[i].length()%2==0) {
				System.out.println(res[i]);
			}
		}
	}
}
