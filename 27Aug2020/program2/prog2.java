import java.io.*;

class MulDiv {

	public static void main(String[] args) throws IOException {
		
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(input);

		System.out.println("Enter two numbers");
		int num1 = Integer.parseInt(br.readLine());
		int num2 = Integer.parseInt(br.readLine());

		int mul = num1 * num2;

		System.out.println("Multiplication is " + mul);

		float div = (num1 > num2) ? (float)num1 / (float)num2 : (float)num2 / (float)num1;

		System.out.println("Division is " + div);
	}
}