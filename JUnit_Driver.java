/*
 * A class with basic math functionality
 */
public class JUnit_Driver {

	
	
	public JUnit_Driver(){
		
	}
	
	public double findQuotient (double dividend, double divisor)
	{
		double q = dividend / divisor;
		return q;
	}
	
	public double findProduct (double f1, double f2)
	{
		double p = f1 * f2;
		return p;
	}
	
	public double findPower (double base, double exponent)
	{
		double power = Math.pow(base, exponent);
		return power;
	}
}
