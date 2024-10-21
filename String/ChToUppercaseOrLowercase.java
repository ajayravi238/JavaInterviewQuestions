public class ChToUppercaseOrLowercase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ch1 = sc.next().charAt(0);
		char ch2 = sc.next().charAt(0);
//		lower case to upper case
		System.out.println((char)(ch1 - 32));
		
//		upper case to lower case
		System.out.println((char)(ch2 + 32));
	}

}
