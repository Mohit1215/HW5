import junit.framework.TestCase;


public class HWjunit extends TestCase 
{
	public void testCreditCard() 
	{
	   ValidateCard junit = new ValidateCard();
	   boolean result = junit.validate("1234");
	   assertEquals(true, result);
	}
}
