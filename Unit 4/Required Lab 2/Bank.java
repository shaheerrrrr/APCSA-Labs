/* Shaheer Khan
On my honor, I have not given nor received unauthorized aid on this assignment
*/

//accepts negative values for deposit and withdrawal, leading to inappropriate transactions
//crashes when I try to exit transaction.

import java.util.Scanner;
import java.text.*;

/**
 * The Bank class simulates a bank containing account data on several clients. Clients may create a new account (space permitting), 
 * or make withdrawals or deposits using their existing account.
 * @authoer Kimberly A. Baram
 * @version 1.0
 */
public class Bank{

   /**
    * Maintains the account records of each client. Non-active accounts are null.
    */
   private static BankClient[] clients = new BankClient[3];
   
   /**
    * The number of accounts currently active.
    */
   private static int numActiveAccounts = 0;
   
   /**
    * Allows for keyboard input from the user
    */
   private static Scanner input = new Scanner(System.in);
   
   /**
    * Create a new account for a client
    */
   private static void createNew(){
   
     //Is the bank at capacity for clients?
      if (numActiveAccounts == clients.length){
         System.out.println("Sorry, we cannot accommodate a new account at this time. Returning to main menu.");
         return;
      }
      
      //There is room for a new client
      else{
         System.out.print("Please enter your name: ");
         String name = input.nextLine();
         String pin = "";
         
         //loop ensures proper pin formatting
         while (true){
            try{
               System.out.print("Please choose a 4-digit pin: ");
               pin = String.valueOf(Integer.parseInt(input.nextLine()));
               if (pin.length() > 4){
                  System.out.println("You entered more than 4 digits; we will use your first 4 digits entered: " + pin.substring(0, 4));
               }
               pin = pin.substring(0, 4);
               break;
            }
            catch(Exception e){
               System.out.println("ERROR: Please make sure that your pin contains 4 numerical digits");
            }
         }
         //end formatting loop
         
         menu:
         while(true){
            System.out.println("Would you like to make an initial balance?\n1)Yes\n2)No\n3)Quit and return to main menu");
            int choice = Integer.parseInt(input.nextLine());
            double bal = 0;
            switch (choice){
               case 1: //account with pre-set balance
               
               //loop ensures proper formatting
                  while(true){
                     try{
                        System.out.println("Enter your intitial balance (digits and decimals only)");
                        bal = Double.parseDouble(input.nextLine());
                        break;
                     }
                     catch (Exception e){
                        System.out.println("ERROR: Please make sure that your balance contains a numerical value");
                     }
                  }
               //end formatting loop
               
                  //INSERTION 1
                  /*******************************************************************************
                     Insert one line of code here, using BankClient's 3-arg constructor and
                     setting it into the appropriate array index.
                  ********************************************************************************/
                  
                  clients[numActiveAccounts] = new BankClient(name, pin, bal);
                  //END INSERTION 1
              
                  break menu;
               case 2: //account with no pre-set balance

                  //INSERTION 2
                  /*******************************************************************************
                     Insert one line of code here, using BankClient's 2-arg constructor and
                     setting it into the appropriate array index.
                  ********************************************************************************/
                  clients[numActiveAccounts] = new BankClient(name, pin);
                  
                  //END INSERTION 2
                                
                  break menu;
               case 3: 
                  return;
               default: System.out.println("ERROR: Please enter either a 1, 2 or 3");
            }
         }
         
         //INSERTION 3
         /*******************************************************************************
           Insert one line of code here, confirming creation of the account and displaying
           the account number.
          ********************************************************************************/
         
         System.out.println("Your account has been created and your account number is " + clients[numActiveAccounts].getAccount());
         //END INSERTION 3
          
         numActiveAccounts++;
      }
   }
   
   
   
   /**
    * Deposit funds into an existing account
    * @param client the account making the deposit
    */ 
   public static void deposit(BankClient client){
      double amt = 0;
      
      //loop to ensure proper formatting
      while(true){
         try{
            System.out.println("Enter your deposit amount (digits and decimals only)");
            amt = Double.parseDouble(input.nextLine());
            break;
         }
         catch (Exception e){
            System.out.println("ERROR: Please make sure that your amount contains a numerical value");
         }
      }
      //end formatting loop
      
      //INSERTION 4
      /*******************************************************************************
         Insert two lines of code here:
         
         1) Call the client's deposit method.
         2) Output a confirmation statement showing the deposit amount, account number,
            and new balance.
            NOTE: Use the NumberFormat procedure to display the deposit amount as
                  currency. See BankClient's getBalance method
      ********************************************************************************/
      
      client.deposit(amt);
      System.out.println("Deposit Amount: " + amt + "\nAccount Number: " + client.getAccount() + "\nNew Balance: " + client.getBalance());


      //END INSERTION 4
   }
   
   
   /**
    * Attempt to withdraw funds from an existing account
    */
   public static void withdraw(BankClient client){
      double amt = 0;
      
      //loop to ensure proper formatting
      while(true){
         try{
            System.out.println("Enter your withdrawal amount (digits and decimals only)");
            amt = Double.parseDouble(input.nextLine());
            break;
         }
         catch (Exception e){
            System.out.println("ERROR: Please make sure that your amount contains a numerical value");
         }
      }
      //end formatting loop
      
     
      //INSERTION 5
      /*******************************************************************************
         Insert an if and else:
         
         1) If the withdraw fails, output a message showing the current balance
            and a statement indicating that there are insufficient funds to withdraw
            the amount requested.
         2) Else, output a confirmation statement showing the withdraw amount, account number,
            and new balance.
            NOTE: Use the NumberFormat procedure to display the withdraw amount as
                  currency. See BankClient's getBalance method
      ********************************************************************************/
      
      if (!client.withdraw(amt))
      {
         System.out.println("There are insufficient funds. Your balance is " + client.getBalance());
      }
      else
      {
         System.out.println("Withdraw Amount: " + amt + "\nAccount Number: " + client.getAccount() + "\nNew Balance: " + client.getBalance());
      }
     //END INSERTION 5
   } 
   
