import java.util.Scanner;

public class Que13Reverse {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter String: ");
		String str= s.nextLine();
		String r = "";
		for(int i=str.length()-1; i>=0;i--)
		{
			r=r+str.charAt(i);
		}
		System.out.println("Reverse String is: " +r);

	}

}
