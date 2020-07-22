
class Cricket {

	int pitch = 22;
	static int Players = 22;

	void Pitch() {

		System.out.println("Length of a cricket pitch is "+ pitch +" yards");
	}

	static void TotalPlayers () {

		System.out.println("Both teams have total "+ Players +" players 11 each");
	}

	public static void main(String[] args) {
		
		Cricket match = new Cricket();

		match.Pitch();
		Cricket.TotalPlayers();
	}
}