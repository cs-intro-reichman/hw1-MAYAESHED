// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
	  int number = Integer.parseInt(args[0]);
	  // Calculates the final numbers
	  int hundredsNum = number / 100;
	  int tensNum = (number / 10) % 10; 
	  int onesNum = number % 10;

	  System.out.println(hundredsNum + " hundreds, " + tensNum + " tens, and " + onesNum + " ones.");
	}
}
