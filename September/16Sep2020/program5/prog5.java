
class Pattern5 {

	public static void main(String[] args) {
		
		for(int row = 1; row <= 10; row++) {

			if(row <= 5) {

				for(int equal = 5; equal >= row; equal--) {

					System.out.print("= ");
				}

			}else {

				for(int star = 6; star <= row; star++) {

					System.out.print("* ");
				}
			}

			System.out.println();
		}
	}
}