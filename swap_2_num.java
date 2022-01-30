package geekster; 
import java.util.Scanner;
public class swap_2_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a value for a : ");
		int a=s.nextInt();
		System.out.print("Enter a value for a : ");
		int b=s.nextInt();
		int temp;
		temp=a;
		a=b;
		b=temp;
		System.out.println("after sawap value of a : " +a);
		System.out.println("after sawap value of b : " +b);
		

	}

}
