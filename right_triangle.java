package geekster;

public class right_triangle {

	public static void main(String[] args) {
		int i;
		// TODO Auto-generated method stub
	
		for( i=1;i<=4;i++) {
			for(int j=4;j>=i;j--) {
				System.out.print(" ");
			}
				
		     for(int k=1;k<=i;k++) {
		    	System.out.print("*");
		     }
		    System.out.println();
		}

	}

}
