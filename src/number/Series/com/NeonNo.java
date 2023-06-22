package number.Series.com;

public class NeonNo {

	public static void main(String[]args)
	{
		int n=45;
		int square=n*n,sum=0;
		while(square!=0)
		{
			int rem=square%10;
			sum+=rem;
			square=square/10;

		}
		if(sum==n)
			System.out.println("is a neon_no");
		else
			System.out.println("isnot a neon_no");

	}
}
