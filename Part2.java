import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.TreeSet;

//2. Write a program that reads words from a text file and displays all the nonduplicate words in ascending order. (Use a TreeSet to hold the words)

public class Part2 
{
	public static void main(String[] args)
	{
		TreeSet<String> treeSet = new TreeSet<String>();
		File wordListFile = new File("C:\\Users\\chall\\Downloads\\WordList.txt");
		
		try (BufferedReader bufferedReader = new BufferedReader(new FileReader(wordListFile));)
		{
			String nextLine = new String();
			while ((nextLine = bufferedReader.readLine()) != null)
			{
				treeSet.add(nextLine);
			}
			
			bufferedReader.close();
		} catch (FileNotFoundException e) 
		{
			System.out.println("Could not find file, please check path.");;
		} catch (IOException e1) 
		{
			System.out.println("Error while reading file");
		} catch (Exception e2)
		{
			System.out.println("Unknown error");
		}
		
		for (String word : treeSet)
		{
			System.out.println(word);
		}
	}
}
