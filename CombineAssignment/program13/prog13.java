import java.util.*;

class NeonNum {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number");
		int num = sc.nextInt();

		int sqr = num * num;
		int temp = sqr;
		int sum = 0, rem;

		while(temp != 0) {

			rem = temp % 10;
			sum += rem;
			temp /= 10;

		}
		if(sum == num) {

			System.out.println(num + " is a Neon number");
		}else
			System.out.println(num + " is not a Neon number");
	}
}