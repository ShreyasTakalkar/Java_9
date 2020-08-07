import java.util.*;

class MaxNum {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter any Number");

		int num = sc.nextInt();
		int max = 0,temp;
		int startNum = num;

		while(num != 0) {

			temp = num % 10;
			if(temp > max) {
				max = temp;
			}
			num = num / 10;
		}

		System.out.println("The Maximum digit from number " + startNum + " is " + max);
	}

}