import java.util.*;

class Pythagorean {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter three sides of triangle");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int sqA = a * a;
		int sqB = b * b;
		int sqC = c * c;

		if(a <= 0 || b <= 0 || c <= 0) {

			System.out.println("Enter proper sides");
		
		}else if(sqA == sqB + sqC || sqB == sqC + sqA || sqC == sqA + sqB) {

			System.out.println("Triangle satisfies the Pythagorean Theorem");
		}else
			System.out.println("Triangle does not satisfy the Pythagorean Theorem");

	}
}