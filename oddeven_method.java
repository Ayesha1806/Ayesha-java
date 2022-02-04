package Assignment2;
import java.util.Scanner;

public class oddeven_method {
    public static void oddeven(int n) {
	if(n%2==0) {
		System.out.println("given number is even :");
	}
	else {
		System.out.println("given numbe is odd");
	}
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("enter a number :");
		int n=s.nextInt();
		
		oddeven(n);
			
	}

}
