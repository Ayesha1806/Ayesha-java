package Assignment2;
import java.util.Scanner;
public class count_noof_digite {

		

	public static void main(String[] args) {
		int count=0;
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("enter a number :");
		int n=s.nextInt();
		
		while(n!=0) {
			
			n=n/10;
			count=count+1;
		}
		System.out.println("no.of digites are pesent in given number is : " +count);
		
	}
			
			
			
			

	

}
