public class Pizza
{
   private String toppings;   //list of toppings for this pizza
   private double price;
   private int size;          //the size of the pizza, 1 - small, 2 - medium, 3 - large
   
   /**
    * Constructs a medium pepperoni pizza
    */
   public Pizza()
   {
      this(2);
      addTopping("Pepperoni");
   }
   
   /**
    * Constructs a cheese pizza.
    * @param s the indicated size of the pizza
    */
   public Pizza(int s)
   {
      size = s;
      toppings = "Cheese";
      if (size == 1)
      {
         price = 7.99;
      } 
      else if (size == 2)
      {
         price = 11.99;
      }
      else
      {
         price = 14.99;
      }
   }
   
   /**
    * @return the price of this pizza
    */
   public double getPrice()
   {
      return price;
   }
   
   /**
    * Adds a topping to this pizza; adjusts the price according to the size
    * @param topping the topping to be added
    */
   public void addTopping(String topping)
   {
      toppings += " and " + topping;
      if (size == 1)
      {
         price += 1.5;
      }
      else if (size == 2)
      {
         price += 2;
      }
      else
      {
         price += 2.5;
      }
   }
   
   @Override
   /**
    * @return true if obj's toppings and price match this pizza's toppings and price
    */
   public boolean equals(Object obj)
   {
      if (!(obj instanceof Pizza)){
         return false;
      }
      Pizza other = (Pizza) obj;
      if (this.price == other.price && this.toppings.equals(other.toppings)){
         return true;
      }
      return false;
   }
   
   @Override
   /**
    * @return a listing of this pizza's toppings, as well as its size and price
    */
   public String toString()
   {
      String pizzaString = toppings + " Pizza, costs $" + price;
      if (size == 1)
      {
         return "Small " + pizzaString;
      }
      else if (size == 2)
      {
         return "Medium " + pizzaString;
      }
      else
      {
         return "Large " + pizzaString;
      }
   }
}