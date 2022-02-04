package Assignment2;
import java.util.Scanner;

public class inch_meter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		//float inch=0.0254f;
		System.out.print("enter the no.of inches : ");
		double n=s.nextDouble();
		double meter=n*0.0254;
		System.out.println("no.of inhed in metters is : " +meter);

	}

}
