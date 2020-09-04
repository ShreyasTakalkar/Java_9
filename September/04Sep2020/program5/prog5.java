import java.io.*;

class DateCheck {

	static boolean isLeap(int year) {
	
		if(year % 100 == 0) {

			if(year % 400 == 0) {

				return true;

			}else {

				return false;
			}
		
		}else if(year % 4 == 0) {

			return true;

		}else
			return false;
	}


	public static void main(String[] args) throws IOException {

		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(input);

		System.out.println("Enter date");
		int date = Integer.parseInt(br.readLine());

		System.out.println("Enter month");
		int month = Integer.parseInt(br.readLine());

		System.out.println("Enter year");
		int year = Integer.parseInt(br.readLine());

		if(date > 31 || date < 0 || month < 0 || month > 12) {

			System.out.println("Enter valid date or month");

		}else if((month == 4 || month == 6 || month == 9 || month == 11) && date <= 30) {

			System.out.println(date + "/" + month + "/" + year + " is valid date");

		}else if(((month == 2 && isLeap(year)) && date <= 29)) {

			System.out.println(date + "/" + month + "/" + year + " is valid date");
		
		}else if((month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) && date <= 31) {

			System.out.println(date + "/" + month + "/" + year + " is valid date");

		}else if(month == 2 && date <= 28) {

			System.out.println(date + "/" + month + "/" + year + " is valid date");

		}else {

			System.out.println(date + "/" + month + "/" + year + " is invalid date");
		
		}

	}
}
