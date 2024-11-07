// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args) {
		int CurrentValue =  Integer.parseInt(args[0]);
		double AnnualRate = Double.parseDouble(args[1]);
		int YearsNum = Integer.parseInt(args[2]);
		// Future value calculation
		double FutureValue = CurrentValue * Math.pow((1 + AnnualRate / 100), YearsNum);
		
		System.out.println("After " + YearsNum + " years, $" + CurrentValue + " saved at " +
		AnnualRate + "% will yield $" + (int) FutureValue);
	}
}