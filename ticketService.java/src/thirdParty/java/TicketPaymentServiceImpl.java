package thirdParty.java;
import ticketsAndseats.java.TicketTypeRequest;

public class TicketPaymentServiceImpl implements TicketPaymentService {
    private TicketTypeRequest tickets;
    
	TicketPaymentServiceImpl(){
		tickets = new TicketTypeRequest();
	}
	
	public void paymentRequest() {
		
		tickets.ticketTypeRequest();
		System.out.println(tickets.getAccountId());
		System.out.println(tickets.getAmountToPay());
		
		
	
	}
	
    @Override
    public void makePayment(long accountId, int totalAmountToPay) {
        // Real implementation omitted, assume working code will take the payment using a card pre linked to the account.

    }
    
    
    
    
}