package dip.lab2;

// An useful import if you need it.
import java.text.NumberFormat;
// Another useful import if you need it.
import javax.swing.JOptionPane;

/**
 * Just a test class for input and output.
 *
 * 1. Create instances of low-level classes using Liskov Substitution principle.
 * 2. Create an instance of your high-level class.
 * 3. Pass one of your calculator instances to the high-level class and
 *    check the results.
 * 4. Now switch to a different calculator instance and pass that to the
 *    high-level class. Did it work? Are the low-level instances
 *    interchangeable? The DIP requires this.
 * 
 * @author your name goes here
 */
public class Startup {
//    public static enum ServiceQuality {
//           GOOD, FAIR, POOR
//    };
 
    public static void main(String[] args) {
   
       //   TipCalculator tipCalc = new FoodServiceTipCalculator(ServiceQuality.GOOD, 10.00);
		TipManager tm = new TipManager(new FoodServiceTipCalculator(ServiceQuality.GOOD, 5.25));
            System.out.println("Food Service tip " + tm.calculateTip());
            
            
            //   TipCalculator tipCalc = new BaggageServiceTipCalculator(ServiceQuality.GOOD, 10.00);
		TipManager bm = new TipManager(new BaggageServiceTipCalculator(ServiceQuality.GOOD, 5));
            System.out.println("Baggage Service tip " + bm.calculateTip());
            
	
		
		// Send end of program message
		System.out.println("Program ended.");
    }

}
