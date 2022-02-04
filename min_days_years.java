package Assignment2;
import java.util.Scanner;
public class min_days_years {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s =new Scanner(System.in);
		System.out.print("enter the minutes: ");
		double min=s.nextDouble();
		double min_in_year=60*24*365;
		double year=min/min_in_year;
		System.out.println(" no.of year accourding to mins :" +year );
		int days=(int)(min/60/24)%365;
		System.out.println(" no.of days accourding to mins :" +days);


	}

}
