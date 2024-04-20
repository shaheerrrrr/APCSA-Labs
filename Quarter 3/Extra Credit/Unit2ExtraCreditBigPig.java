/* Shaheer Khan
On my honor, I have not given nor received aid on this lab */

import java.util.*;

public class Unit2ExtraCreditBigPig
{
   public static void main(String[] args)
   {
      int dice1, dice2, playerOneTotal, playerTwoTotal;
      String player1, player2;
      playerOneTotal = 0;
      playerTwoTotal = 0;
      boolean reroll;
      boolean won = false;
      boolean playerOneTurn = true;
      int count1 = 0;
      int count2 = 0;
      int turnTotal = 0;
   
      Scanner input = new Scanner(System.in);
   
   //player names
      System.out.print("Player 1 Name: ");
      player1 = input.nextLine();
      System.out.print("Player 2 Name: ");
      player2 = input.nextLine();
   
      while (!won)
      {
         if (playerOneTurn)
         {
            System.out.println(player1 + "'s turn:");
            turnTotal = 0;
            count2 = 0;
            dice1 = (int)(Math.random() * 6) + 1;
            dice2 = (int)(Math.random() * 6) + 1;
         
            if (dice1 == dice2 && dice1 == 1)
            {
               turnTotal += 25;
            }
            else if (dice1 == dice2 && dice1 != 1)
            {
               turnTotal += dice1 * 4;
            }
            else if ((dice1 == 1 || dice2 == 1) && dice1 != dice2)
            {
               turnTotal = 0;
            }
            else
            {
               turnTotal += dice1 + dice2;
            }
            System.out.println("Dice 1: " + dice1);
            System.out.println("Dice 2: " + dice2);
            System.out.println("Total Points this Turn: " + turnTotal + "\n");

         //reroll functionality
            if (count1 == 0 && dice1 != 1 && dice2 != 1)
            {
               System.out.println("Write true if you would like to reroll, false if not");
               reroll = input.nextBoolean();
            
               if (!reroll)
               {
                  playerOneTurn = false;
               }
               else
               {
                  count1++;
                  turnTotal = 0;
               }
            }
            else
            {
               playerOneTurn = false;
            }
         }
         System.out.println("TOTAL POINTS: " + playerOneTotal + "\n");
         
      //win decider player 1
         playerOneTotal += turnTotal;
         turnTotal = 0;
         if (playerOneTotal >= 100)
         {
            won = true;
         }
         
         //player 2
         if (!playerOneTurn)
         {
            System.out.println(player2 + "'s turn:");
            turnTotal = 0;
            count1 = 0;
            dice1 = (int)(Math.random() * 6) + 1;
            dice2 = (int)(Math.random() * 6) + 1;
         
            if (dice1 == dice2 && dice1 == 1)
            {
               turnTotal += 25;
            }
            else if (dice1 == dice2 && dice1 != 1)
            {
               turnTotal += dice1 * 4;
            }
            else if ((dice1 == 1 || dice2 == 1) && dice1 != dice2)
            {
               turnTotal = 0;
            }
            else
            {
               turnTotal += dice1 + dice2;
            }
            System.out.println("Dice 1: " + dice1);
            System.out.println("Dice 2: " + dice2);
            System.out.println("Total Points this Turn: " + turnTotal + "\n");

            //reroll functionality
            if (count2 == 0 && dice1 != 1 && dice2 != 1)
            {
               System.out.println("Write true if you would like to reroll, false if not");
               reroll = input.nextBoolean();
            
               if (!reroll)
               {
                  playerOneTurn = true;
               }
               else
               {
                  count2++;
                  turnTotal = 0;
               }
            }
            else
            {
               playerOneTurn = true;
            }
         }
         System.out.println("TOTAL POINTS: " + playerTwoTotal + "\n");
         
      //win decider player 2
         playerTwoTotal += turnTotal;
         turnTotal = 0;
         if (playerTwoTotal >= 100)
         {
            won = true;
         }
      }
   
      if (won)
      {
         if (playerOneTotal >= 100)
         {
            System.out.println(player1 + " has won with " + playerOneTotal + " points! Congrats!");
         }
         else
         {
            System.out.println(player2 + " has won with " + playerTwoTotal + " points! Congrats!");
         }
      }
   }
}