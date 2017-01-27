package chrome;

public class Assignment4 {

	int price1;
	static double price2;
	static double price3;

	public void Assignement4(int maxPrice) { // Parameterized Constructor
		price1 = maxPrice;
		price2 = maxPrice * (.85);
		price3 = maxPrice * (.5);

	}

	public void printUndiscountedTicket() {
		System.out.println("Undiscounted Price of the Ticket = $" +price1 );
	}

	public static void printTicketForSeniorCitizens() {
		System.out.println("Discounted ticket for Senior citizens = $" +price2 );
	}

	public static void printTicketForChildren() {
		System.out.println("Discounted price for Children = $ " + price3);
	}

	public static void main(String[] args) {
		Assignment4 trainTickets = new Assignment4(45);

		trainTickets.printTicketForSeniorCitizens();

		trainTickets.printTicketForChildren();

	}

}

	

