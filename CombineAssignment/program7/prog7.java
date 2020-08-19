import java.util.*;

class Lowest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 3 numbers");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		if(a <= b && a <= c) {

			System.out.println("Minimum number from " + a + " " + b + " " + c + " is " + a);
		
		}else if(b <= a && b <= c) {

			System.out.println("Minimum number from " + a + " " + b + " " + c + " is " + b);
		
		}else
			System.out.println("Minimum number from " + a + " " + b + " " + c + " is " + c);
	}
}