import java.util.*;

class Student {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Student Year");
		int year = sc.nextInt();

		switch(year) {

			case 1 : 
				System.out.println("Student not eligible for Educational scholorship");
				break;

			case 2 : 
				System.out.println("Student not eligible for Educational scholorship");
				break;

			case 3 : {

				System.out.println("Student Marks");
				int marks = sc.nextInt();

				if(marks > 75) {
					System.out.println("Student eligible for Educational scholorship");
				
				}else {
					System.out.println("Student not eligible for Educational scholorship");
				}
			}
				break;

			default :
				System.out.println("Enter proper year");
				break;
		}
	}
}