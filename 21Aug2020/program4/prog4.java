
class Pattern {

	public static void main(String[] args) {
		
		for(int i = 0; i <= 3; i++) {
			int count = 2;
			for(int j = 0; j <= 3; j++) {

				System.out.print(count + " ");
				count += 2;
			}
			System.out.println();
		}
	}
}