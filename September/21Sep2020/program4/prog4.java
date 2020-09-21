import java.io.*;

class Largest {

	public static void main(String[] args) throws IOException {
		
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(input);

		System.out.println("Enter first number");
		int num1 = Integer.parseInt(br.readLine());

		System.out.println("Enter second number");
		int num2 = Integer.parseInt(br.readLine());

		System.out.println("Enter third number");
		int num3 = Integer.parseInt(br.readLine());

		if(num1 > num2 && num1 > num3) {

			System.out.println(num1 + " is largest number entered amongst " + num1 + " " + num2 + " " + num3);

		}else if(num2 > num1 && num2 > num3) {

			System.out.println(num2 + " is largest number entered amongst " + num1 + " " + num2 + " " + num3);
			
		}else{

			System.out.println(num3 + " is largest number entered amongst " + num1 + " " + num2 + " " + num3);
			
		}

	}

}