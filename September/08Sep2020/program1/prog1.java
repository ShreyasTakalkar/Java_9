import java.io.*;

class SeriesDiff {

	public static void main(String[] args) throws IOException {
		
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(input);

		System.out.println("Enter difference between series");
		int diff = Integer.parseInt(br.readLine());

		int num = 1;

		for(int i = 1; i <= diff; i++) {

			System.out.print(num + " ");
			num += diff;
		}
		System.out.println();
	}
}