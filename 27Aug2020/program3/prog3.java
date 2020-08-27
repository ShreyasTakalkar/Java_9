import java.io.*;

class CubeSquare {

	public static void main(String[] args) throws IOException {
		
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(input);

		System.out.println("Enter two numbers");
		int num1 = Integer.parseInt(br.readLine());
		int num2 = Integer.parseInt(br.readLine());

		int s1 = num1 * num1;
		int s2 = num2 * num2;

		int c1 = num1 * num1 * num1;
		int c2 = num2 * num2 * num2;

		int addCube,subSquare;

		addCube = c1 + c2;
		subSquare = s1 - s2;

		System.out.println("Addition of " + c1 + " and " + c2 + " is " + addCube);
		System.out.println("Subtraction of " + s1 + " and " + s2 + " is " + subSquare);
	}
}