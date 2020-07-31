
class Divisible {

	static boolean isDivisible (int a, int b) {

		int ans;
		ans = a%b;

		if(ans==0)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		
		int divident = 8;
		int divisor = 2;

		System.out.println("Divident is "+ divident);
		System.out.println("Divisor is "+ divisor);

		if(Divisible.isDivisible(divident,divisor) == true) 
			System.out.println("Yes");
		else
			System.out.println("No");

		//System.out.println(Divisible.isDivisible(divident,divisor));
	}
}