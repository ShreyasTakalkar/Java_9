
class BitwiseShift {

	public static void main(String[] args) {
		
		int num1 = 188;
		int num2 = 255;
		int num3 = -108;
		int num4 = -123;
		int result;

		result = num1 >>> 4;
		System.out.println("Num1 shift = "+ result);

		//result = num2 <<< 3;
		//System.out.println("Num2 shift = "+ result);

		result = num3 >>> 23;
		System.out.println("Num3 shift = "+ result);

		//result = num4 <<< 25;
		//System.out.println("Num4 shift = "+ result);
	}
}

// There is not any operator as <<< so compiler is giving error