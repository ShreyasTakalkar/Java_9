import java.io.*;

class ArithmaticSwitch {

	public static void main(String[] args) throws IOException {
		
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(input);

		System.out.println("Enter two numbers");
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());

		System.out.println("Enter operation to perform");
		char ch = (char)br.read();
		
		switch(ch) {

			case '+' :
					int sum = a + b;
					System.out.println("Addition of " + a + " and " + b + " is " + sum);
					break;

			case '-' :
					int sub = a > b ? a - b : b - a;
					System.out.println("Subtraction of " + a + " and " + b + " is " + sub);
					break;

			case '*' :
					int mul = a * b;
					System.out.println("Multiplication of " + a + " and " + b + " is " + mul);
					break;

			case '/' :
					float div = (float)a / (float)b;
					System.out.println("Division of " + a + " and " + b + " is " + div);
					break;

			default :
					System.out.println("Enter proper choice");
					break;
		}


	}
}