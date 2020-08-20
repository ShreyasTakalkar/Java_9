import java.util.*;

class Percentage {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter marks in Physics");
		int pMarks = sc.nextInt();

		System.out.println("Enter marks in Chemistry");
		int chemMarks = sc.nextInt();

		System.out.println("Enter marks in Biology");
		int bMarks = sc.nextInt();

		System.out.println("Enter marks in Mathematics");
		int mMarks = sc.nextInt();

		System.out.println("Enter marks in Computer");
		int compMarks = sc.nextInt();

		float percentage = (pMarks + chemMarks + bMarks + mMarks + compMarks)/5;

		if((pMarks < 0 || pMarks > 100) || (chemMarks < 0 || chemMarks > 100) || (bMarks < 0 || bMarks > 100) || (mMarks < 0 || mMarks > 100) || (compMarks < 0 || compMarks > 100)){

			System.out.println("Enter valid marks");
		
		}else if(percentage >= 90) {

			System.out.println("Grade A");
		
		}else if(percentage >= 80) {

			System.out.println("Grade B");
		
		}else if(percentage >= 70) {

			System.out.println("Grade C");
		
		}else if(percentage >= 60) {

			System.out.println("Grade D");
		
		}else if(percentage >= 40) {

			System.out.println("Grade E");
		
		}else if(percentage < 40) {

			System.out.println("Grade F");
		
		}
	}
}