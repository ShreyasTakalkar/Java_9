
class Bitwisefloat {

	float num1 = 17.3F;
	float num2 = 45.7F;
	float ans;

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
		
		Bitwisefloat obj = new Bitwisefloat();

		obj.BitAnd();
		obj.BitOr();
		obj.BitXor();
	}
}

/* BitwiseFloat.java:10: error: bad operand types for binary operator '&'
		ans = num1 & num2;
		           ^
  first type:  float
  second type: float
BitwiseFloat.java:16: error: bad operand types for binary operator '|'
		ans = num1 | num2;
		           ^
  first type:  float
  second type: float
BitwiseFloat.java:22: error: bad operand types for binary operator '^'
		ans = num1 ^ num2;
		           ^
  first type:  float
  second type: float
3 errors
*/