import java.util.Scanner;

public class Que20Duplicate {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter String: ");
		String str = s.nextLine();
		char[] ch1 = str.toCharArray();
		int uppercase = 0;
		int count=0;
		for(int i = 0; i < str.length(); i++) 
		{
			for(int j=i+1;j<ch1.length;j++)
			{
				if(ch1[i]==ch1[j])
				{
					System.out.print(ch1[j]);
				}
				
			}
			System.out.println(ch1[i] + " Occurred :" + count + " times.");
			//System.out.println(count);
			count=0;	
			char ch = str.charAt(i);
			if (ch >= 'A' && ch <= 'Z')
			{	
				uppercase++;
			}


		}

		System.out.println("Total Number of repeated upper case character are: " + uppercase);


		//System.out.println("Total Number of upper case character"+ch1+ " are: " + uppercase);
	}

}
