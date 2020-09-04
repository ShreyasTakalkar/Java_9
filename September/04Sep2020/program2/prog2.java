import java.io.*;

class SuccessorPredecessor {

	public static void main(String[] args) throws IOException {
		
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(input);

		System.out.println("Enter a number");
		int num = Integer.parseInt(br.readLine());

		int succe,prede;

		succe = num + 2;
		prede = num - 2;

		System.out.println("Second Predecessor : " + prede);
		System.out.println("Second Successor : " + succe);
	}
}