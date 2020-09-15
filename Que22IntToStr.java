import java.util.Scanner;

public class Que22IntToStr
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter integer: ");
		int a = s.nextInt();
		String str = Integer.toString(a);
		System.out.println(str);
	}

}