   /**
    * Provides client with a menu of options pertaining to their account
    * @param client the account being accessed
    */
   public static void accessAccount(BankClient client){
      while(true){
         System.out.println("\n\n" + client);
         System.out.println("\n\nACCOUNT MENU");
         System.out.println("Enter 1 to deposit funds");
         System.out.println("Enter 2 to withdraw funds");
         System.out.println("Enter 3 to cancel and return to the main menu");
         int choice = Integer.parseInt(input.nextLine());
         switch (choice){
            case 1: deposit(client);
               break;
            case 2: withdraw(client);
               break;
            case 3: 
               return;
            default: System.out.println("Please enter a valid menu choice");
         }
      }
   } 
   
   /**
    * Provides the user with 3 attempts to enter the correct pin for their account
    * @param client the account being accessed
    * @return true if the correct pin is entered within 3 attempts, false otherwise
    */
   public static boolean pinCheck(BankClient client){
      int attempts = 3;
      String pin = "";
      while (attempts > 0){
               //loop to ensure proper formatting
         while(true){
            try{
               System.out.println(attempts + " attempts remaining");
               System.out.print("4-digit Pin: ");
               pin = String.valueOf(Integer.parseInt(input.nextLine())).substring(0, 4);
               break;
            }
            catch (Exception e){
               System.out.println("ERROR: Please enter 4 digits");
            }
         }
      //end formatting loop
         
         //INSERTION 6
         /******************************************************************
           Enter an if block that checks to see if the entered pin is correct.
           If so, output a confirmation statement and return true.
         *******************************************************************/
         if (client.pinCheck(pin))
         {
            System.out.println("Your PIN was correct");
            return true;
         }
         
         
         //END INSERTION 6

         attempts--;
      }
      System.out.println("Sorry, account couldn't be verified. Returning to main menu.");
      return false;
   }
   
   /**
    *  Attempt to find an account that matches the user's input
    */
   public static void searchExisting(){
      String acct;
      
      //loop to ensure proper input format
      while (true){
         try{
            System.out.print("Enter a 6-digit account number: ");
            acct = String.valueOf(Integer.parseInt(input.nextLine())).substring(0, 6);
            break;
         }
         catch (Exception e){
            System.out.println("ERROR: Please make sure you enter 6 numerical digits");
         }
      }
      //end format loop
      
      //INSERTION 7
      /******************************************************************
       Write a loop that will search the active accounts for a matching
       account number. If found, call the pinCheck method above. If pinCheck
       returns true, call the accessAccount method above and pass the 
       matching account.
       
       If not found, output a statement saying so, and that the program
       is returning to the main method.
      *******************************************************************/ 
      boolean foudn = false;
      for (int i = 0; i < clients.length; i++)
      {
         if (clients[i] != null && clients[i].getAccount().equals(acct))
         {
            if (pinCheck(clients[i]))
            {
               accessAccount(clients[i]);
               foudn = true;
            }
         }
      }
      if (!foudn)
      {
         System.out.println("No Account Found");
      }

      //END INSERTION 7
   }
   
   
   /**
    * Displays the main menu to create or access an account
    */
   private static void menu(){
      while(true){
         System.out.println("\n\nMAIN MENU");
         System.out.println("Enter 1 to create a new account");
         System.out.println("Enter 2 to access an existing account");
         System.out.println("Enter 3 to exit");
         int choice = Integer.parseInt(input.nextLine());
         
         //perform action based on user choice
         switch (choice){
            case 1: createNew();
               break;
            case 2: 
               if (numActiveAccounts == 0){
                  System.out.println("Sorry, no accounts currently on record. Returning to the main menu");
               }
               else{
                  searchExisting();
               }
               break;
            case 3: 
               return;
            default: System.out.println("Please enter a valid menu choice");
         }
         //end switch
      }
   } 
   
   /**
    * Triggers initial run of the main menu
    */
   public static void main(String[] args){
      menu();
      input.close();
      System.out.println("\n\nThank you for visiting our bank.");
   }
}