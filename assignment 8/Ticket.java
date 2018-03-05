public class AdvanceTicket extends Ticket {
	static final int discountDay = 10; // Tickets purchased on or before this day receive a larger discount
	private int days; 
	
	// CONSTRUCTORS
	public AdvanceTicket() {
		this(0, 0);
	}
	
	public AdvanceTicket(int number, int days) {
		super(number);
		
		//Can't purchase a ticket after the event!
		if (days < 0) {
			throw new IllegalArgumentException();
		}
		
		if (days >= discountDay) {
			price = 30;
		} else {
			price = 40;
		}
		
		this.days = days;
		
	}

	// ACCESSORS
	public double getPrice() {
		return this.price;
	}

}
