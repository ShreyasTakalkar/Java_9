import java.util.*;

class UpperLower {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter any character");
		char ch = sc.next().charAt(0);

		if(ch >= 65 && ch <= 90) {

			System.out.println("Letter "+ ch + " is in uppercase");
		
		}else if(ch >= 97 && ch <= 122) {

			System.out.println("Letter "+ ch + " is in lower");
		
		}else {

			System.out.println("Enter proper character");
		}

	}
}