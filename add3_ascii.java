package Assignment2;
import java.util.Scanner;

public class add3_ascii {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("enter a charater : :");
		char ch=s.next().charAt(0);
		int asciiValue=ch;
		System.out.println("ascii value of ch before adding 3 : " +asciiValue);
		int a=asciiValue+3;
		System.out.println("ascii value after adding 3 : " +a);

	}

}
