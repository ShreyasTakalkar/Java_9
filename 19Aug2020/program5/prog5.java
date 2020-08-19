import java.util.*;

class Triangle {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter three sides of a triangle");

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int sum = a + b + c;

		if(sum == 180) {

			System.out.println("Triangle with sides " + a + " " + b + " & " + c + " is valid one");

		}else

			System.out.println("Triangle with sides " + a + " " + b + " & " + c + " is invalid one");
	}
}