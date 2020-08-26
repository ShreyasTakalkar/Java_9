import java.io.*;

class TableUser {

	public static void main(String[] args) throws IOException {

		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(input);

		System.out.println("Enter any Number");
		int num = Integer.parseInt(br.readLine());

		System.out.print("Table of " + num + " : ");

		for(int i = 1; i <= 10; i++) {

			System.out.print(num*i + " ");
		}
		System.out.println();
	}
}