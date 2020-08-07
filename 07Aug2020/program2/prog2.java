import java.util.*;

class AddMulti {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number");

		int num = sc.nextInt();
		int temp,add = 0,mul = 1;

		while(num != 0) {

			temp = num % 10;
			if(temp % 2 == 0) {

				add = add + temp;
			
			}else {

				mul = mul * temp;

			}

			num = num / 10;

		}

		System.out.println("Addition of even digits " + add);
		System.out.println("Multiplication of odd digits " + mul);
	}
}