/*Program 4: What will be output for following statement when a=10 and b=20 c = 50
--a + ++b + c-- ?
*/

class IncDec {

	int a = 10, b = 20, c = 50;
	int ans;

	void Answer() {

		ans = --a + ++b + c--;
		System.out.println("Answer of --a + ++b + c-- is " + ans); 
	}

	public static void main(String[] args) {
		
		IncDec obj = new IncDec();

		obj.Answer();
	}
}