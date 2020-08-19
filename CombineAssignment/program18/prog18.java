import java.util.*;

class Reverse{

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number");
		int num = sc.nextInt();
		int temp = num, rem;

		System.out.println("Before reverse : " + num);
		System.out.print("After reverse : ");

		while(temp != 0) {

			rem = temp % 10;
			System.out.print(rem);
			temp /= 10;
		}
		System.out.println();
	}
}