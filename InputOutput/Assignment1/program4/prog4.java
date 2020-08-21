import java.io.*;

class AscendingDescenfing {

	public static void main(String[] args) throws IOException {
		
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(input);

		System.out.println("Enter three numbers");
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int c = Integer.parseInt(br.readLine());

		int max=0,mid=0,min=0;

		if((a >= b && a >= c) && b <= c) {

			max = a;
			mid = c;
			min = b;
		
		}else if((a >= b && a >= c) && c <= b) {

			max = a;
			mid = b;
			min = c;
		
		}else if((b >= a && b >= c) && a <= c) {

			max = b;
			mid = c;
			min = a;
		
		}else if((b >= a && b >= c) && c <= a) {

			max = b;
			mid = a;
			min = c;
		
		}else if((c >= a && c >= b) && a <= b) {

			max = c;
			mid = b;
			min = a;
		
		}else if((c >= a && c >= b) && b <= a) {

			max = c;
			mid = a;
			min = b;
		}

		System.out.println("Ascending order : " + min + " " + mid + " " + max);
		System.out.println("Descending order : " + max + " " + mid + " " + min);
	}
}