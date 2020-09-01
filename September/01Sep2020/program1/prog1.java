import java.io.*;

class OddRange {

	public static void main(String[] args) throws IOException {
		
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(input);

		System.out.println("Enter min of series");
		int num1 = Integer.parseInt(br.readLine());

		System.out.println("Enter max of series");
		int num2 = Integer.parseInt(br.readLine());

		System.out.print("Series of odd numbers ranging between " + num1 + " & " + num2 + " is : ");

		for(int i = num1; i <= num2; i++) {

			if(i % 2 != 0) {

				System.out.print(i + " ");
			}
		}

		System.out.println();
	}
}