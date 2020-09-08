import java.io.*;

class RupeeDollar {

	public static void main(String[] args) throws IOException {
		
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(input);

		System.out.println("Enter Rupees");
		double rupee = Double.parseDouble(br.readLine());

		double dollar = rupee / 73.77 ;

		System.out.println(rupee + " rupees are equal to " + dollar + " dollars");

	}

}