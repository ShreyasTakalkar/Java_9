import java.util.*;

class Check {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter any character");

		char ch = sc.next().charAt(0);

		if(ch >= 65 && ch <= 90 || ch >= 97 && ch <= 122) {

			System.out.println(ch + " is an alphabate");

		}else if(ch >= 48 && ch <= 57) {

			System.out.println(ch + " is a number");

		}else if(ch >= 33 && ch <= 47) {

			System.out.println(ch + " is a special character");
		}
	}
		

}