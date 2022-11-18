import java.time.LocalTime;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class WPMProgram {
	
	  static String[] words = {"java", "length", "compiler", "study", "coding", "top", 
			"bottom", "compare", "apply", "type"}; 	
	
	public static void main(String[] args) throws InterruptedException {
        
		  System.out.println("3");
		  TimeUnit.SECONDS.sleep(1);
		  
		  System.out.println("2");
		  TimeUnit.SECONDS.sleep(1);
		  
		  System.out.println("1");
		  TimeUnit.SECONDS.sleep(1);
		   Random rand = new Random();
		   for(int i = 0; i < 10; i++) {
			   System.out.print(words[rand.nextInt(9)]  + " ");
		   }
		    System.out.println();
		     double start = LocalTime.now().toNanoOfDay();
		    
		    Scanner scan = new Scanner(System.in);                     
		    String typedwords = scan.nextLine();
		    
		    double end = LocalTime.now().toNanoOfDay();
		    double elapsedTime = end - start;
		    double seconds = elapsedTime / 1000000000.0;
		    int numChars = typedwords.length();
		    // words per minute formula
		    // (x characters / 5 ) / 1min = y WPM
		    int wpm = (int) ((((double)numChars/ 5) / seconds) * 60);
		    System.out.println("Your wpm is" + wpm + "!");
	    
	}

		   
}
