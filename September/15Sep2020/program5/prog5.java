
class SpaceHandle {

	public static void main(String[] args) {
		
		int num = 1;
		for(int i = 1; i <= 5; i++) {
			
			int temp = num;

			for(int j = 5; j >= i; j--) {

				System.out.print(temp + " ");
				temp++;
			
			}
			num += 2;
			System.out.println();
		}
	}
}