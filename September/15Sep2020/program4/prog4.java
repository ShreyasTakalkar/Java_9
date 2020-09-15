
class Pattern {

	public static void main(String[] args) {
		
		for(int i = 1; i <= 5; i++) {

			int num = i;
			int sq = num * num;
			int mul = 1;

			for(int j = 5; j >= i; j--) {

				if(j == 5) {

					System.out.print(num * num + " ");

				}else {

					System.out.print(sq + (i * mul) + " ");
					mul++;
				}
			}

			System.out.println();
		} 
	}
}