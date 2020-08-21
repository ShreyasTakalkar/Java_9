import java.io.*;

class IPL {

	public static void main(String[] args) throws IOException {
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.println("Enter team name");
		String teamName = br.readLine();

		System.out.println("Enter captain name");
		String captnName = br.readLine();

		System.out.println("Enter best win percentage");
		float winPer = Float.parseFloat(br.readLine());

		System.out.println("Enter number of Indian batsman");
		int batsInd = Integer.parseInt(br.readLine());

		System.out.println("Enter number of Oversea batsman");
		int batsOver = Integer.parseInt(br.readLine());

		System.out.println("IPL team is : " + teamName);
		System.out.println("captain is : " + captnName);
		System.out.println("Win percentage is : " + winPer);
		System.out.println("Total Indian batsmen : " + batsInd);
		System.out.println("Total Overseas batsmen : " + batsOver);
	}
}