package geekster;
import java.util.Scanner;

public class Prime_num {
	

	public static void main(String[] args) {
		int temp=0;
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=s.nextInt();
			  for(int i=2; i<=n-1; i++)
				  if(n%i==0)
					  temp=temp+1;
			  if(temp>0)
			System.out.println("given number is non prime");
		    else
			System.out.println("given number is   a prime");

	}

}
