package Assignment2;
import java.util.Scanner;
public class product_of_decimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.print("enter a float number : ");
		float a = s.nextFloat();
		System.out.print("enter a integer number : ");
		int b=s.nextInt();
		float c=a*b;
		System.out.println("product of int and decimal is :" +c);


	}

}
