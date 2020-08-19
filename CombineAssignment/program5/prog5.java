
class ASCII {

	public static void main(String[] args) {
		
		String s = "M S Dhoni";

		for(int i = 0; i < s.length(); i++) {
			int ascii = s.charAt(i);
			System.out.println(s.charAt(i) + " = " + ascii);
		}
	}
}