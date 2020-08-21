import java.util.*;

class ServicePlace {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter age");
		int age = sc.nextInt();

		System.out.println("Enter sex (M or F)");
		char ch = sc.next().charAt(0);

		if(ch == 'F' || ch == 'f') {

			System.out.println("She will work only in urban areas");

		}else if((ch == 'M' || ch == 'm') && (age >= 20 && age <= 40)) {

			System.out.println("He may work anywhere");

		}else if((ch == 'M' || ch == 'm') && (age > 40 && age <= 60)) {

			System.out.println("He only work in urban areas");
			
		}else
			System.out.println("ERROR");
	}
}