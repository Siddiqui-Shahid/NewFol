// Java program to compute
// sum of digits in number.
import java.io.*;

class Sum {
	static int getSum(int n)
	{
		int sum = 0;
		
		while (n != 0)
		{
			sum = sum + n % 10;
			n = n/10;
		}
	
	return sum;
	}
	public static void main(String[] args)
	{
		int n = 1001089;
		int n2 = 1001089;

		System.out.println(getSum(n));
        System.out.println(n+n2);
	}
}

