/*Shaheer Khan
On my honor as a student, I have not given nor received unauthorized assistance on this assignment

learned through this link
https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/String/indexOf
*/
import java.util.*;

public class Unit1ExtraCreditNameFlexibility
{
   public static void main(String[] args)
   {
      //Getting Full Name
      Scanner input = new Scanner(System.in);
      System.out.println("Enter name in (first, middle, last) format:");
      String FullName = input.nextLine();
      
      //asking for the number of each
      System.out.println("How many first names do you have?");
      int NumberFirst = input.nextInt();
      
      System.out.println("How many middle names do you have?");
      int NumberMiddle = input.nextInt();
      
      System.out.println("How many last names do you have?");
      int NumberLast = input.nextInt();
      
      int indexOfFirst = FullName.indexOf(" ");
      //string name
      String first = "";
      String middle = "";
      String last = "";
      
      //first name stuf
      first = FullName.substring(0, FullName.indexOf(" ", NumberFirst)); // double quote represents a string
      FullName = FullName.substring(FullName.indexOf(" ", NumberFirst) + 1); //remove first name
   
      //middle name stuf
      middle = FullName.substring(0, FullName.indexOf(" ", NumberMiddle)); //middle initial only
      FullName = FullName.substring(FullName.indexOf(" ", NumberMiddle) + 1); //remove middle name
   
      //last name stuf
      last = FullName;
   
      //Printy stuf
      System.out.println(first);
      System.out.println(middle);
      System.out.println(last);
//       System.out.println("Initials: " + first.substring(0,1) + middle.substring(0,1) + last.substring(0,1)); //initial
//       System.out.println("Rearranged Name: " + last + ", " + first + " " + middle); //rearrange name
   }
}