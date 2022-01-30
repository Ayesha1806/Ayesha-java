package geekster;
import java.util.Scanner;

public class sum_even_odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.print("enter a number : ");
		int n=s.nextInt();
		int sume=0;
		int sumo=0;
		for(int i=1;i<=n;i++)
		if(i%2==0)
				sume=sume+i;      
		   else
			     sumo=sumo+i;
		      System.out.println("sum of even numbes: " +sume);
		      System.out.println(" sum of odd numbers :" +sumo);
		  

	}

}
