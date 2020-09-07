
class Pattern {

	public static void main(String[] args) {

		int num = 7;
		int temp;

		for(int i = 7; i >= 4; i--) {

			temp = num;

			for(int j = 7; j >= i; j--) {

				System.out.print(temp + " ");
				temp--;
			}
			num = temp+1;
			System.out.println();
		}
	}
}