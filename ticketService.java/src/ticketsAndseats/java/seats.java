package ticketsAndseats.java;

public class seats extends TicketTypeRequest {
	private int numOfSeats;
	
	
	public void seatCalculator() {
		super.ticketTypeRequest();
		if(this.accountId>0 && this.adultTicket>0 && numberOfTicketsValue()<=20&& this.totalTickets==this.inputTickets) {
		if(this.infantTicketAmount>0) {
			System.out.println("according to the amount of tickets there is one or more infant ticket so there will"
					+ " be no seat allocated to the infant ticcket");
			
			this.numOfSeats = this.childTicketAmount + this.adultTicketAmount;
			
		System.out.println("the total number of seat: "+ this.numOfSeats);
		}
		else if(this.infantTicketAmount<1) {
			System.out.println("there is no infant tickets so no seat will be removed");
			
			this.numOfSeats = this.childTicketAmount + this.adultTicketAmount;
			System.out.println("number of seats: "+this.numOfSeats);
		}
	}
	
	}

}