import java.util.Scanner;

public class Que18Duplicate {

	public static void main(String[] args) 
	{
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter String: ");
		String str = s.nextLine();
		char[] ch = str.toCharArray();
		System.out.println("Duplicate characters are: ");
		for(int i=0; i<str.length(); i++)
		{
			//for(int j=0;j<str.length();j++)
		    for(int j=i+1;j<str.length();j++)
		    {
		        if(ch[i]==ch[j]) 
		        {
		            System.out.print(ch[j]);
		        }
		    }
		}


	}

}
