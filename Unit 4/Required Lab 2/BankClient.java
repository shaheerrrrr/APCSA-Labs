/* Shaheer Khan
On my honor, I have not given nor received unauthorized aid on this assignment
*/

import java.text.*;
public class BankClient
{
   private String name, account, pin, balanceAsMoney;
   private double balance;
   
   public BankClient(String n, String p, double b)
   {
      name = n;
      pin = p;
      balance = b;
      setBalanceAsMoney();
      createAccountNum();
   }
   
   public BankClient(String n, String p)
   {
      name = n;
      pin = p;
      balance = 0;
      setBalanceAsMoney();
      createAccountNum();
   }
   
   public void createAccountNum()
   {
      account = String.valueOf((int)(Math.random() * 1000000)); //generates a random # between 0 and 999999 and converts to String
      
      while (account.length() < 6){ //in case a 6 digit account number wasn't generated
         account = "0" + account;
      }
   }
   public void setBalanceAsMoney(){
      balanceAsMoney = NumberFormat.getCurrencyInstance().format(balance);
   }
   
   public String getBalance()
   {
      return balanceAsMoney;
   }
   
   public String getAccount()
   {
      return account;
   }
   
   public boolean checkAccount(String ok)
   {
      if (ok.equals(account))
      {
         return true;
      }
      else
      {
         return false;
      }
   }
   
   public boolean pinCheck(String pon)
   {
      if (pon.equals(pin))
      {
         return true;
      }
      else
      {
         return false;
      }
   }
   
   public void deposit(double boudle)
   {
      if (boudle > 0)
      {
         balance += boudle;
         setBalanceAsMoney();
      }
   }
   
   public boolean withdraw(double boudle)
   {
      if (balance - boudle >= 0 && boudle > 0)
      {
         balance -= boudle;
         setBalanceAsMoney();
         return true;
      }
      else
      {
         return false;
      }
   }
   
   @Override
   public String toString()
   {
       return "Name: " + name + "\nAccount #: " + account + "\nBalance: " + balanceAsMoney;
   }
}