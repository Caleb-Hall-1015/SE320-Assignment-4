import java.util.LinkedHashSet;
/*
 * 1. Create two linked hash sets {"George", "Jim", "John", "Blake", "Kevin", "Michael"} and {"George", "Katie", "Kevin", "Michelle", "Ryan"} 
 * and find their union, difference, and intersection. (You can clone the sets to preserve the original sets from being changed by these set methods.)
 */

public class Part1 
{
	public static void main(String[] args)
	{
		LinkedHashSet<String> firstLinkedHashSet = new LinkedHashSet<String>();
		String[] firstListOfNames = new String[]{"George", "Jim", "John", "Blake", "Kevin", "Michael"};
		for (String name : firstListOfNames)
		{
			firstLinkedHashSet.add(name);
		}
		
		LinkedHashSet<String> secondLinkedHashSet = new LinkedHashSet<String>();
		String[] secondListOfNames = new String[]{"George", "Katie", "Kevin", "Michelle", "Ryan"};
		for (String name : secondListOfNames)
		{
			secondLinkedHashSet.add(name);
		}
		
		//loop with a switch case to iterate through the 3 parts of the task, and resetting the first hash set before each operation
		for (int i = 0; i < 3; i++)
		{
			LinkedHashSet<String> testerLinkedHashSet = (LinkedHashSet<String>) firstLinkedHashSet.clone();
			switch (i)
			{
				//union
				case 0:
					testerLinkedHashSet.addAll(secondLinkedHashSet);
					System.out.println("Union between first and second LinkedHashSets: " + testerLinkedHashSet.toString());
					break;
				//difference
				case 1:
					testerLinkedHashSet.removeAll(secondLinkedHashSet);
					System.out.println("Difference between first and second LinkedHashSets: " + testerLinkedHashSet.toString());
					break;
				//intersection
				case 2:
					testerLinkedHashSet.retainAll(secondLinkedHashSet);
					System.out.println("Intersection between first and second LinkedHashSets: " + testerLinkedHashSet.toString());
					break;
			}
		}
	}
}
