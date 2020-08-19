import java.util.*;

class LCM {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int lcm;

		if(a > b) {

			for(int i = 1; i <= a; i++) {

				lcm = a * i;
				if(lcm % b == 0) {
					System.out.println("LCM is : " + lcm);
					break;
				}

			}	
		}else if(b > a) {

			for(int i = 1; i <= a; i++) {

				lcm = b * i;
				if(lcm % a == 0) {
					System.out.println("LCM is : " + lcm);
					break;
				}

			}	
		}else {

			System.out.println("LCM is : " + a);
		}
		
	}
}