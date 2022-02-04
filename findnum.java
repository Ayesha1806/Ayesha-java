package Assignment2;
import java.util.Scanner;

public class findnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("enter a number 10-50 : ");
		int n=s.nextInt();
	String find=(n==10||n==20||n==30||n==40||n==50)?  "given num is correct" : "sorry enter a valid number";
	System.out.println(find);

	}

}
