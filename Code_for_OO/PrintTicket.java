import org.apache.log4j.Logger;

public class PrintTicket extends PrintAny
{
	String flightNo ;
    private int seatNo;
    private String fare;
    private String destination;
	 
	public void setFlightNo(String i) {
		flightNo = i;
	}

	public void setSeat(int i) {
	seatNo = i;		
	}

	public void setfare(String i) {
		fare = i;		
	}

	public void setDestination(String i) {
		destination = i;	
	}
	
	public void printStuff()
	{
		System.out.println("Your ticket : ");
		System.out.println("Flight Number :"+flightNo);
		System.out.println("Seat number :"+String.valueOf(seatNo));
		System.out.println("Fare :"+fare);
		System.out.println("Destination :"+destination);
	}
	
}
