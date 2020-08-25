import java.io.*;

class InputInt {

	public static void main(String[] args) throws IOException {
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.println("Enter any integer");
		int a = Integer.parseInt(br.readLine());
		System.out.println("Integer input is " + a);


	}
}