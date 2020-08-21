import java.io.*;

class ArithmaticSwitch {

	public static void main(String[] args) throws IOException {
		
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(input);

		System.out.println("Enter number");
		int num = Integer.parseInt(br.readLine());

		System.out.print("Perfect divisors of " + num + " are : ");

		for(int i = 1; i <= num/2; i++) {

			if(num % i == 0) {

				System.out.print(i + " ");
			}
		}
		System.out.println();

	}
}