import java.util.Scanner;
public class OddPositionString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] res = str.split(" ");
		for(int i=0; i<res.length; i++) {
			if(i%2==0) {
				System.out.println(res[i]);
			}
		}
	}
}
