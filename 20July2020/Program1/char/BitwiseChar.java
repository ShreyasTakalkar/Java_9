/* Bitwise operators doesnt work on characters as it requires bit by bit value to 
calculate the result
*/

class Bitwisechar {

	char ch1 = 'A';
	char ch2 = 'B';
	char ans;

	void BitAnd() {

		ans = ch1 & ch2;
		System.out.println(ans);
	}

	void BitOr() {

		ans = ch1 | ch2;
		System.out.println(ans);
	}

	void BitXor() {

		ans = ch1 ^ ch2;
		System.out.println(ans);
	}

	public static void main(String[] args) {
		
		Bitwisechar obj = new Bitwisechar();

		obj.BitAnd();
		obj.BitOr();
		obj.BitXor();
	}
}

/* BitwiseChar.java:10: error: incompatible types: possible lossy conversion from int to char
		ans = ch1 & ch2;
		          ^
BitwiseChar.java:16: error: incompatible types: possible lossy conversion from int to char
		ans = ch1 | ch2;
		          ^
BitwiseChar.java:22: error: incompatible types: possible lossy conversion from int to char
		ans = ch1 ^ ch2;
		          ^
3 errors
*/