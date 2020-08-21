import java.util.*;

class ValASCII {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter any Character");
		char ch = sc.next().charAt(0);
		int intChar = ch;

		System.out.println("ASCII value of " + ch + " is " + intChar);
	}
}