import java.util.Scanner;
public class MultiplyTable {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int table = sc.nextInt();
		int toNum = sc.nextInt(); 
		int mul = 1;
		for(int i=1; i<=toNum; i++) {
			mul = table * i;
			System.out.println(table + " " + "x" + " " + i + " " + "=" + " " + mul);
		}
	}
}
