import java.util.*;

class PrimeNum {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num = sc.nextInt();
		int temp = num, rem;
		
		System.out.print("The prime digits from the number " + num + " is ");
		
		while(temp != 0) {

			int flag = 0;
			rem = temp % 10;
			for(int i = 2; i < rem; i++) {

				if(rem % i == 0) {
					flag = 1;	
					break;
				}
			}
			if(flag == 0) {

				System.out.print(rem + " ");
			}
			temp /= 10;
		}
	}
}