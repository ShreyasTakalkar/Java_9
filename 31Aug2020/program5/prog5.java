import java.io.*;

class Divisors {

	public static void main(String[] args) throws IOException {
		
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(input);

		System.out.println("Enter number");
		int num = Integer.parseInt(br.readLine());

		System.out.print("Perfect Divisors of " + num + " : ");

		for(int i = 2; i <= num/2; i++) {

			if(num % i == 0) {

				System.out.print(" " + i);
			}
		}
		System.out.println();
	}
}