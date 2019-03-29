import java.util.*;
public class SequenceDriver
{

   public static Sequence makeSequence(int[] list, String name) {
      Sequence result = new Sequence();

      for (int index = 0; index < list.length; index ++) {
         result.add(list[index]);
      }

      System.out.println(name + " before: " + result + "\n");

      return result;
   }

   public static void main(String[] args)
   {
      int[] list1 = {1, 4, 9, 16};
      int[] list2 = {9, 7, 4, 9, 11};
      int[] list3 = {16, 4, 9, 4, 7, 9, 9, 11, 16, 1};
      Sequence firstSequence = makeSequence(list1, "First");
      Sequence secondSequence = makeSequence(list2, "Second");
      Sequence thirdSequence = makeSequence(list3, "Third");


      Sequence combinedSequence = firstSequence.append(secondSequence);
      System.out.print("Appended: ");
      System.out.println(combinedSequence.toString());
      System.out.println("Expected: [1, 4, 9, 16, 9, 7, 4, 9, 11]");

      Sequence mergedSequence = firstSequence.merge(secondSequence);
      System.out.print("Merged: ");
      System.out.println(mergedSequence);
      System.out.println("Expected: [1, 9, 4, 7, 9, 4, 16, 9, 11]");
      System.out.println("a");


      Sequence mergedSortedSequence = firstSequence.mergeSorted(secondSequence);
      System.out.println("b");
      System.out.print("Merged sorted: ");
      System.out.println(mergedSortedSequence);
      System.out.println("Expected: 1, 4, 4, 7, 9, 9, 9, 11, 16");

      System.out.print("First after: ");
      System.out.println(firstSequence.toString());

      System.out.print("Second after: ");
      System.out.println(secondSequence.toString());

      thirdSequence.removeDuplicates();
      System.out.print("Third after no duplicates: ");

      System.out.println(thirdSequence);


      System.out.print("");


   
   
   }


}