import java.io.*;

class PrimeNum {

	static int count = 0;

	static void is_prime(int num) {

		int flag = 0;

		for(int i = 2; i < num; i++) {

			if(num % i == 0) {

				flag = 1;
				break;
			}
		}
		if(flag == 0) {

			count++;
			System.out.print(num + " ");
		}
	}

	public static void main(String[] args) throws IOException {
		
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(input);

		System.out.println("Enter starting number");
		int a = Integer.parseInt(br.readLine());

		System.out.println("Enter end number");
		int b = Integer.parseInt(br.readLine());

		for(int i = a; i <= b; i++) {
			if(i == 0 || i == 1) {
				continue;
			}

			is_prime(i);
		}
		System.out.println();
		System.out.println("The count is " + count);
	}
}