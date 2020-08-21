import java.io.*;

class VowelConso {

	public static void main(String[] args) throws IOException {
		
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(input);

		System.out.println("Enter character");
		char ch = (char)br.read();

		switch(ch) {

			case 'A':
				System.out.println(ch + " is a vowel");
				break;

			case 'E':
				System.out.println(ch + " is a vowel");
				break;

			case 'I':
				System.out.println(ch + " is a vowel");
				break;

			case 'O':
				System.out.println(ch + " is a vowel");
				break;

			case 'U':
				System.out.println(ch + " is a vowel");
				break;

			case 'a':
				System.out.println(ch + " is a vowel");
				break;

			case 'e':
				System.out.println(ch + " is a vowel");
				break;

			case 'i':
				System.out.println(ch + " is a vowel");
				break;

			case 'o':
				System.out.println(ch + " is a vowel");
				break;

			case 'u':
				System.out.println(ch + " is a vowel");
				break;

			default:
				System.out.println(ch + " is a consonant");
		}
	}
}