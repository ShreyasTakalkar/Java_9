import java.util.*;

class VowelConso {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter character");
		char sVar = sc.next().charAt(0);

		switch(sVar) {

			case 'A':
				System.out.println(sVar + " is a vowel");
				break;

			case 'E':
				System.out.println(sVar + " is a vowel");
				break;

			case 'I':
				System.out.println(sVar + " is a vowel");
				break;

			case 'O':
				System.out.println(sVar + " is a vowel");
				break;

			case 'U':
				System.out.println(sVar + " is a vowel");
				break;

			case 'a':
				System.out.println(sVar + " is a vowel");
				break;

			case 'e':
				System.out.println(sVar + " is a vowel");
				break;

			case 'i':
				System.out.println(sVar + " is a vowel");
				break;

			case 'o':
				System.out.println(sVar + " is a vowel");
				break;

			case 'u':
				System.out.println(sVar + " is a vowel");
				break;

			default:
				System.out.println(sVar + " is a consonant");
		}
	}
}