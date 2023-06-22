package number.Series.com;

public class SpyNo {
	public static void main(String[] args) {
		int n=45,fact=1,sum=0;
		while(n!=0) {
			int rem=n%10;
			sum+=rem;
			fact=fact*rem;
			n=n/10;
		}
		if(sum==fact) {
			System.out.println("is a spyno");
		}
			else {
				System.out.println("is not a spyno");

	}
}
}
