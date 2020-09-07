import java.io.*;

class KineticEnergy {

	public static void main(String[] args) throws IOException {
		
	
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(input);

		System.out.println("Enter Mass of Object");
		double mass = Double.parseDouble(br.readLine());

		System.out.println("Enter Velocity of Object");
		double velocity = Double.parseDouble(br.readLine());

		double ke = 0.5 * mass * velocity * velocity;

		System.out.println("Kinetic Energy of that object is : " + ke);

	}

}