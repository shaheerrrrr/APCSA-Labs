/* Shaheer Khan
On my honor, I have not given nor received unauthorized aid on this assignment
*/

/**
* The SegregatedBinary class creates a randomly generated array of 0's and 1's,
* then segregates the 0's to the left side of the array and the 1's to the right.
* @author Kimberly A. Baram
* @version 1.0
*/

import java.util.*;
public class SegregatedBinary{

public static Scanner input = new Scanner(System.in);
/**
  * Builds and returns an array with a random number of elements
  * (between 10 and 20, inclusive), filled with randomly
  * generated 0's and 1's
  * @return The randomly generated array
  */
   public static int[] buildArray()
   {
      int[] arr = new int[(int)(Math.random() * 11) + 10];
      for (int i = 0; i < arr.length; i++)
      {
         arr[i] = (int)(Math.random() * 2);
      }
      return arr;
   }

/**
  * Prints the contents of the passed array.
  * @param arr the array to be printed.
  */
   public static void printArray(int[] arr)
   {
      System.out.print("[ ");
      for (int num : arr)
      {
         System.out.print(num + " ");
      }
      System.out.print("]");
   }

/**
  * Counts and returns the number of zeros in the passed array.
  * @param arr the array to count zeros
  * @return the number of zeros
  */
   public static int countZeros(int[] arr)
   {
      int zeroes = 0;
      for (int i = 0; i < arr.length; i++)
      {
         if (arr[i] == 0)
         {
            zeroes++;
         }
      }
      return zeroes;
   }

/**
  * Builds and returns a NEW array containing the same number of one's and
  * zero's as the original, but with the 0's to the left and the 1's to the right.
  * Example: if arr contains {0, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0}
  * then the returned array is {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1}
  * @param the array on which the returned array is based
  * @return a new array with the 0's and 1's segregated
  */
   public static int[] rearrange(int[] arr){
      int[] natan = new int[arr.length];
      for (int i = countZeros(arr); i < arr.length; i++)
      {
         natan[i] = 1;
      }
      return natan;
   }

/**
  * Prints the numbers of zeros and ones contained in the passed array.
  * Example: if arr contains {0, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0}
  * Then the following is printed:
  *     Zeros: 10
  *     Ones: 6
  * @param arr the array from which to count the ones and zeros
  */
   public static void printNumOfEach(int[] arr){
      int zeroes = 0;
      int ones = 0;
      for (int i = 0; i < arr.length; i++)
      {
         if (arr[i] == 0)
         {
            zeroes++;
         }
         else if (arr[i] == 1)
         {
            ones++;
         }
      }
      System.out.println("\n\nZeros: " + zeroes + "\nOnes: " + ones);
   }

/**
  * Test the methods written above.
  * @param args not used
  */
   public static void main(String[] args){
      int[] arr = buildArray();
      int[] rearranged = rearrange(arr);
      System.out.println("Original array:");
      printArray(arr);
      printNumOfEach(arr);
      System.out.println("\nSegregated array:");
      printArray(rearranged);
   }
}