package geekster;
import java.util.Scanner;

public class fact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("enter a number : ");
		int n=s.nextInt();
		int fact=1;
		/*for(int i=n;i>=1;i--)
			fact=fact*i;
		System.out.println(fact);*/
		int i=n;
		while(i>=1) {
			fact=fact*i;
			i--;
		System.out.println(fact);
		

		}
	}

}
