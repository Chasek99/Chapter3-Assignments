/**
 * 
 */
package delgadosTacos;
import java.util.Scanner; 
import java.text.DecimalFormat;
/**
 * @author CK121642
 *
 */
public class DelgadosTacos {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		
	    tacoTruck();
	    menu();
	    orderingMenu();
	}
	    
	public static void orderingMenu()
	{
	    String taco, burritos, chimichanga, enchiladas, tamales, tacoSalads, fajita, tachidos, pop, churros;
		double tacoPrice = 0.99;
		double burritosPrice = 0.99;
		double tacoOrdered;
		double burritosOrdered;
		double chimichangaPrice = 1.99;
		double chimichangaOrdered;
		double enchiladasPrice = 3.99;
		double enchiladasOrdered;
		double tamalesPrice = 2.49;
		double tamalesOrdered;
		double tacoSaladsPrice = 3.99;
		double tacoSaladsOrdered;
		double fajitaPrice = 1.49;
		double fajitaOrdered;
		double tachidosPrice = 2.99;
		double tachidosOrdered;
		double popPrice = .99;
		double popOrdered;
		double churrosPrice = .75;
		double churrosOrdered;
		
		
		double totalPrice;
		double totalPriceWithTax;
		
		Scanner inputDevice = new Scanner(System.in);
		
		System.out.println("How many tacos do you want? >>>>>");
		tacoOrdered = inputDevice.nextDouble();
		inputDevice.nextLine();
		
		
		System.out.println("How many burritos do you want? >>>>>");
		burritosOrdered = inputDevice.nextDouble();
		inputDevice.nextLine();
		
		System.out.println("How many chimichangas do you want? >>>>>");
		chimichangaOrdered = inputDevice.nextDouble();
		inputDevice.nextLine();
		
		System.out.println("How many enchiladas do you want? >>>>>");
		enchiladasOrdered = inputDevice.nextDouble();
		inputDevice.nextLine();
		
		System.out.println("How many tamales do you want? >>>>>");
		tamalesOrdered = inputDevice.nextDouble();
		inputDevice.nextLine();
		
		System.out.println("How many tacoSalads do you want? >>>>>");
		tacoSaladsOrdered = inputDevice.nextDouble();
		inputDevice.nextLine();


		System.out.println("How many fajitas do you want? >>>>>");
		fajitaOrdered = inputDevice.nextDouble();
		inputDevice.nextLine();
		
		System.out.println("How many tachidos do you want? >>>>>");
		tachidosOrdered = inputDevice.nextDouble();
		inputDevice.nextLine();
		
		System.out.println("How many pop do you want? >>>>>");
		popOrdered = inputDevice.nextDouble();
		inputDevice.nextLine();
		
		System.out.println("How many churros do you want? >>>>>");
		churrosOrdered = inputDevice.nextDouble();
		inputDevice.nextLine();
		
		
		
		
		totalPrice = (tacoPrice * tacoOrdered) + (burritosOrdered * burritosPrice) + (enchiladasOrdered * enchiladasPrice) + (chimichangaOrdered * chimichangaPrice) +  
				(tamalesOrdered * tamalesPrice) + (tacoSaladsOrdered * tacoSaladsPrice) + (fajitaOrdered * fajitaPrice) + (tachidosOrdered * tachidosPrice) +
				(popOrdered * popPrice) + (churrosOrdered * churrosPrice);
		
		System.out.println("How you ordered " + tacoOrdered + " Tacos, " + burritosOrdered + "burritos, " + enchiladasOrdered + "echiladas, " + chimichangaOrdered + "chimichanga, " + 
		tamalesOrdered + "tamales, " + tacoSaladsOrdered + "tacoSalads, " + fajitaOrdered + "fajita, " + tachidosOrdered + "tachidos, " + 
				popOrdered + "pop, " + churrosOrdered + "churros, for a total price of" + totalPrice);
		
		totalPriceWithTax = totalPrice * 1.075;
		System.out.println("Total with tax is " + totalPriceWithTax);

	}
	
	
	public static void menu()
	
	{
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("***********************************");
		System.out.println("*               MENU              *");
		System.out.println("*       Tacos        Price 0.99   *");
		System.out.println("*       Burrito      Price 0.99   *");
		System.out.println("*       Enchiladas   Price 3.99   *");
		System.out.println("*       Chimichanga  Price 1.99   *");
		System.out.println("*       Tamales      Price 2.49   *");
		System.out.println("*       TacoSalads   Price 2.99   *");
		System.out.println("*       Fajita       Price 1.79   *");
		System.out.println("*       Tachidos     Price 1.49   *");
		System.out.println("*       Pop          Price 0.99   *");
		System.out.println("*       Churros      Price 0.49   *");
		System.out.println("***********************************");
	}
	
	
	
	
	
	
	

	
	
	public static void tacoTruck()
	{
		System.out.println("**********************************************************************");
		System.out.println("*                                                                    *");
		System.out.println("*                    TACOS FOR SALE $$$$$                            *");
		System.out.println("*                                                                    *");
		System.out.println("*                                                                    *");
		System.out.println("*             --------------------------------                       *");
		System.out.println("*             *                              *                         *");
		System.out.println("*             *                              *                         **************");
		System.out.println("*             *                              *                          *           *");
		System.out.println("*             --------------------------------                        *           *");
		System.out.println("*                                                                     *             *");
		System.out.println("*                                                                     *            *");
		System.out.println("*                                                                   *             *");
		System.out.println("*                                                                   *************");
		System.out.println("*000000000*************************************************000000000***");
		System.out.println("*0       0                                                    0       0");
		System.out.println(" 0       0                                                    0       0");
		System.out.println(" 0       0                                                    0       0");
		System.out.println(" 000000000                                                    000000000");
		
	}
}



