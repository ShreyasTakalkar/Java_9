
class SelfDivide {

	public static void main(String[] args) {
		
		int num = 1;
		System.out.print("Number : ");
		while(num < 101) {
			int temp = num, rem;
			int flag = 0;
			int temp1 = temp;
			while(temp1 != 0) {
				rem = temp1 % 10;
				if(temp % rem != 0) {
					flag = 1;
					break;
				}
				temp1 /= 10;
			}
			if(flag == 0) {
				System.out.print(temp + " ");
			}

			num++;
		}
	}
}