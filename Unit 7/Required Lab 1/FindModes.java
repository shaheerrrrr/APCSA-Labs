/*Shaheer Khan
 * On My Honor as a Student, I have not given nor received aid on this lab
 */

import java.util.*;

import javax.naming.ldap.SortResponseControl;

/*
   This program will randomly generate a sequence of random numbers and determine the mode(s) of the sequence
   This is done using a partially-filled array of NumEntry objects. The filled portion of the array is
   sorted in descending order by frequency. Elements with the highest frequency contain mode values.
   @author Kimberly A. Baram
   @version 3.0
 */
public class FindModes{
   
   /**
    * Prints only the non-null elements of data
    */
   public static void printArray(ArrayList<NumEntry> data){
      
      for (int i = 0; i < data.size(); i++)
      {
         System.out.println(data.get(i));
      }
   }
   
   /**
    * Returns the index of data in which num is the numerical value of the entry, or
    * -1 if there is no entry in data containing num as its value
    */
   public static int indexOf(ArrayList<NumEntry> data, int num){
      for (int i = 0; i < data.size(); i++)
      {
         if (data.get(i).getValue() == num)
            return i;
      }
      return -1;
   }
   

    /*
      Checks to see if data contains an entry with a value of num.
      If so, accesses that entry and records a copy.
      If not, creates a new NumEntry object and stores it in the
      first available index of data.
    */
   public static void addNumToData(ArrayList<NumEntry> data, int num){
      int i = indexOf(data, num);
      if (i > -1)
      {
         data.get(i).recordCopy();
      }
      else
      {
         NumEntry newObj = new NumEntry(num);
         data.add(newObj);
      }
   }
   
    /**
     * Swaps data[a] with data[b]
     */
   public static void swap(ArrayList<NumEntry> data, int a, int b){
      NumEntry temp = data.get(a);
      data.set(a, data.get(b));
      data.set(b, temp);
   }      

    /**
     * Sorts the non-null elements of data by decreasing frequency order.
     */
   public static void sortByDescendingFrequency(ArrayList<NumEntry> data){
      for (int n = 0; n < data.size(); n++)
      {
         int index = n;
         for (int i = n + 1; i < data.size(); i++)
         {
            if (data.get(i).getFreq() >= data.get(index).getFreq())
            {
               index = i;
            }
         }
         swap(data, index, n);
      }
   }
   
    /*
      Prints the mode(s) of data. If the array is properly sorted, then a mode will be any element that
      contains the same frequency as data[0]
    */
   public static void printModes(ArrayList<NumEntry> data){
      for (int i = 0; i < data.size(); i++)
      {
         if (data.get(i).getFreq() == data.get(0).getFreq())
            System.out.print(data.get(i).getValue() + "   ");
         else
            break;
      }
   }
   
   public static void main(String[] args){
      ArrayList<NumEntry> data = new ArrayList<NumEntry>();
      System.out.println("Initial Data:");
      for (int i = 0; i < 15; i++){
         int num = (int)(Math.random() * 10) + 1;
         addNumToData(data, num);
         System.out.print(num + "\t");
      }
      System.out.println();
      sortByDescendingFrequency(data);
      System.out.println("Array Data:");
      printArray(data);
      System.out.println();
      System.out.println("Modes:");
      printModes(data);
      
   }
}