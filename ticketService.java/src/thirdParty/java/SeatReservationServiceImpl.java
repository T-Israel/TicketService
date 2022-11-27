package thirdParty.java;
import ticketsAndseats.java.seats;

public class SeatReservationServiceImpl implements SeatReservationService {
	
	seats noOfSeats;
	
	SeatReservationServiceImpl(){
		noOfSeats =  new seats();
	}
	
	public void seatReservationRequest() {
		noOfSeats.seatCalculator();
		System.out.println(noOfSeats.getAccountId());
	}

    @Override
    public void reserveSeat(long accountId, int totalSeatsToAllocate) {
        // Real implementation omitted, assume working code will make the seat reservation.
    }

}