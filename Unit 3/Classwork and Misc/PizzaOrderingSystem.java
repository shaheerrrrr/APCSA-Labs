import java.util.*;
/**
 * This class models a call-in system to order pizzas. It allows you to specify how many pizzas you would like,
 * what size you would like for each pizza, and what toppings you would like on each pizza. 
 * The program calculates the total price for all pizzas ordered.
 */
public class PizzaOrderingSystem
{
   private static Scanner in = new Scanner(System.in);

   /**
    * Customizes each of the user's pizzas according to size and toppings.
    * @return the price of all pizzas ordered
    */
   public static double buildAllPizzas(int numPizzas)
   {
      double total = 0;
      for (int i = 1; i <= numPizzas; i++)
      {
         System.out.println("Pizza #" + i);
         System.out.println("What size would you like for your pizza? 1 - small, 2 - medium, 3 - large");
         Pizza pie = new Pizza(in.nextInt());
         System.out.println(pie);
         System.out.println("Please add any toppings, or 'done' when finished");
         String topping = in.next();
         while(!topping.equalsIgnoreCase("done"))
         {
            pie.addTopping(topping);
            System.out.println(pie);
            System.out.println("Please add any toppings, or 'done' when finished");
            topping = in.next();
         }
         System.out.println("Great! Here is your final pizza:");
         System.out.println(pie);
         total += pie.getPrice();
      }
      return total;
   }
   
   /**
    * Prompts the user for their name and how many pizzas to be ordered.
    */
   public static void callIn()
   {
      System.out.println("Thank you for calling Sonny Renzo's Pizzeria. May I get a name for this order?");
      String name = in.nextLine();
      System.out.println("And how many pizzas would you like to order today, " + name + "?");
      int numPizzas = in.nextInt();
      double totalPrice = buildAllPizzas(numPizzas);
      System.out.println("Thank you, " + name + ". Your total for your order will be $" + totalPrice);
   }
   
   /**
    * Program starts here
    */
   public static void main(String[] args)
   {
      callIn();
   }
}