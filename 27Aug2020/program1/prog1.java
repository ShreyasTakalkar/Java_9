import java.io.*;

class AddSub {

	public static void main(String[] args) throws IOException {
		
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(input);

		System.out.println("Enter two numbers");
		int num1 = Integer.parseInt(br.readLine());
		int num2 = Integer.parseInt(br.readLine());

		int sum = num1 + num2;

		System.out.println("Addition is " + sum);

		int diff = (num1 > num2) ? num1 - num2 : num2 - num1;

		System.out.println("Subtraction is " + diff);
	}
}