package geekster;
import java.util.Scanner;
public class cmpd_intrest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a;
		Scanner s =new Scanner(System.in);
		System.out.print("enter avalue for princple : ");
		double p=s.nextDouble();
		System.out.print("enter avalue for rate : ");
		double r=s.nextDouble();
		System.out.print("enter avalue for time : ");
		double t=s.nextDouble();
		a=p*Math.pow(1+r/100, t);
		System.out.println("the compound interst is : " +a);



	}

}
