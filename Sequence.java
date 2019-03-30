/* Jerome Reduta
29 Mar. 2o19
*/

import java.util.*;

public class Sequence
{
// Data: 1 ArrayList of Integers
   private ArrayList<Integer> values;

   public Sequence()
   {
      values = new ArrayList<Integer>();
   }

// Add an int to values
   public void add(int n)
   {
      values.add(n);
   }

// getters and setters
/* Changeable:
	N/A
Not changeable:
	All of them
*/

   public ArrayList<Integer> getValues() {
   	return values;
   }

   public String toString()
   {
      return values.toString();
   }

//Creates a new list made of two lists joined together

   public Sequence append(Sequence other) {

   	Sequence result = new Sequence();
   	ArrayList<Integer> list = new ArrayList<Integer>(values);
    list.addAll(list.size(), other.getValues());

    for (int index = 0; index < list.size(); index++) {
    	result.add(list.get(index));
    }

   return result;
}

// Adds elements to list, alternating elements from each list
// Once one list runs out of elements, just adds the rest of the list on
	public Sequence merge(Sequence other) {
		Sequence result = new Sequence();
		System.out.println("Hello IntelliJ");

		ArrayList<Integer> copy = new ArrayList<Integer>(values);
		ArrayList<Integer> copy2 = new ArrayList<Integer>(other.getValues());

		
		for (int index = 0; index < copy.size() || index < copy2.size(); index++) {
			if (index < copy.size()) {
				result.add(copy.get(index));
			}

			if (index < copy2.size()) {
				result.add(copy2.get(index));
			}
		}

		return result;
	}

// Returns a sequence, appended to another, in order least to highest (using bubble sort)
// Note: BubbleSort code adapted from pseudocode in "Discrete Mathematics and Its Applications,"
// By Kenneth Rosen
	public Sequence mergeSorted(Sequence other) {
		return BubbleSort.sortSequence(append(other));
	}


/* Bubble sorts sequence from least to greatest, compares 2 #s next to each other,
	removes the 1st one if they are duplicates, and returns list of distinct #s */
	public void removeDuplicates() {

		BubbleSort.sortSequence(this);

		int index = 1;

		while (index < values.size()) {
			if (values.get(index) == values.get(index-1)) {
				values.remove(index-1);
			}

			else {
				index++;
			}
		}
	}


}

