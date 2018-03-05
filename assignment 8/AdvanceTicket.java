public class AdvanceTicket extends Ticket {
	private int daysInAdvance;
	
	//initializes days in advance and gets a ticket number
	AdvanceTicket(int days)
	{
		super();
		daysInAdvance = days;
	}
	
	//returns the price of a ticket depending on how early it was bought
	public int getPrice()
	{
		if(daysInAdvance >= 10)
		{
			return 30;
		}
		else
		{
			return 40;
		}
	}
	
	//returns the number of days in advance the ticket was bought
	public int getDaysInAdvance()
	{
		return daysInAdvance;
	}
}
