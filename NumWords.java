// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
	  int Number = Integer.parseInt(args[0]);
	  // Calculates the final numbers
	  int HundredsNum = Number / 100;
	  int TensNum = (Number / 10) % 10; 
	  int OnesNum = Number % 10;

	  System.out.println(HundredsNum + " hundreds, " + TensNum + " tens, and " + OnesNum + " ones.");
	}
}
