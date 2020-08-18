import java.util.*;

class MaxNum {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter any 3 numbers");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		if(a > b && a > c) {

			System.out.println(a + " is maximum amongst " + a + " " + b + " " + c);

		}else if(b > a && b > c) {

			System.out.println(b + " is maximum amongst " + a + " " + b + " " + c);
		
		}else
				System.out.println(c + " is maximum amongst " + a + " " + b + " " + c);
	}	
}