import java.io.*;

class InputDemo {

	public static void main(String[] args) throws IOException {
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.println("Enter interger input");
		int a = Integer.parseInt(br.readLine());
		System.out.println("Integer input is " + a);

		System.out.println("Enter float input");
		float f = Float.parseFloat(br.readLine());
		System.out.println("Float input is " + f);

		System.out.println("Enter double input");
		double d = Double.parseDouble(br.readLine());
		System.out.println("Double input is " + d);

		System.out.println("Enter long input");
		long l = Long.parseLong(br.readLine());
		System.out.println("Long input is " + l);

		System.out.println("Enter boolean input");
		boolean b = Boolean.parseBoolean(br.readLine());
		System.out.println("Boolean input is " + b);
		
		System.out.println("Enter string input");
		String str = br.readLine();
		System.out.println("String input is " + str);

		System.out.println("Enter character input");
		char ch = (char)br.read();
		System.out.println("Character input is " + ch);

	}
}