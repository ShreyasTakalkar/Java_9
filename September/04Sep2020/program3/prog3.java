import java.io.*;

class AreaOfRectangle {

	public static void main(String[] args) throws IOException {
		
			InputStreamReader input = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(input);

			System.out.println("Enter length of rectangle");
			float l = Float.parseFloat(br.readLine());

			System.out.println("Enter breadth of rectangle");
			float b = Float.parseFloat(br.readLine());

			float area = l * b;

			System.out.println("Area of rectangle = " + area);
	}
}