package Assignment2;
import java.util.Scanner;

public class temp_fhnt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("enter the temperature : ");
		int temp=s.nextInt();
		float fahrenheit=((temp*9)/5)+32;
		System.out.println(fahrenheit);

	}

}
