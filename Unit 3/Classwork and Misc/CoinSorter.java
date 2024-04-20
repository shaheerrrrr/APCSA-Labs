/**
 * The CoinSorter class contains a slot for each coin type: penny, nickel, dime, quarter
 * @author Kimberly A. Baram, 11/10/2021
 * @version 1.1, improved to remove redundancy from roll counters
 * @since 1.0
 */
public class CoinSorter
{
   /**
    * The four coin slots
    */
   
   private CoinSlot pennySlot, nickelSlot, dimeSlot, quarterSlot;
   /**
    * Instantiates the four slots with their respective cent value and number per roll
    */
   public CoinSorter()
   {
      pennySlot = new CoinSlot(1, 50);
      nickelSlot = new CoinSlot(5, 40);
      dimeSlot = new CoinSlot(10, 50);
      quarterSlot = new CoinSlot(25, 40);
   }
   
   /**
    * Accepts a coin and drops it into the appropriate slot.
    * @param coin the coin type (0 - penny, 1 - nickel, 2 - dime, 3 - quarter
    */
   public void drop(int coin)
   {
               //determine what kind of coin was generated
      if (coin == 0)
      {
         pennySlot.drop();
      }
      else if (coin == 1)
      {
         nickelSlot.drop();
      }
      else if (coin == 2)
      {
         dimeSlot.drop();
      }
      else if (coin == 3)
      {
         quarterSlot.drop();
      }
   }

   
   /**
    * Calculates and returns the total value of all filled rolls
    * @return the total value of all filled rolls
    */
   public int getTotalAmountFilled()
   {
      int totalValue = pennySlot.getRollsCompletedValue() + nickelSlot.getRollsCompletedValue() + dimeSlot.getRollsCompletedValue() + quarterSlot.getRollsCompletedValue();
      
      return totalValue;
   }
   
   
   /**
    * Returns a string describing the status of each slot and how much total was rolled.
    * @return a string describing the status of each slot and how much total was rolled.
    */
   public String toString()
   {
      double total = getTotalAmountFilled();
      return pennySlot + "\n" + nickelSlot + "\n" + dimeSlot + "\n" + quarterSlot + "\nYou Have " + (total/100) + "in rolled coins";
   }
   
}