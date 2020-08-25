import java.io.*;

class Average {

	public static void main(String[] args) throws IOException {
		
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(input);

		int sum = 0;
		float average;

		System.out.println("Enter 10 integers");

		int num1 = Integer.parseInt(br.readLine());
		int num2 = Integer.parseInt(br.readLine());
		int num3 = Integer.parseInt(br.readLine());
		int num4 = Integer.parseInt(br.readLine());
		int num5 = Integer.parseInt(br.readLine());
		int num6 = Integer.parseInt(br.readLine());
		int num7 = Integer.parseInt(br.readLine());
		int num8 = Integer.parseInt(br.readLine());
		int num9 = Integer.parseInt(br.readLine());
		int num10 = Integer.parseInt(br.readLine());

		sum = num1 + num2 + num3 + num4 + num5 + num6 + num7 + num8 + num9 + num10;
		average = (float)sum / 10; 
		System.out.println("Sum of 10 entered number is " + sum);
		System.out.println("Average of 10 entered numbers is " + average);
	}
}