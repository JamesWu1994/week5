import java.lang.System.Logger;
import java.util.ResourceBundle;

public class SpacedLogger implements Logger{

	    public void Log(String message) {
	        //this loop will work till the end of the string message and after each character it will
	        //print a space.
	        for(int i=0;i<message.length();i++)
	        {
	            System.out.print(message.charAt(i)+" ");
	        }
	        System.out.println("");
	    }

	    public void Error(String message) {
	        //extra error string before the message
	        System.out.print("Error: ");
	        
	        //this loop will work till the end of the string message and after each character it will
	        //print a space.
	        for(int i=0;i<message.length();i++)
	        {
	            System.out.print(message.charAt(i)+" ");
	        }
	        System.out.println("");
	    }

		@Override
		public String getName() {
			return null;
		}

		@Override
		public boolean isLoggable(Level level) {
			return false;
		}

		@Override
		public void log(Level level, ResourceBundle bundle, String msg, Throwable thrown) {
		}

		@Override
		public void log(Level level, ResourceBundle bundle, String format, Object... params) {
			
		}
	    
	}
