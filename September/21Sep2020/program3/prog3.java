import java.io.*;

class LeapYear {

	public static void main(String[] args) throws IOException {
		
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(input);

		System.out.println("Enter Year");
		int year = Integer.parseInt(br.readLine());

		if(year % 100 == 0) {

			if(year % 400 == 0) {

				System.out.println(year + " is a leap year");

			}else {

				System.out.println(year + " is not a leap year");
			}
		
		}else if(year % 4 == 0) {

			System.out.println(year + " is a leap year");

		}else
			System.out.println(year + " is not a leap year");
	}
}