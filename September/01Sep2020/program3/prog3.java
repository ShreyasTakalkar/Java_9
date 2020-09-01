import java.io.*;

class CubeAndSquare {

	public static void main(String[] args) throws IOException {
		
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(input);

		System.out.println("Enter number");
		int num = Integer.parseInt(br.readLine());

		for(int i = 1; i <= num; i++) {

			if(i % 2 == 0) {
			
				int cube = i * i * i;
				int sqr = i * i;
				System.out.print("Cube of " + i + " : " + cube + "  Square of " + i + " : " + sqr + "\n");
			}
		}
	}
}