import java.util.*;

class Prime {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number");
		int num = sc.nextInt();
		int flag = 1;

		for(int i = 2; i <= num/2; i++) {

			if(num % i == 0) {

				flag = 0;
				break;
			}
		}
		if(flag == 1) {

			System.out.println(num + " is a prime number");
		}else
			System.out.println(num + " is not a prime number");
	}
}