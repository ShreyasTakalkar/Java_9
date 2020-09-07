import java.io.*;

class SwapNo {

	public static void main(String[] args) throws IOException {
		
	
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(input);

		System.out.println("Enter first number");
		int num1 = Integer.parseInt(br.readLine());

		System.out.println("Enter second number");
		int num2 = Integer.parseInt(br.readLine());

		System.out.println("Before swap : " + num1 + " " + num2);

		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;

		System.out.println("After swap : " + num1 + " " + num2);

	}

}