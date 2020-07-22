/*Write a Java Program with a class of name dominos with two instance
variable 'price' and 'quantity', declare one static variable named 'total' and static
method bill() . Create two objects of class named as pizza and fires assign some value
for instance variable of class and calculate the total bill & print the total cost.
*/
class Dominos {

	int price;
	int quantity;

	static int total;

	static void Bill() {

		total = price * quantity;

		System.out.println("Total payable amount is " + total);
	}

	public static void main(String[] args) {
		
		Dominos pizza = new Dominos();

		pizza.price = 500;
		pizza.quantity = 4;

		pizza.Bill();
	}
}

/*prog1.java:15: error: non-static variable price cannot be referenced from a static context
		total = price * quantity;
		        ^
prog1.java:15: error: non-static variable quantity cannot be referenced from a static context
		total = price * quantity;
		                ^
2 errors
*/