import java.io.*;

class SwapOrder {

	public static void main(String[] args) throws IOException {
		
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(input);

		System.out.println("Enter first number");
		int num1 = Integer.parseInt(br.readLine());

		System.out.println("Enter second number");
		int num2 = Integer.parseInt(br.readLine());

		System.out.println("Before Swap : " + num1 + " " + num2);

		int temp = num1;
		num1 = num2 ;
		num2 = temp;

		System.out.println("After Swap : " + num1 + " " + num2);

	}

}