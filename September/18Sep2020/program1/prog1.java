import java.io.*;

class ImputDemo {

	public static void main(String[] args) throws IOException {
		
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(input);

		char ch;

			System.out.println("1. Integer");
			System.out.println("2. String");

			System.out.println("Enter which Input you want to insert");
			int choice = Integer.parseInt(br.readLine());

			switch(choice) {

				case 1 : 
						System.out.println("Enter integer you want to insert");
						int num = Integer.parseInt(br.readLine());
						System.out.println("You entered " + num);
						break;

				case 2 :
						System.out.println("Enter String you want to insert");
						String str = br.readLine();
						System.out.println("You entered " + str);
						break;

				default :
						System.out.println("Enter proper choice");
						break;

			}

	}
}