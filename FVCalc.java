// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args) {
		int currentValue =  Integer.parseInt(args[0]);
		double annualRate = Double.parseDouble(args[1]);
		int yearsNum = Integer.parseInt(args[2]);
		// Future value calculation
		double futureValue = currentValue * Math.pow((1 + annualRate / 100), yearsNum);
		
		System.out.println("After " + yearsNum + " years, a $" + currentValue + " saved at " +
							annualRate + "% will yield $" + (int) futureValue);
	}
}