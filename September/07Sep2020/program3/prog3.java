import java.io.*;

class QuoRem {

	public static void main(String[] args) throws IOException {
		
	
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(input);

		System.out.println("Enter Dividend");
		int num1 = Integer.parseInt(br.readLine());

		System.out.println("Enter Divisor");
		int num2 = Integer.parseInt(br.readLine());

		int quotient = num1 / num2;
		int remainder = num1 % num2;

		System.out.println("Quotient : " + quotient);
		System.out.println("Remainder : " + remainder);

	}

}
