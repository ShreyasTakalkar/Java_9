

class Bitwiselong {

	long num1 = 4512789l;
	long num2 = 47854125698l;
	long ans;

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
		
		Bitwiselong obj = new Bitwiselong();

		obj.BitAnd();
		obj.BitOr();
		obj.BitXor();
	}
}

//Bitwise operators works on long also as it works on a single bit.