package Assignment2;
import java.util.Scanner;

public class ascii_char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s =new Scanner(System.in);
		System.out.print("enter a cha :");
		char ch=s.next().charAt(0);
		int asciivalue=ch;
		System.out.println("ascii value of given char is : " +asciivalue);

	}

}
