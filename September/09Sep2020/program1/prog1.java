import java.io.*;

class OddReverse {

	public static void main(String[] args) throws IOException {
		
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(input);

		System.out.println("Enter number");
		int num = Integer.parseInt(br.readLine());

		for(int i = num; i > 0; i--) {

			if(i % 2 != 0) {

				System.out.print(i + " ");
			}
		}
		System.out.println();
	}
}