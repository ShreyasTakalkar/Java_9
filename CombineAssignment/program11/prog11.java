import java.util.*;

class Divisors {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number");
		int num = sc.nextInt();

		System.out.print("Perfect Divisors of " + num );

		for(int i = 2; i <= num/2; i++) {

			if(num % i == 0) {

				System.out.print(" " + i);
			}
		}
		System.out.println();
	}
}