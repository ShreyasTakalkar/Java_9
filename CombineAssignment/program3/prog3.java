import java.util.*;

class Occurrence {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter any number");
		int num = sc.nextInt();

		System.out.println("Enter number to check its occurrence");
		int check = sc.nextInt();

		int temp = num;
		int count= 0,rem;

		while(temp != 0) {

			rem = temp % 10;
			if(rem == check) {

				count++;
			}
			temp /= 10;
		}

		System.out.println("Occurrence of digit " + check + " in number " + num + " is " + count);
	}
}