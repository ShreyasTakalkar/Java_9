
class Pattern {

	public static void main(String[] args) {
		
		int count = 1;

		for(int i = 0; i <= 3; i++) {

			for(int j = 0; j <= i; j++) {

				System.out.print(count + " ");
				count++;

			}
			System.out.println();
		}
	}
}