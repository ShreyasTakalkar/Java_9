import java.util.*;

class Count {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number");

		int num = sc.nextInt();
		
		int cnt = 0;

		while(num != 0) {
			cnt++;
			num = num / 10;

		}
		System.out.println(cnt);
	}
}