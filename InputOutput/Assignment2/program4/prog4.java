import java.io.*;

class ArithmaticSwitch {

	public static void main(String[] args) throws IOException {
		
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(input);

		System.out.println("Enter two numbers");
		int range1 = Integer.parseInt(br.readLine());
		int range2 = Integer.parseInt(br.readLine());

		System.out.print("Square : ");

		for(int i = range1; i <= range2; i++) {

			System.out.print(i * i + " ");

		}
		System.out.println();

		System.out.print("Cube : ");

		for(int i = range1; i <= range2; i++) {

			System.out.print(i * i * i + " ");
			
		}
		System.out.println();

	}

}