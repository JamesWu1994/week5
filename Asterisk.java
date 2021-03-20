
public class AsteriskLogger {
	public void Log(String message) {
        System.out.println("***"+message+"***");
    }

	public void Error(String message) {
        //getting the total count of letters so that we can createa box +13 for extra letters
        int count=message.length()+13;
        
        //printing the above line
        for(int i=0;i<count;i++)
            System.out.print("*");
        
        //printing the message.
        System.out.println("\n***Error: "+message+"***");
     
        //printing the bottom line.
        for(int i=0;i<count;i++)
           System.out.print("*");
        System.out.println("");
    }
    
}
