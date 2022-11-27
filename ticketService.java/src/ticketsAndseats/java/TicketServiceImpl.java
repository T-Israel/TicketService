package ticketsAndseats.java;


public class TicketServiceImpl implements TicketService{
	private seats ticketService;
	
	
	private void ticketsTypeAmount() {
		
		
		ticketService = new seats();
		
		ticketService.seatCalculator();
		
	}
	private long accountId() {
		return ticketService.getAccountId();
	}
	
	private int amountToPay() {
		return ticketService.getAmountToPay();
	}	
	@Override
	public void purchaseTickets() {
		ticketsTypeAmount();
		
		System.out.println(accountId());
		System.out.println(amountToPay());
		
	}

}
