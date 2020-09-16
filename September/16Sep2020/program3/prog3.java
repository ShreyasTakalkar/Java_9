
class Pattern3 {

	public static void main(String[] args) {

		int num = 2;
		int diff = 3;

		for(int row = 1; row <= 4; row++) {

			for(int col = 1; col <= row; col++) {

				if(row == 1) {

					System.out.print(num + " ");
					
				}else {
					num += diff;
					System.out.print(num + " ");
					diff += 2;

				}
			}
			System.out.println();
		}
	}
}