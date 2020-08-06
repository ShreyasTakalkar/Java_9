import java.util.*;

class Reverse {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter any number");
		int num = sc.nextInt();

		for(int i = num; i >= 0; i--) {

			System.out.print(i + ",");

		}
		System.out.println();

		System.out.print("Divisible by 5 is ");
		for(int i = num; i >= 0; i--) {

			if(i % 5 == 0) {

				System.out.print(i + ",");
			}
		}
	}
}