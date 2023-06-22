package number.Series.com;

public class BinToDecim {
	public static void main(String[] args) {
		long n=111111111,temp=1,dec=0;
		while(n!=0) {
			long rem=n%10;
			n=n/10;
			dec=rem*temp+dec;
			temp=temp*2;
		}
		   System.out.println(dec);
}
}
