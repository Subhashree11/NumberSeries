package number.Series.com;
import java.util.Scanner;
public class Factorial {

public static void main(String[] args) {
         int fact=1;
      
   Scanner sc=new Scanner(System.in); 
	System.out.println("Enter the number to find factorial :");

	int n=sc.nextInt();
	while(n>0){ 
		fact=fact*n;
		n=n-1;
   System.out.println("factorial = "+fact);	
	}
	}
}




