import java.util.*;

class ElectricityBill {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter units consumed");
		float units = sc.nextFloat();
		double bill = 0;

		if(units <= 0) {

			System.out.println("You did not use any electricity");
		
		}else if(units > 0 && units <= 50) {

			bill = units * 0.50;
		
		}else if(units > 50 && units <= 150) {

			bill = units * 0.75;
		
		}else if(units > 150 && units <= 250) {

			bill = units * 1.20;
		
		}else {

			bill = units * 1.50;
		}

		System.out.println("Bill is: Rs." + bill);
	}
}