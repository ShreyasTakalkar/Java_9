
class Arithmetic {

	int num1 = 10;
	int num2 = 8;

	static void Operation() {

		System.out.println("This is Arithmetic Operations");
	}

	void Add() {

		System.out.println("Addition is "+ (num1+num2));
	}

	void Sub() {

		System.out.println("Subtraction is "+ (num1-num2));
	}

	void Mul() {

		System.out.println("Multiplication is "+ (num1*num2));
	}

	void Div() {

		System.out.println("Division is "+ (num1/num2));
	}

	void Mod() {

		System.out.println("Modulus is "+ (num1%num2));
	}
}

class Logical {

	int num1 = 10;
	int num2 = 8;
	boolean ans;

	static void Operation() {

		System.out.println("This is Logical Operations");
	}

	void And() {

		System.out.println("If both inputs are true output is true");
		ans = ((num1 > num2) && (num2 > 0));
		System.out.println("Answer of (num1 > num2) && (num2 > 0) is "+ ans);

		ans = ((num1 > num2) && num2==0);
		System.out.println("Answer of (num1 > num2) && (num2==0) is "+ ans);
	}

	void Or() {

		System.out.println("If one of the input is true output is true");
		ans = ((num1 > num2) || (num2 > num1));
		System.out.println("Answer of (num1 > num2) || (num2 > num1) is "+ ans);

		ans = ((num1 < num2) || (num1 == 0));
		System.out.println("Answer of (num1 < num2) || (num1 == 0) is "+ ans);
	}

	void Xor() {

		System.out.println("If inputs are same output will be false");
		ans = ((num1 > num2) ^ (num2 > 0));
		System.out.println("Answer of (num1 > num2) ^ (num2 > 0) is "+ ans);

		ans = ((num1 > num2) ^ (num2 > num1));
		System.out.println("Answer of (num1 > num2) ^ (num2 > num1) is "+ ans);

	}
}

class Bitwise {

	int num1 = 10;
	int num2 = 8;
	int ans;

	static void Operation() {

		System.out.println("This is Bitwise Operations");
	}

	void And() {

		ans = num1 & num2;
		System.out.println("Bitwise AND = "+ ans );
	}

	void Or() {

		ans = num1 | num2;
		System.out.println("Bitwise OR = "+ ans );
	}

	void Compliment() {

		ans = ~num1;
		System.out.println("Bitwise Compliment = "+ ans );
	}

	void LeftShift() {

		ans = num1<<2;
		System.out.println("Bitwise LeftShift = "+ ans );
	}

	void RightShift() {

		ans = num1>>3;
		System.out.println("Bitwise RightShift = "+ ans );
	}

	void UnsignedShift() {

		ans = num1 >>> 5;
		System.out.println("Bitwise UnsignedShift = "+ ans );
	}
}

class OperatorDemo {

	public static void main(String[] args) {
		
		Arithmetic op1 = new Arithmetic();
		op1.Operation();
		op1.Add();
		op1.Sub();
		op1.Mul();
		op1.Div();
		op1.Mod();
		System.out.println("*************************");

		Logical op2 = new Logical();
		op2.Operation();
		op2.And();
		op2.Or();
		op2.Xor();
		System.out.println("***************************");

		Bitwise op3 = new Bitwise();
		op3.Operation();
		op3.And();
		op3.Or();
		op3.Compliment();
		op3.LeftShift();
		op3.RightShift();
		op3.UnsignedShift();

	}
}