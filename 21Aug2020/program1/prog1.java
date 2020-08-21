import java.util.*;

class CircleArea {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		float pie = 3.14f;
		
		System.out.println("Enter radius of circle");
		float r = sc.nextFloat();

		float area = pie * r * r;
		
		if(r <= 0) {

			System.out.println("Radius must be greater than 0");
		}else
			System.out.println("Area of circle of radius " + r + " is " + area);
	}
}