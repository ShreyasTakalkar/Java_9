import java.io.*;

class CubeAndSquare {

	public static void main(String[] args) throws IOException {
		
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(input);

		System.out.println("Enter minimum number");
		int min = Integer.parseInt(br.readLine());

		System.out.println("Enter maximum number");
		int max = Integer.parseInt(br.readLine());

		for(int i = min; i <= max; i++) {

			if(i % 2 == 0) {

				System.out.print(i * i + " ");
			
			}else {

				System.out.print(i * i * i + " ");
			}
		}

		System.out.println();
	}
}