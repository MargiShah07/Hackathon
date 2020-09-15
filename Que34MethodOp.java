
public class Que34MethodOp
{
	public int subtract(int x) 
	{
		return x + negate(x);
	}

	public int negate(int x) 
	{
		int result = 0;
		int temp = x < 0 ? 1 : -1;
		while (x != 0) {
			x += temp;
			result += temp;
		}
		return result;
	}

	/** multiply **/
	public int multiply(int x, int y) 
	{
		if (x < y) {
			return multiply(y, x);  // faster if y < x.
		}

		int result = x;
		for (int i = 0; i < abs(y); i++) 
		{
			result += x;
		}

		if (y < 0) 
		{
			result = negate(result);
		}

		return result;
	}

	private int abs(int y) 
	{
		if (y < 0) 
		{
			return negate(y);
		} else 
		{
			return y;
		}
	}

	/** divide **/
	public int divide(int x, int y) 
	{
		if (y == 0) 
		{
			throw new ArithmeticException("could not be zero");
		}

		int absx = abs(x);
		int absy = abs(y);

		int product = 0;
		int result = 0;
		while (product + absy <= absx) 
		{
			product += absy;
			result++;
		}

		if ((x > 0 && y > 0) || (x < 0 && y <0)) 
		{
			return result;
		} 
		else
		{
			return negate(result);
		}
	}

	public static void main(String[] args) 
	{


	}

}
