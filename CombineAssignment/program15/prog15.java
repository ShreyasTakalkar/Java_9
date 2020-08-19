import java.util.*;

class StepsToZero {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int num = sc.nextInt();
		int temp = num;
		int count = 0;

		while(temp != 0) {

			count++;
			temp /= 2;
		}

		System.out.println("Steps required to reduce " + num + " to zero = " + count );
	}
}