/**
 * 
 */
package methodConstruction;

/**
 * @author CK121642
 *
 */
public class page132 {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		double salary = 200.00;
		double startingwage = 800.00;
		System.out.println("Demonstrationg some raises");
		predictRaise(400.00);
		predictRaise(salary);
	//	predictRaise(startingWage);
				
	}

	public static void predictRaise(double salary) 
	
	{
		double newSalary;
		final double RAISE_RATE = 1.10;
		newSalry = salary * RAISE_RATE;
		System.out.println("Current salary: " + salary + " After raise: " + newSalary);
		
	}
	
}
