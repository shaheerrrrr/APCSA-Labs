/**
 * The CoinSlot class models a single slot in a coin sorter that can take a certain 
 * type of coin. It keeps track of how many rolls were completed and how many coins 
 * are in the partially filled slot
 * @author Kimberly A. Baram, 11/10/2021
 * @version 1.1, revised to include number of completed rolls
 * @since 1.0
 */
public class CoinSlot
{
   private int rollsCompleted, currentCoins, capacity, value;
   
   /**
    * Constructs the slot based on the coin type and number of coins per roll
    * @param v the value in cents of a single coin
    * @param c the number of coins per roll
    */
   public CoinSlot(int v, int c)
   {
      rollsCompleted = 0;
      currentCoins = 0;
      capacity = c;
      value = v;
   }
   
   /**
    * Adds a coin to the slot. If doing so fills a roll, increments
    * the roll count and sets slot coins to 0.
    */
   public void drop()
   {
      currentCoins++;
      
      if (currentCoins == capacity)
      {
         rollsCompleted++;
         currentCoins = 0;
      }
   }
   
   /**
    * returns the value in cents of a full roll
    * @return the value in cents of  a full roll
    */
   public int getFullRollValue()
   {
      return capacity * value;
   }
   
   /**
    * Returns the cent value of all completed rolls
    * @return the total value in cents of all completed rolls
    */
   public int getRollsCompletedValue()
   {
      return rollsCompleted * getFullRollValue();
   }
   
   /**
    * returns the value in cents of the coins currently in the slot
    * @return the value in cents of the coins currently in the slot
    */
   public int getCurrentSlotValue()
   {
      return currentCoins * value;
   }
   
   /**
    * returns a string describing the value of what has been rolled and what is left over
    * @return a string describing the value of what has been rolled and what is left over
    */
   @Override
   public String toString()
   {
      double total = getRollsCompletedValue() * getCurrentSlotValue();
      return rollsCompleted + " rolls, meaning $" + ((total)/100) + " with " + (total % 100) + "cents and " + currentCoins + " leftover coins";
   }
   
}