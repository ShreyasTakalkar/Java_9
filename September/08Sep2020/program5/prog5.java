import java.io.*;

class PerfectNum {

	public static void main(String[] args) throws IOException {
	
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(input);

		System.out.println("Enter range number");
		int range = Integer.parseInt(br.readLine());

		System.out.print("Perfect numbers between 1 and " + range + " are ");

		for(int i = 1; i < range; i++) {

			int sum = 0;
			for(int j = 1; j < i; j++) {

				if(i % j == 0) {

					sum += j;
				}
			}
			if(sum == i) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
	}
}