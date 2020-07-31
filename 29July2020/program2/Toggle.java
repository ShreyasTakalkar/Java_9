
class Toggle {

	public static void main(String[] args) {
		
		char ch = '1';

		if(ch >= 65 && ch<=90) {

			System.out.println("Before toggle " + ch);
			ch = (char)(ch + 32);
			System.out.println("After toggle " + ch);
		
		}else if (ch >= 97 && ch <= 122) {

			System.out.println("Before toggle " + ch);
			ch = (char)(ch - 32);
			System.out.println("After Toggle " + ch);			
		
		}else
			System.out.println("Enter proper alphabate");
	}
}