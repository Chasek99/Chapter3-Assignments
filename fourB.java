/**
 * 
 */
package ExcercisesPage175;
import java.util.Scanner;
/**
 * @author CK121642
 *
 */
public class fourB {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		
		int numOne;
		int numDouble;
		int numPlusFive;
		int numSquared;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter a number>>>> ");
		numOne = keyboard.nextInt();
		
		System.out.println("Enter your second number>>>> ");
		numOne = keyboard.nextInt();
		
		numDouble = displayTwiceNumber(numOne);
		numPlusFive = displayNumberPlus(numOne);
		numSquared = displayNumberSquared(numOne);
		
		System.out.println("You number double is " + numDouble);
		System.out.println("Your number plus 5 is " + numPlusFive);
		System.out.println("Your number squared is " + numSquared);		

	}
	

	
	public static void displayTwiceTheNumber(int num)
	{
		 int numDouble;
		 numDouble = num * 2;
		 return numDouble;
		
	}
	
	public static void displayNumberPlusFive(int num)
	{
		int numPlusFive;
		numPlusFive = num +5;
		return numPlusFive;
		
    }
	
	public static void displayNumberSquared(int num)
	{
		int numSquared;
		numSquared = num * num;
		return numSquared;
		
	}
}

