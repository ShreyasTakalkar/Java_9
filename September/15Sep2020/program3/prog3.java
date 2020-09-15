
class SpaceHandle {

	public static void main(String[] args) {
		
		for(int i = 5; i > 0; i--) {
			int num = i;

			for(int j = i; j <= 5; j++) {

				System.out.print(num * num + " ");
				num++;
			
			}

			System.out.println();
		}
	}
}