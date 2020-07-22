
class Bitwisedouble {

	double num1 = 4578.548798d;
	double num2 = 5478.125479d;
	double ans;

	void BitAnd() {

		ans = num1 & num2;
		System.out.println(ans);
	}

	void BitOr() {

		ans = num1 | num2;
		System.out.println(ans);
	}

	void BitXor() {

		ans = num1 ^ num2;
		System.out.println(ans);
	}

	public static void main(String[] args) {
		
		Bitwisedouble obj = new Bitwisedouble();

		obj.BitAnd();
		obj.BitOr();
		obj.BitXor();
	}
}

/* BitwiseDouble.java:10: error: bad operand types for binary operator '&'
		ans = num1 & num2;
		           ^
  first type:  double
  second type: double
BitwiseDouble.java:16: error: bad operand types for binary operator '|'
		ans = num1 | num2;
		           ^
  first type:  double
  second type: double
BitwiseDouble.java:22: error: bad operand types for binary operator '^'
		ans = num1 ^ num2;
		           ^
  first type:  double
  second type: double
3 errors
*/