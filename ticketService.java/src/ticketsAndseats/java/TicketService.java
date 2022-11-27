package ticketsAndseats.java;

public interface TicketService {
	
	public void purchaseTickets(); 



public static void main(String[]args) {
	TicketServiceImpl ticket = new TicketServiceImpl();
	
	ticket.purchaseTickets();
	
}

}