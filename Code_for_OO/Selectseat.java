import java.util.Scanner;
import org.apache.log4j.Logger;

public class Selectseat 
{
   public String selectseat()
   {
	    Scanner reader1 = new Scanner(System.in);
	    System.out.println("Enter a seat number ");
	    String sno = reader1.next();
	    return sno;
   }
}
