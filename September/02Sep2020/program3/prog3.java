import java.io.*;

class Velocity {

	public static void main(String[] args) throws IOException {
		
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(input);

		System.out.println("Enter distance in meter");
		float dist = Float.parseFloat(br.readLine());

		System.out.println("Enter time in seconds");
		float time = Float.parseFloat(br.readLine());

		float velocity = dist/time;

		System.out.println("The velocity of particle roaming in space is " + velocity);

	}

}
