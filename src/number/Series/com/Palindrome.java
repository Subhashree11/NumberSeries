package number.Series.com;

public class Palindrome {
	
		public static void main(String[] args) {
			int n=12321,ori=n,rev=0;
			while(n!=0) {
				int rem=n%10;
				rev=rev*10+rem;
				n=n/10;
			}
			System.out.println(rev==ori?"yes":"no");
		}
	
}