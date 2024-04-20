/*
Shaheer Khan
On my honor as a student, I have not given nor recieved unauthorized assistance on this assignment
*/

//missing honor code statement and SlotMachine pull() method is broken.

/**
 * The Casino class models a player using a slot machine. The cost of the slot machine is randomly generated to be either 5 or 10 coins.
 * The class auto-plays the game until the player runs out of money. A count of how many spins were taken shows at the end.
 * @author kabaram
 * @version 2.0
 */

public class Casino
{
   public static void main(String[] args)
   {
      Player player = new Player("Gamblor");
      int spins = 0;
      SlotMachine machine;
      
      //automatically select the cost of the machine
      if (Math.random() < .5)
      {
         machine = new SlotMachine(5);
         System.out.println("Welcome, " + player.getName());
         System.out.println("You will be using the original machine today, which costs 5 coins");
      }
      else
      {
         machine = new SlotMachine(10);
         System.out.println("Welcome, " + player.getName());
         System.out.println("You will be using the modded machine today, which costs 10 coins");
      }
   
      //keep playing while the player has enough money
      while (player.getMoney() >= machine.getCost())
      {
         spins++;
         machine.pull();
         System.out.println(machine);
         player.setMoney(player.getMoney() - machine.getCost());
         int winnings = machine.calculate();
         if (winnings > 0)
         {
            System.out.println("HIT!!! You win " + winnings + " coins!");
            player.setMoney(player.getMoney() + winnings);
         }
         else
         {
            System.out.println("Too bad! No win on this pull.");
         }
         System.out.println(player + "\n\n");
      
      }
      System.out.println("GAME OVER! You were able to pull " + spins + " times before going broke!");
   
   }
}