/*Program 2: Write a code to calculate following operation between two numbers
1) Addition
2) Subtraction
3) Multiplication
4) Division
5) Modulus
Every operation should carried out in a separate method
*/

class Operators {

	int num1 = 50;
	int num2 = 30;
	int ans;

	void AddNum() {

		ans = num1 + num2;
		System.out.println("Addition is " + ans);
	}

	void SubNum() {

		ans = num1 - num2;
		System.out.println("Subtraction is " + ans);
	}

	void MulNum() {

		ans = num1 * num2;
		System.out.println("Multiplication is " + ans);
	}

	void DivNum() {

		ans = num1 / num2;
		System.out.println("Division is " + ans);
	}

	void ModNum() {

		ans = num1 % num2;
		System.out.println("Modulus is " + ans);
	}

	public static void main(String[] args) {
		
		Operators obj = new Operators();

		obj.AddNum();
		obj.SubNum();
		obj.MulNum();
		obj.DivNum();
		obj.ModNum();
	}
}