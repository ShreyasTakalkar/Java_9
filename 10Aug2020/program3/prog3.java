import java.util.*;

class Prime {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter any number");

		int num = sc.nextInt();

		for(int i = 2; i < num; i++) {

			int flag = 0;

			for(int j = 2	; j < i; j++) {

				if(i % j == 0) {

					flag = 1;
					break;
				}
			}

			if(flag == 0) {

				System.out.print(i + " ");
			}
		}
	}
}