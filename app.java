import java.lang.System.Logger;

public class App {
	 public static void main(String[] args) {
	        AsteriskLogger al=new AsteriskLogger();
	        System.out.println("Asterick Logger::Log");
	        al.Log("Passing hello!");
	        System.out.println("\n\nAsterick Logger::Error");
	        al.Error("Passing hello!");
	        
	        SpacedLogger sl=new SpacedLogger();
	        System.out.println("\n\nSpace Logger::Log");
	        sl.Log("Passing hello!");
	        System.out.println("\n\nSpace Logger::Error");
	        sl.Error("Passing hello!");
	        
	    }
	    
	}
