import java.text.*;
import java.util.*;

/*
 * 3. Answer the following questions:
 * a. Write the code to format number 12345.678 in the United Kingdom locale. Keep two digits after the decimal point.
 * b. Write the code to format number 12345.678 in U.S. currency.
 * c. Write the code to parse '12,345.678' into a number.
*/

public class Part3 
{
	public static void main(String[] args)
	{
		double assignmentNumber = 12345.678;
		String secondAssignmentNumber = new String("12,345.678");
		
		NumberFormat numberFormatUK = NumberFormat.getInstance(Locale.UK);
		numberFormatUK.setMaximumFractionDigits(2);
		System.out.println("The number in UK format: " + numberFormatUK.format(assignmentNumber));
		
		NumberFormat currencyUS = NumberFormat.getCurrencyInstance(Locale.US);
		System.out.println("The number in US currency: " + currencyUS.format(assignmentNumber));
		
		NumberFormat parseNumber = NumberFormat.getInstance();
		try {
			Number parsedSecondAssignmentNumber = parseNumber.parse(secondAssignmentNumber);
			System.out.println("The parsed number: " + parsedSecondAssignmentNumber);
		} catch (Exception e) 
		{
			System.out.println("Error parsing number");
		}
	}
}
