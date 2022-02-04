package Assignment2;
import java.util.Scanner;

public class greater_lesser_trnry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s =new Scanner(System.in);
		System.out.print("enter a number :");
		int n=s.nextInt();
		String num=(5>n)?"given number is less than 5":"given number is geater than 5";
		System.out.println(num);
		

	}

}
