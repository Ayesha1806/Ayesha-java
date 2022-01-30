package geekster;
import java.util.Scanner;

public class Power_of_number {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		Scanner s= new Scanner(System.in);
		System.out.print("enter a number for base : ");
		int base=s.nextInt();
		System.out.print("enter a number for exponent : ");
		int exponent=s.nextInt();
		int power=1;
		for(int i=1;i<=exponent;i++)
			power=base*power;
		System.out.println("power of given number is :" +power);

		

	}

}
