//Adapted from the work of Rev. Dr. Douglas R Oberle - Washington, DC

/* Shaheer Khan
 * On my Honor as a Student, I have not received aid on this lab
 */

public class ScaleMutator
{          
//pre:  a and b are valid index #s of list, which is not null
//post: swaps list[a] with list[b]  - modifies the array that is sent
//i.e., given list:[10,20,30,40], a:1, b:3 -> changes list to [10,40,30,20]
   public static void swap(int[] list, int a, int b)
   {
      int temp = list[a];
      list[a] = list[b];
      list[b] = temp;
   }

//pre:  list is not null
//post: list is modified to be sorted in ascending order
//i.e., given list:[4,2,7,5] -> changes list to [2,4,5,7] 
//needs to work with an array of any size             
   public static void sort(int[] list)
   {
      for (int i = 0; i < list.length; i++)
      {
         int max = i;
         for (int u = 0; u < list.length; u++)
         {
            if (list[u] < list[max])
            {
               max = u;
               if (i != max)
                  swap(list, i, max);
            }
         }
      }
   }

//pre:   list is not null
//post:  returns a **NEW ARRAY** with the same elements of list, but scrambled (put in random order)
//post:  list is unchanged
//needs to work with an array of any size
   public static int[] createScrambledVersion(int[] list)
   {
      int[] arr = new int[list.length];
      for (int i = 0; i < list.length; i++)
      {
         arr[i] = list[i];
      }

      for (int i = 0; i < arr.length; i++)
      {
         int random = (int)(Math.random() * arr.length);
         int temp = arr[i];
         arr[i] = arr[random];
         arr[random] = temp;
      }

      return arr;
   }

//pre:  list is not null
//post: returns a **NEW ARRAY** with elements in list, but in reverse order
//i.e., given list:[8,5,6,9] -> returns [9,6,5,8]
//post: list is unchanged
//needs to work with an array of any size
   public static int[] createReversal(int[]list)
   {
      int[] arr = new int[list.length];
      for (int i = 0; i < list.length; i++)
      {
         arr[i] = list[i];
      }

      int last = arr.length-1;
      for(int i=0; i < arr.length/2; i++)
      {
         swap(arr, i, last-i);
      }

      return arr;
   }

//pre:  list is not null
//post: returns a *NEW ARRAY* (almost double the size of list) with the elements of list as a palindrome.
//i.e., given list:[8,7,9,2] -> returns [1,8,9,2,9,8,1]
//post: list is unchanged
//needs to work with an array of any size
   public static int[] createAPalindrome(int[]list)
   {
      int[] pals = new int[list.length * 2 - 1];
      for (int i = 0; i < list.length; i++)
      {
         pals[i] = list[i];
      }
         
      for (int u = list.length -2; u >= 0; u--)
      {
         pals[pals.length - 1 - u] = list[u];
      }
         
      return pals;
   }   

//pre:  neither first nor second are null, and first.length equals second.length
//post: returns a **NEW ARRAY** with elements from two equally sized array,
//alternating between elements from each array
//[a0, b0, a1, b1, a2, b2, a3, b3, a4, b4,...]
//i.e., given first:[8, 2, 6, 4], second:[432, 100, 999, 536]] -> returns [8, 432, 2, 100, 6, 999, 4, 536]
//post: first and second are unchanged
//needs to work with arrays of any size
   public static int[] createAMerge(int[] first, int[] second)
   {
      int[] merged = new int[first.length * 2];
      int u = 0;
      for (int i = 0; i < merged.length; i += 2)
      {
         if (u < first.length)
         {
            merged[i] = first[u];
            merged[i+1] = second[u];
            u++;
         }
      }
      
      return merged;
   }

 //pre:  list is not null	
 //post: returns a **NEW ARRAY** with elements of list, but
 //alternating between elements from the beginning moving right and elements from the end moving left
 //[1st elem, Last elem, 2nd elem, 2nd to last elem, 3rd elem, 3rd to last elem, 4th elem, 4th to last elem,...]
 //i.e., given list:[0,1,2,3,4,5,6,7] -> returns [0,7,1,6,2,5,3,4]
 //post: list is unchanged
 //needs to work with an array of any size
   public static int[] createSelfAlternation(int[]list)
   {  
      int[] alt = new int[list.length];
      for (int i = 0; i < list.length; i++)
      {
         if (i % 2 == 0)
         {
            alt[i] = list[i/2];
         }
         else
         {
            alt[i] = list[(list.length - 1)/ 2];
         }
      }
      
      return alt;
   }

//pre:  list is not null, note is between 22 and 108
//post:  makes a **NEW ARRAY** containing each element of list, but where every other element is note
//[note, list0, note, list1, note, list2, note, list3, note, list4,]
//if list:[42, 56, 61, 80] and note:24 -> returns [24, 42, 24, 56, 24, 61, 24, 80]
//post: list is unchanged
//needs to work with an array of any size
   public static int[] createAlternationWithNote(int[] list, int note)
   {
      int[] altWithNote = new int[list.length * 2];
      int u = 0;
      for (int i = 0; i < altWithNote.length; i += 2)
      {
         if (u < list.length)
         {
            altWithNote[i] = note;
            altWithNote[i+1] = list[u];
            u++;
         }
      }
      
      return altWithNote;
   }

//pre:  list is at least of length 3
//post:  makes a **NEW ARRAY** containing triads (groups of 3 consecutive notes in the scale), each starting with successive elements of list
//[1st elem, 2nd elem, 3rd elem, 2nd elem, 3rd elem, 4th elem, 3rd elem, 4th elem, 5th elem,...]
//if list:[1,2,3,4,5,6] -> returns [1,2,3,  2,3,4,  3,4,5,  4,5,6]
   public static int[] createTriadVersion(int[] list)
   {
      int[] triad = new int[(list.length - 2) * 3];

      int u = 0;
      for (int i = 0; i < list.length; i += 3)
      {
         if (u < list.length)
         {
            triad[i] = list[u];
            triad[i+1] = list[u+1];
            triad[i+2] = list[u+2];
            u++;
         }
      }

      return triad;
   }
   
   //This is an OPTIONAL method where you will create your own mutation and show it to Dr. Oberle
   //in B112, or emailing it to him at doberle@fcps.edu.
   //If he is impressed enough by your creativity, he may offer you a "shot at the title."
   //Good luck and to as they say in the Hunger Games, "may the odds be ever in your favor."
   
   // SHAHEER KHAN CREATED PARAMS
   // pre: list.length is 8
   // post: makes a new array containing 1st index, 2nd index, 3rd index, 5th index, 6th index repeated num times
   public static int[] feedOberlesEgo(int[] list, int num)
   {
      int[] pentatonic = new int[5 * num];

      for (int i = 0; i < num; i++)
      {
         pentatonic[(num * 5)] = list[0];
         pentatonic[(num * 5) + 1] = list[1];
         pentatonic[(num * 5) + 2] = list[2];
         pentatonic[(num * 5) + 3] = list[4];
         pentatonic[(num * 5) + 4] = list[5];
      }

      return pentatonic;
   }
}