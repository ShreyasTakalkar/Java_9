import java.util.*;

class Power {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number");
		int num = sc.nextInt();

		System.out.println("Enter its power");
		int pow = sc.nextInt();
		int mul = 1;

		if(pow == 1) {

			System.out.println(num + " to the power 0 is " + 0);
		}else {

			for(int i = 0; i < pow; i++) {

			mul = mul * num;
			
			}

			System.out.println(num + " to the power " + pow + " is " + mul);
		}

		
	}
}