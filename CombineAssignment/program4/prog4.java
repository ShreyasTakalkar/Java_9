import java.util.*;

class GreatestSecond {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter three numbers");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		if(a >= b && a <= c || a <= b && a >= c) {

			System.out.println("Second largest number is " + a);
		
		}else if(b >= a && b <= c || b <=a && b >= c) {

			System.out.println("Second largest number is " + b);
		
		}else if(c >= a && c <= b || c <= a && c >= b) {

			System.out.println("Second largest number is " + c);
		}

	}
}