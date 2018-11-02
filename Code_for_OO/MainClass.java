import java.util.Scanner;
import org.apache.log4j.Logger;
import org.apache.log4j.chainsaw.Main;

public class MainClass 
{   private static Logger logger=Logger.getLogger("mainClass");

	public static void main(String args[]) 
	{   logger.info(" Starting to take flight's detail");
		Flight flight = new Flight();
		flight.getFlightDetail();
		
		Scanner reader = new Scanner(System.in); 
	    System.out.println("Enter a Flight number ");
	    String fno = reader.next();
	    
	    Selectseat sels = new Selectseat();
	    String sno = sels.selectseat();
	    	    
	    String dest =flight.dest(fno);
	    String fare = flight.far(fno);
	    logger.info("Gather all the reuired information");
	    
	    ReserveImplement rsv = new ReserveImplement();
	    rsv.setDestination(dest);
	    rsv.setfare(fare);
	    rsv.setFlightNo(fno);
	    rsv.setSeat(Integer.parseInt(sno));
	    
	    Scanner reader2 = new Scanner(System.in);
	    System.out.println("Enter card number for purchase of ticket of cost "+fare);
	    String cardno = reader2.next();
	    
	    ValidateCard vcard = new ValidateCard();
	    if(vcard.validate(cardno))
	    {   
	    	PrintTicket pp = new PrintTicket();
	    	pp.setSeat(Integer.parseInt(sno));
	    	pp.setDestination(dest);
	    	pp.setfare(fare);
	    	pp.setFlightNo(fno);
	    	
	    	pp.printStuff();
	    	
	    }
	    else
	    {   logger.error("Invalid card found ");
	    	System.out.println("Invalid card . purchase is being cancelled");
	    }
	    
	    
	}
}
