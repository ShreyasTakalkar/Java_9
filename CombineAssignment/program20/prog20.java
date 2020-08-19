
class Pattern2 {

	public static void main(String[] args) {
	
		char chEven = 'A';
		char chOdd = 'a';

		for(int i = 0; i <= 3; i++) {

			for(int j = 0; j <= 3; j++) {

				if(i % 2 == 0) {

					System.out.print(chEven + " ");
					chEven++;

				}else {

					System.out.print(chOdd + " ");
					chOdd++;
				}
			}
			System.out.println();
		}	
	}
	
}