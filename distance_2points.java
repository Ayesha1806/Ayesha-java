package geekster;
import java.util.Scanner;

public class distance_2points {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("enter x1 value : ");
		int x1=s.nextInt();
		System.out.print("enter x2 value : ");
		int x2=s.nextInt();
		System.out.print("enter y1 value : ");
		int y1=s.nextInt();
		System.out.print("enter y2 value : ");
		int y2=s.nextInt();
		int distance=((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
		System.out.println("distance between two pints is : " +distance);
		
		
		

	}

}
