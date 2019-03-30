/* Jerome Reduta
30 Mar. 2019 */

import java.util.*;

// Bubble Sort
// Adapted from pseudocode from "Discrete Mathematics and Its Applications," by Kenneth Rosen

public class BubbleSort {

	public BubbleSort(){
	}

// Note: This BubbleSort only developed for Sequences (might revisit later for other types)
	public static Sequence sortSequence(Sequence inputSequence) {
		ArrayList<Integer> values = inputSequence.getValues();

		for (int index = 0; index < values.size()-1; index++) {
			for (int i = 0; i < values.size()-index-1; i++) {
				if (values.get(i) > values.get(i+1)) {

					int temp = values.get(i);
					values.set(i, values.get(i+1));
					values.set(i+1, temp);
				}
			}
		}

		return inputSequence;
	}
}

// PS: Used Bubble Sort b/c it was easiest to make and I didn't want to learn how to code Quicksort
// today