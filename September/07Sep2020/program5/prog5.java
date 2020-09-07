import java.io.*;

class ComplexAdd {

	public static void main(String[] args) throws IOException {
		
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(input);

		System.out.println("Enter first number");
		System.out.print("Enter Real Part : ");
		int real1 = Integer.parseInt(br.readLine());

		System.out.print("Enter Imaginary Part : ");
		int img1 = Integer.parseInt(br.readLine());

		System.out.println("Enter second number");
		System.out.print("Enter Real Part : ");
		int real2 = Integer.parseInt(br.readLine());

		System.out.print("Enter Imaginary Part : ");
		int img2 = Integer.parseInt(br.readLine());

		int realAdd = real1 + real2;
		int imgAdd = img1 + img2;

		if(imgAdd >= 10) {

			realAdd += 1;
			imgAdd %= 10;
		}

		System.out.println("The addition of " + real1 + " + " + img1 + "i & " + real2 + " + " + img2 + "i is " + realAdd + " + " + imgAdd + "i");
	}
}