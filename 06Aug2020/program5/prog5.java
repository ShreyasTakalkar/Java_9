
class Table {

	public static void main(String[] args) {
		
		System.out.print("Table of 3 is - ");
		for(int i = 1; i <= 10; i++) {

			System.out.print(i*3 + ",");
		}
		System.out.println();

		System.out.print("Even numbers present in table - ");
		for(int i = 1; i <= 10; i++) {

			if(i*3 % 2 == 0) {
				System.out.print(i*3 + ",");
			}
		}
	}
}