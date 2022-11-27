package ticketsAndseats.java;
import java.util.Scanner;

public class TicketTypeRequest {
	private final int infant = 0;
	private final int child = 10;
	private final int adult = 20;
	private final int numberOfTickets= 20;
	private int amountToPay;
	
	protected long accountId;
	protected int infantTicketAmount;
	protected int childTicketAmount;
	protected int adultTicketAmount;
	protected int adultTicket;
	protected int totalTickets;
	protected int inputTickets;
	
	
	public long getAccountId() {
		System.out.println("account id: ");
		return accountId;
	}
	
	public int getAmountToPay() {
		System.out.println("total amount to pay in £: ");
		return amountToPay;
	}
	
	public int numberOfTicketsValue() {
		
		return numberOfTickets;
	}
	
	
	
	public void ticketTypeRequest() {
		
		Scanner in = new Scanner(System.in);
		System.out.println("please enter your account id");
		this.accountId = in.nextInt();
		
			if(accountId>0) {
				System.out.println("please enter the number of tickets you want to buy and the number of adult tickets you want to buy");
				
				System.out.println("Tickets: ");
				this.inputTickets = in.nextInt();
				
				System.out.println("Adult Tickets: ");
				this.adultTicket =in.nextInt();
				
				if(this.inputTickets<=numberOfTicketsValue()&& this.adultTicket>0) {
					System.out.println("Please enter how many tickets you want to buy for each category in the order: ");
					System.out.println("Infant: ");
					this.infantTicketAmount=in.nextInt();
					System.out.println("child: ");
					this.childTicketAmount = in.nextInt();
					System.out.println("Adult: ");
					this.adultTicketAmount = in.nextInt();
					
					this.totalTickets = this.infantTicketAmount+this.childTicketAmount+this.adultTicketAmount;
					if(this.totalTickets==this.inputTickets) {
					
					this.amountToPay=this.infantTicketAmount*this.infant + this.childTicketAmount*this.child + this.adultTicketAmount*this.adult; 
					
					}
					else {
						System.out.println("the tickets you have entered for each category does not corespond to the amount of tickets you want to buy");
					}
				}
				else {
					System.out.println("Sorry you can only choose a maximum of 20 tickets and you must buy at leats one adult ticket");
				}
				
			}
			else {
				System.out.println("Sorry your account Id is incorrect");
			
			}
		}
	
	}

