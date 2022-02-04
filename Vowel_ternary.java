package Assignment2;
import java.util.Scanner;

public class Vowel_ternary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("enetr a alphabet :");
		char str=s.next().charAt(0);
		String vowel=(str=='a'||str=='e'||str=='i'||str=='o'||str=='u'||str=='A'||str=='E'||str=='I'||str=='O'||str=='U')? " given alpabet is Vowel":" given alphabet is consonent";
         System.out.println(vowel);
	}

}
