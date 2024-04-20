/*Shaheer Khan
On my honor as a student, I have not given nor received unauthorized assistance on this assignment
*/
import java.util.*;

public class Unit1Lab2NameRearrangement
{
   public static void main(String[] args)
   {
   //Getting Full Name
   Scanner input = new Scanner(System.in);
   System.out.println("Enter name in (first, middle, last) format:");
   String FullName = input.nextLine();
   
   //string name
   String first = "";
   String middle = "";
   String last = "";
   
   //first name stuf
   first = FullName.substring(0,FullName.indexOf(" ")); // double quote represents a string
   FullName = FullName.substring(FullName.indexOf(" ") + 1); //remove first name
   
   //middle name stuf
   middle = FullName.substring(0,1); //middle initial only
   FullName = FullName.substring(FullName.indexOf(" ") + 1); //remove middle name
   
   //last name stuf
   last = FullName;
   
   //Printy stuf
   System.out.println("Initials: " + first.substring(0,1) + middle + last.substring(0,1)); //initial
   System.out.println("Rearranged Name: " + last + ", " + first + " " + middle + "."); //rearrange name
   }
}