import java.util.Scanner;

public class Que11SplitFun {

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter String: ");
		String a = s.nextLine();
		String n = a.trim();
		String[] st = a.split("\\s+");
		System.out.println("no of words in the string: " +st.length);
		System.out.println("Words are: ");
		
		for(String a1:st)
		{
			System.out.println(a1);
		}
	}

}
