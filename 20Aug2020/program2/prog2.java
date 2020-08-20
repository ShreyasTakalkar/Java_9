import java.util.*;

class SimpleInterest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter principle amount");
		int p = sc.nextInt();

		System.out.println("Enter period in years");
		float n = sc.nextFloat();

		System.out.println("Enter rate of interest");
		float r = sc.nextFloat();

		if(p <= 0 || n <= 0 || r < 0) {

			System.out.println("Enter proper data");
		}

		float interest;
		interest = (p * n * r)/100;

		System.out.println("Simple interest on amount " + p + " for " + n + " years with rate " + r + " is " + interest);
	}
}