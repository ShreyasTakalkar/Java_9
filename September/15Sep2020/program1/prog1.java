
class SpaceHandle {

	public static void main(String[] args) {
				
		for(int row = 1; row <= 5; row++) {
			char ch = 'A';
			ch = (char)(ch + row - 1);

			for(int space = 4; space >= row; space--) {

				System.out.print("  ");
			}

			for(int col = 1; col <= row; col++) {

				System.out.print(ch + " ");
				ch++;

			}
			System.out.println();
		}
	}
}