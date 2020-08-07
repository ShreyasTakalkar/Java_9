import java.util.*;

class Average {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter any number");

		int num = sc.nextInt();

		int avg, sum = 0, temp;
		int cnt = 0, rem;
		temp = num;

		while(num != 0) {

			rem = num % 10;
			sum = sum + rem;
			cnt++;
			num = num / 10;

		}
		avg = sum / cnt;

		System.out.println("The Average of digits from number " + temp + " is " + avg);
	}
}