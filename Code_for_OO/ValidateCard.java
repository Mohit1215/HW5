import org.apache.log4j.Logger;

public class ValidateCard 
{
    
    
    public boolean validate(String cardNo)
    {
    	try  
    	  {  
    	    int d = Integer.parseInt(cardNo)  ;
    	  }  
    	  catch(NumberFormatException nfe)  
    	  {  
    	    return false;  
    	  }  
    	  return true;	
    }	
}

