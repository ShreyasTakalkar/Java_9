
class Pattern2 {

	public static void main(String[] args) {

		for(int i = 7; i >= 4; i--) {
			int num = i;

			for(int j = 7; j >= i; j--) {

				System.out.print(num + " ");
				num--;

			}
			System.out.println();

		}

	}

}
