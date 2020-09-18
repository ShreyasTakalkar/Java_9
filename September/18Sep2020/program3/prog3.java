import java.io.*;

class IncreaseByNum {

	public static void main(String[] args) throws IOException {
		
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(input);

		System.out.println("Enter number");
		int num = Integer.parseInt(br.readLine());

		for(int i = 1; i <= 50; i += num) {

			System.out.print(i + " ");
		}

		System.out.println();

	}

}