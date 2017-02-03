/**
 * 
 */
package page153;
import java.util.Scanner;
/**
 * @author CK121642
 *
 */
public class ParadiseInfo2 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
	double price;
	double discount;
	double savings;
	Scanner keyboard = new Scanner(System.in);

	
	System.out.print("enter cutoff price for discount >> ");
	price = keyboard.nextDouble();
	
	System.out.print("Enter discount rate as a whole number >> ");
	discount = keyboard.nextDouble();
	
	savings = computeDiscountInfo(price, discount);
	
	System.out.println("Special this week on any service over " + price);
	System.out.println("Discount of " + discount + " percent");
	System.out.println("That's a savings of at least $" + savings);
	}
	public static double computeDiscountInfo(double pr, double dscnt)
	{
		double savings;
		savings = pr * dscnt / 100;
		return savings; 
	}
}
