public class ConsonantsPresent {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String res = "";
		int bool = 0;
		res = str.toLowerCase();
		for(int i=0; i<str.length(); i++) {
			if(!(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u')) {
				bool = 1;
			}
		}
		if(bool == 1) {
			System.out.println("yes");
		}
		else {
			System.out.println("No");
		}
	}
}
