import java.util.*;

class Month {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter month number");

		int month = sc.nextInt();

		switch(month) {

			case 1 :
				System.out.println("January is a 31 days month");
				break;

			case 2 : {

				System.out.println("Enter year");
				int year = sc.nextInt();

				if(year % 4 == 0) {
					System.out.println("February is a 29 days month in year "+ year);

				}else {

					System.out.println("February is a 28 days month in year "+ year);
				}
			}
				break;

			case 3 :
				System.out.println("March is a 31 days month");
				break;
		
			case 4 :
				System.out.println("April is a 30 days month");
				break;

			case 5 :
				System.out.println("May is a 31 days month");
				break;

			case 6 :
				System.out.println("June is a 30 days month");
				break;

			case 7 :
				System.out.println("July is a 31 days month");
				break;

			case 8 :
				System.out.println("August is a 31 days month");
				break;

			case 9 :
				System.out.println("September is a 30 days month");
				break;

			case 10 :
				System.out.println("October is a 31 days month");
				break;

			case 11 :
				System.out.println("November is a 30 days month");
				break;

			case 12 :
				System.out.println("December is a 31 days month");
				break;

			default :
				System.out.println("Enter month between 1 to 12");
				break;
		}

	}
}