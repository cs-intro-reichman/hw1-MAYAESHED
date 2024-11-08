// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		int lim = Integer.parseInt(args[0]);
		//Declares the randoms and adds 1 to lim so it will still remain in the range
		int a =  (int) (Math.random() * lim + 1);
		int b = (int) (Math.random() * lim + 1);
		int c = (int) (Math.random() * lim + 1);
		//Finds out the min, middle and max values
		int minValue = Math.min(a, Math.min(b, c));
		int maxValue = Math.max(a, Math.max(b, c));
		int midValue = a + b + c - minValue - maxValue;

		System.out.println(a + " " + b + " " + c);
		System.out.println(minValue + " " + midValue + " " + maxValue);
	}
}
