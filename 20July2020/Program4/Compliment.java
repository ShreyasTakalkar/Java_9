
class Complement {

	void ComplementInt () {

		int num1 = 5;
		int ans = ~(num1);
		System.out.println("Ans = "+ ans);
	}

	/*void ComplementFloat() {

		float num1 = 8.5F;
		float ans = ~(num1);
	}
	*/

	void ComplementLong () {

		long num1 = 145236789l;
		long ans = ~(num1);
		System.out.println("Ans = "+ ans);
	} 

	/*void ComplementChar () {

		char ch = 'A';
		char ch = ~(num1)
		System.out.println("Ans = "+ ans);
	}
	*/

	public static void main(String[] args) {
		
		Complement obj = new Complement();
		obj.ComplementInt();
		//obj.ComplementFloat();
		obj.ComplementLong();
		//obj.ComplementChar();
	}
}

//Complement operator doest work on float character as well as double