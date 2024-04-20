import java.util.*;
public class Day7InputReview
{
   public static void main(String[] args)
   {
   
   Scanner input = new Scanner(System.in);
   System.out.println("enter your full name");
   String fullName = input.nextLine();
   
   //first name
   String first = fullName.substring(0,fullName.indexOf(" ")); // double quote represents a string
   fullName = fullName.substring(fullName.indexOf(" " ) + 1); // removing first name
   
   // last name
   String last = fullName;
   
   String startWithLastName = last + ", " + first;
   
   System.out.println(startWithLastName);  
   
   
   
   
   
   
   
   
   
   
   
   
   // System.out.println("Describe yourself in 1 word");
//    String word = input.nextLine();
//    System.out.println("How many times have you eaten fast food in the past month");
//    String food = input.nextLine();
//    System.out.println("whats the rating of your favorite app on the app store");
//    String app = input.nextLine();
   }
}