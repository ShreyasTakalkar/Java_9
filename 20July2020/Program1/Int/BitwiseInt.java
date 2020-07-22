
class BitwiseInt {

	int num1 = 14;
	int num2 = 7;
	int ans;

	void BitAnd() {

		ans = num1 & num2;
		System.out.println(ans);	//6
	}

	void BitOr() {

		ans = num1 | num2;
		System.out.println(ans);	//15
	}

	void BitXor() {

		ans = num1 ^ num2;
		System.out.println(ans);	//9
	}

	public static void main(String[] args) {
		
		BitwiseInt obj = new BitwiseInt();

		obj.BitAnd();
		obj.BitOr();
		obj.BitXor();
	}
}

//Bitwise operators works on Integer values