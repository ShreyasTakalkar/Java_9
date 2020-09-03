import java.io.*;

class PerfectNum {

	public static void main(String[] args) throws IOException {
	
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(input);

		System.out.println("Enter any number");
		int num = Integer.parseInt(br.readLine());

		int sum = 0;
		for(int i = 1; i < num; i++) {

			if(num % i == 0) {

				sum += i;
			}
		}	
		if(sum == num) {

			System.out.println(num + " is a Perfect number");
		
		}else
			System.out.println(num + " is not a Perfect number");
	}
	
}