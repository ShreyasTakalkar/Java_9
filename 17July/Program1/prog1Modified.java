/*Write a Java Program with a class of name dominos with two instance
variable 'price' and 'quantity', declare one static variable named 'total' and static
method bill() . Create two objects of class named as pizza and fires assign some value
for instance variable of class and calculate the total bill & print the total cost.
*/
class Dominos {

	int price;
	int quantity;

	static int total;

	void Bill() {

		total = price * quantity;

		System.out.println("Total payable amount is " + total);
	}

	public static void main(String[] args) {
		
		Dominos pizza = new Dominos();

		pizza.price = 500;
		pizza.quantity = 4;

		pizza.Bill();
		
		Dominos fires = new Dominos();

		fires.price = 300;
		fires.quantity = 8;

		fires.Bill();
		
	}
}