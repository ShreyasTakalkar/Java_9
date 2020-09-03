import java.io.*;

class OhmsLaw {

	public static void main(String[] args) throws IOException {
		
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(input);

		System.out.println("Enter Current");
		float current = Float.parseFloat(br.readLine());

		System.out.println("Enter Resistance");
		float resistance = Float.parseFloat(br.readLine());

		float voltage = current * resistance;

		System.out.println("Voltage V = " + voltage);

	}

}