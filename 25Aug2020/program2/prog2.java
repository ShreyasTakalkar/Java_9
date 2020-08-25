import java.io.*;

class InputInt {

	public static void main(String[] args) throws IOException {
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.println("Enter a number");
		int num = Integer.parseInt(br.readLine());
		int sum = 0;

		for(int i = 1; i <= num; i++) {

			sum += i;
		}

		System.out.println("The sum of numbers upto " + num + " is " + sum);

	}
}	