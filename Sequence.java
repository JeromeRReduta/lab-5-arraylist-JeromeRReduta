import java.util.*;

public class Sequence
{
   private ArrayList<Integer> values;

   public Sequence()
   {
      values = new ArrayList<Integer>();
   }

   public void add(int n)
   {
      values.add(n);
   }

   public ArrayList<Integer> getValues() {
   	return values;
   }

   public String toString()
   {
      return values.toString();
   }

   public Sequence append(Sequence other)
   {

   	Sequence list = new Sequence();
    ArrayList<Integer> otherValues = other.getValues();

    for (int index = 0; index < values.size(); index++) {
     	list.add(values.get(index));
   }

   	for (int index = 0; index < otherValues.size(); index++) {
   		list.add(otherValues.get(index));
   	}

   return list;
}

	public Sequence merge(Sequence other) {
		Sequence result = new Sequence();

		ArrayList<Integer> copy = new ArrayList<Integer>(values);
		ArrayList<Integer> copy2 = new ArrayList<Integer>(other.getValues());

		int index = 0;
		while (index < copy.size() || index < copy2.size()) {
			if (index < copy.size()) {
				result.add(copy.get(index));
			
			}

			if (index < copy2.size()) {
				result.add(copy2.get(index));
				
			}
		}

		return result;
	}

	public Sequence mergeSorted(Sequence other) {

		System.out.println("a");
		Sequence bigList = append(other);
		
		Collections.sort(bigList.getValues());

		return bigList;

	}

	public void removeDuplicates() {
		Collections.sort(values);

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


/* Clone prjoect from github
Open Intellij
Check out from Version control
Click Git
Clone url
Click yes on popup
Will open project w/ github resources
Click next
Choose whatever name you want
Click next - next - next
Use SDK 11 (new vers)
Click Finish
Should have all of Intellij and cloned repository
Can see Projects in left tab

Note: This should basically work like PyCharm for Java
*/