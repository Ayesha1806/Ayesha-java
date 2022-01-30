package geekster;
import java.util.Scanner;
public class Avg_num {

	public static void main(String[] args) {
		int sum;
		float avg;
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num1=s.nextInt();
		System.out.print("Enter a number: ");
        int num2=s.nextInt();
       sum =num1+num2;
       avg=sum/2;
        System.out.println("Average of two numbers : " +avg);

	}

}
