/**
 * The CoinSorterTester class creates a CoinSorter object and deposits 1000 random coins into the sorter.
 * After depositing, following is displayed:
 * 1) The number of each coin type deposited
 * 2) The total monetary amount deposited
 * 3) The total amount that was placed into full coin rolls
 * 4) The amount left in partialy filled rolls
 *
 * @author Kimberly A. Baram, November 10, 2021
 * @version 1.1, reduced redundancy in the CoinSorter class
 * @since 1.0
 */
public class CoinSorterTester{

   /**
    * Generates 1000 random coins to be placed in a sorter and displays how much of it can be rolled
    * @param args not used
    */
   public static void main(String[] args){
      //instantiate the coin sorter and initialize the counters for each coin
      CoinSorter bank = new CoinSorter();
      int pennies = 0, nickels = 0, dimes = 0, quarters = 0;
      
      //generate 1000 coins to deposit
      for (int i = 0; i < 1000; i++){
         int coin = (int)(Math.random() * 4);
         bank.drop(coin);
         //determine what kind of coin was generated
         switch (coin){
            case 0: pennies++;
               break;
            case 1: nickels++;
               break;
            case 2: dimes++;
               break;
            default: quarters++;
         }
      }
      
      //total amount deposited
      int total = pennies + nickels * 5 + dimes * 10 + quarters * 25;
   
      //display how many of each coin was dropped and the total value of all money dropped
      System.out.println("Pennies: " + pennies + "\nNickels: " + nickels +
         "\nDimes: " + dimes + "\nQuarters: " + quarters);
      System.out.println("\nYou put " + (total / 100) + " dollars and " + (total % 100) + " cents into your coin separator");
      
      //show amount that can be taken to bank (i.e. filled rolls only)
      System.out.println(bank);
      
      //calculate and value of coins in partially filled rolls
      int difference = total - bank.getTotalAmountFilled();
      System.out.println("You have " + (difference / 100) + " dollars and " + (difference % 100) + " cents in partial rolls.");
      
   }
}