import java.io.*;

class ArithmaticOp {

	public static void main(String[] args) throws IOException {
		
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(input);

		System.out.println("Enter two numbers");
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());

		int sum = a + b;
		int sub = a > b ? a - b : b - a;
		int mul = a * b;
		float div = (float)a / (float)b;

		System.out.println("Addition of " + a + " and " + b + " is " + sum);
		System.out.println("Subtraction of " + a + " and " + b + " is " + sub);
		System.out.println("Multiplication of " + a + " and " + b + " is " + mul);
		System.out.println("Division of " + a + " and " + b + " is " + div);
	}
}