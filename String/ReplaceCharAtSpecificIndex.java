import java.util.Scanner;

public class ReplaceCharAtSpecificIndex {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String s = "";
		int index = sc.nextInt();
		char ch = sc.next().charAt(0);
		if(index==0) {
			s += ch;
			s += str.substring(1);
		}
		else {
			s += str.substring(0, index-1);
			s += ch;
			s += str.substring(index);
		}
		System.out.println(s);
	}

}
