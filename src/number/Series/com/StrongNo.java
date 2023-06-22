package number.Series.com;

public class StrongNo {
	public static void main(String[] args) {
		int n=145,m=n,sum=0;
		while(n!=0) {
			int rem=n%10;
			n=n/10;
			int fact=1;
		for(int i=1;i<=rem;i++)
			fact=fact*i;
		sum+=fact;
		}
		   System.out.println(sum==m ? "StrongNo":"NotStrongNo");
}
}
