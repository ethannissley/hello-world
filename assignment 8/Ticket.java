public abstract class Ticket {
	private int ticketNumber;
	private static int nextNumber = 1;
	
	//initializes ticketNumber to the next available one, and increases the next available number by 1
	Ticket()
	{
		ticketNumber = nextNumber;
		nextNumber++;
	}
	
	//gets price of ticket
	public abstract int getPrice();
	
	//returns ticket number and price in string format
	public String toString()
	{
		return "Ticket Number: " + ticketNumber + ", Price: $" + getPrice();
	}
