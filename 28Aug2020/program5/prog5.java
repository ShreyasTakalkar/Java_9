import java.io.*;

class Factorial {

	public static void main(String[] args) throws IOException {
		
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(input);

		System.out.println("Enter number");
		int num = Integer.parseInt(br.readLine());

		int fact = 1;
		int temp = num;

		while(temp > 0) {

			fact = fact * temp;
			temp--;
		}

		System.out.println("Factorial of " + num + " is " + fact);
	}
}