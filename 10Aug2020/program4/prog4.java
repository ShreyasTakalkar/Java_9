import java.util.*;

class Factorial {

	static int fact(int i) {

		int fact = 1;

		for(int j = 1; j <= i; j++) {

			fact = fact * j;
		}

		return fact;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter any number");
		int num = sc.nextInt();

		for(int i = 1; i <= num; i++) {

			System.out.println("Factorial of " + i + " : " + Factorial.fact(i));
		}
	}
}