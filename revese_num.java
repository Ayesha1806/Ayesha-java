package geekster;
import java.util.Scanner;

public class revese_num {

	public static void main(String[] args) {
		int rem;
		// TODO Auto-generated method stub
		Scanner s =new Scanner(System.in);
		System.out.print("ente a number : ");
		int n=s.nextInt();
		int rev=0;
        while(n!=0) {
			rem=n%10;
		    rev=rev*10 + rem ;
		    n=n/10;
		    System.out.println("revers of a given number is : " +rev);
		
        }
		    
		

	}

}
