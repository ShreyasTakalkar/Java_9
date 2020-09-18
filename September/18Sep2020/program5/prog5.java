import java.io.*;

class Factorial {

	public static void main(String[] args) throws IOException {
		
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(input);

		System.out.println("Enter first number");
		int num1 = Integer.parseInt(br.readLine());

		System.out.println("Enter last number");
		int num2 = Integer.parseInt(br.readLine());

		for(int i = num1; i <= num2; i++) {

			int fact = 1;
			int temp = i;

			while(temp > 0) {

				fact = fact * temp;
				temp--;
			}

			System.out.println("Factorial of " + i + " is " + fact);

		}
	}
}