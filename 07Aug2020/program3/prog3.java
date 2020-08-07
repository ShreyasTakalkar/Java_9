
class Divisible {

	public static void main(String[] args) {
		
		int i = 32;

		while(i<1000) {

			if(i % 7 == 0 && i % 32 == 0 && i % 6 == 0) {
				System.out.print(i);
				break;
			
			}else if(i % 7 == 0 && i % 32 == 0) {

				System.out.print(i + " ");
			}
			i++;
		}
		System.out.println("\nBreaking Loop");
		System.out.println(i + " is Divisible by 6");

	}
}