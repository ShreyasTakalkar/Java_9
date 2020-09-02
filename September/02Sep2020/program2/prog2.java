import java.io.*;

class MinNum {

	public static void main(String[] args) throws IOException {
		
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(input);

		System.out.println("Enter first number");
		int num1 = Integer.parseInt(br.readLine());

		System.out.println("Enter second number");
		int num2 = Integer.parseInt(br.readLine());

		if(num1 == num2) {

			System.out.println("Both numbers are equal");
		
		}else if(num1 < num2) {

			System.out.println("The minimum number amongst " + num1 + " & " + num2 + " is " + num1);
		
		}else {

			System.out.println("The minimum number amongst " + num1 + " & " + num2 + " is " + num2);
		}

	}

}