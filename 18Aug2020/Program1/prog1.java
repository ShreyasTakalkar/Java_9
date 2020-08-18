
class CharCheck {

	public static void main(String[] args) {
		
		char ch = '*';

		if(ch >= 65 && ch <= 90 || ch >= 97 && ch <= 122) {

			System.out.println(ch + " is an alphabate");
		
		}else
			System.out.println(ch + " is not an alphabate");

	}
}