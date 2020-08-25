import java.io.*;

class EvenOdd {

	public static void main(String[] args) throws IOException{
		
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(input);

		System.out.println("Enter any number");
		int num = Integer.parseInt(br.readLine());

		if(num % 2 == 0) {

			System.out.println(num + " is an even number");
		
		}else {

			System.out.println(num + " is an odd number");
		}

	}
}