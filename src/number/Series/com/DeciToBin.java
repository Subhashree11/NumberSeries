package number.Series.com;

public class DeciToBin {
	public static void main(String[] args) {
	long n=15,bin=0,temp=1;
	while(n!=0) {
		long rem=n%2;
		n=n/2;
		bin=rem*temp+bin;
		temp=temp*10;
	}
	   System.out.println(bin);
}
}
