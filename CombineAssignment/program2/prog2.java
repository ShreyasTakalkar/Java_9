import java.util.*;

class GCD {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter two numbers to find their GCD");
		int a = sc.nextInt();
		int b = sc.nextInt();

		int gcd = 1;

		if(a == b) {

			gcd = a;

		}else if(a > b) {

			if(a % b == 0) {

				gcd = b;
			
			}else{

				for(int i = 1; i < b; i++) {

					if(a % i == 0 && b % i == 0) {

						gcd = i;
					}
				}
			}
		}else if(b > a) {

			if(b % a == 0) {

				gcd = a;

			}else {

				for(int i = 1; i < a; i++) {

					if(a % i == 0 && b % i == 0) {

						gcd = i;
					}
				}
			}
		}
		System.out.println(gcd);
	}
}