
class CommandLineArgument {

	public static void main(String[] args) {

		int x,y;

		x = Integer.parseInt(args[0]);
		y = Integer.parseInt(args[1]);
		int z = x + y;
		
		System.out.println("Sum of " + args[0] + " and " + args[1] + " is " + z);
	}
}