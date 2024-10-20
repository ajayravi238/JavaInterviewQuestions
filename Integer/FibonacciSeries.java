import java.util.Scanner;
public class FibonacciSeries {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int num = sc.nextInt();
	    int first = 0, second = 1, next = 0;
	    System.out.print(first + " " + second + " ");
	    for(int i=2; i<num; i++) {
	        next = first + second;
	        System.out.print(next + " ");
	        first = second;
	        second = next;
	    }
	}
}
