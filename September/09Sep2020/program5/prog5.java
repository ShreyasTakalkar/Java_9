import java.io.*;

class GCD {

	public static void main(String[] args) throws IOException {
		
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(input);

		System.out.println("Enter two numbers to find their GCD");
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());

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
		System.out.println("The GCD of " + a + " and " + b + " is " + gcd);
	}
}