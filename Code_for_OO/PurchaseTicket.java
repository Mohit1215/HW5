import java.util.Scanner;
import org.apache.log4j.Logger;


public class PurchaseTicket extends ValidateCard
{
	

	public boolean takeCard()
	{
	    Scanner reader = new Scanner(System.in); 
	    System.out.println("Enter a number: ");
	    String s = reader.next();
	    reader.close();
	    
	    boolean ans = validate(s);
	    if(ans)
	    	return true;
	    else
	    	return false;
	}
}
