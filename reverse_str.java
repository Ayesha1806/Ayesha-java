package Assignment2;
import java.util.Scanner; 
import java.io.*;
public class reverse_str {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.print(" enter a sting :");
		String str =s.nextLine();
		String rev=" ";
		char ch;
		for(int i=str.length()-1;i>=0;i--) {
			  
			 rev=rev+str.charAt(i);
		}
		System.out.println("reverse of given sting is : " +rev);
		
		
		


	}

}
