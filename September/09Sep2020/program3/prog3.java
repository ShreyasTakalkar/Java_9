import java.io.*;

class ConverHours {

	public static void main(String[] args) throws IOException {
		
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(input);

		System.out.println("Enter hours");
		float hours = Float.parseFloat(br.readLine());

		float seconds = 0f;

		seconds = hours * 3600;

		System.out.println(seconds + " seconds.");

	}
}