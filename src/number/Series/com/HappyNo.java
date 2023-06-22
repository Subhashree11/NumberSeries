package number.Series.com;

import java.util.Scanner;

public class HappyNo {

	public static void main(String[] args) {
		int n,temp,sum=0;

		Scanner sc= new Scanner(System.in);

		System.out.print("Enter a number: "); 
		n = sc.nextInt();

		while (sum != 1 && sum != 4) {
			sum = 0;

			while (n > 0){
				temp = n % 10;
				sum += (temp * temp);
				n = n / 10;

			}
			n = sum;

		}
		//  repeatedly sum the squares of its digits until the result is either 1 or a previously obtained sum.
		//If the result is 1, the number is happy.


		if(sum==1) {
			System.out.println( "it is a happyno");
		}
		else
			System.out.println( " it is not a happyno");

	}

}


