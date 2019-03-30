/* Jerome Reduta
30 Mar. 2019 */

import java.util.*;
public class SequenceDriver
{

   // Didn't like how repetitively the Sequences were made, so I made a func for them
   // Also made code clearer

   // Makes # Sequences, based on list of #s, and prints them out
   public static Sequence makeSequence(int[] list, String name) {
      Sequence result = new Sequence();

      for (int index = 0; index < list.length; index ++) {
         result.add(list[index]);
      }

      System.out.println(name + " before: " + result + "\n");

      return result;
   }

   // Program
   public static void main(String[] args)
   {

      // Makes 3 lists of #s (same ones in original vers.)
      // Uses them to create 3 # sequences
      int[] list1 = {1, 4, 9, 16};
      int[] list2 = {9, 7, 4, 9, 11};
      int[] list3 = {16, 4, 9, 4, 7, 9, 9, 11, 16, 1};
      Sequence firstSequence = makeSequence(list1, "First");
      Sequence secondSequence = makeSequence(list2, "Second");
      Sequence thirdSequence = makeSequence(list3, "Third");

      // Test Case: Append()
      Sequence combinedSequence = firstSequence.append(secondSequence);
      System.out.print("Appended: ");
      System.out.println(combinedSequence.toString());
      System.out.println("Expected: [1, 4, 9, 16, 9, 7, 4, 9, 11] \n");

      // Test case: Merge()
      Sequence mergedSequence = firstSequence.merge(secondSequence);
      System.out.print("Merged: ");
      System.out.println(mergedSequence);
      System.out.println("Expected: [1, 9, 4, 7, 9, 4, 16, 9, 11] \n");

      // Test case: MergeSorted()
      Sequence mergedSortedSequence = firstSequence.mergeSorted(secondSequence);
      System.out.print("Merged sorted: ");
      System.out.println(mergedSortedSequence);
      System.out.println("Expected: 1, 4, 4, 7, 9, 9, 9, 11, 16 \n");

      // Test case: Making sure 1st and 2nd sequences are unchanged by the funcs
      System.out.print("First after: ");
      System.out.println(firstSequence.toString() + "\n");
      System.out.print("Second after: ");
      System.out.println(secondSequence.toString() + "\n");

      // Test case: RemoveDuplicates(), making sure list IS changed by the funcs
      thirdSequence.removeDuplicates();
      System.out.print("Third after no duplicates: ");
      System.out.println(thirdSequence);
      System.out.println("Expected: 1, 4, 7, 9, 11, 16 (any order) \n");

   }


}