
public class Flight 
{
	private String [] flightNo ;
	private int[] [] seats ;
	private String [] fare ;
	private String [] loc ;
	
    Flight()
    {
    	flightNo= new String[4];
    	for( int i=0;i<4;i++)
    	{
    		flightNo[i]="flight"+String.valueOf(i+1);
    	}
    	seats= new int[4][2];
    	
    	for(int i =0;i<4;i++)
    	{
    		seats[i][0]= 1; seats[i][1]=2;
    	}
    	
    	fare = new String[4];
    	fare[0]= "10$" ;fare[1]= "15$" ;fare[2]= "20$" ;fare[3]= "25$" ;
    	
    	loc = new String[4];
    	loc[0]="A-B"; loc[1]="C-D"; loc[2]="E-F"; loc[3]="G-H"; 
    }
    
    public String[] getFlightNo()
    {
    	return flightNo;
    }
    
    public int[] seatNumber(String flightno)
    {
    	int index = 0;
    	for (int i = 0; i < flightNo.length; i++) {
    		  if (flightNo[i] == flightno) {
    		    System.out.println(i);
    		    index = i;
    		    break;
    		  }
    	}
    	return seats[index];	
    }
    
    public String dest(String flightno)
    {
    	int index = 0;
    	for (int i = 0; i < flightNo.length; i++) {
    		  if (flightNo[i] == flightno) {
    		    System.out.println(i);
    		    index = i;
    		    break;
    		  }
    	}
    	return loc[index];	
    }
    
    public String far(String flightno)
    {
    	int index = 0;
    	for (int i = 0; i < flightNo.length; i++) {
    		  if (flightNo[i] == flightno) {
    		    System.out.println(i);
    		    index = i;
    		    break;
    		  }
    	}
    	return fare[index];	
    }
    
    public void getFlightDetail()
    {
    	System.out.println("Here are the fligts detail :");
    	for(int i =0 ; i<flightNo.length;i++)
    	{
    		System.out.println("Flight number :"+flightNo[i]);
    		System.out.println("Seats available:");
    		for(int j=0 ;j<seats[i].length;j++)
    		{
    		    System.out.println(seats[i][j]);	
    		}
    		System.out.println("Fare :"+fare[i]);
    		System.out.println("Source-Destination :"+loc[i]);
    		System.out.println("");
    	}
    }
}
