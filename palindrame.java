package Assignment2;
import java.util.Scanner;

public class palindrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("enter a string :");
		String str=s.nextLine();
		String rev="";
	

		for(int i=str.length()-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		
	if(str.equals(rev)) {
		System.out.println(" palindrome string ");
		
	}
	else
		System.out.println("not a palindrome string");
	}

}
