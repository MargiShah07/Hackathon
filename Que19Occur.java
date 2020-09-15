import java.util.Scanner;

public class Que19Occur {

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter String: ");
		String str=s.nextLine();
		char[] ch = str.toCharArray();
		int count=0;

		for(int i=0;i<ch.length;i++)
		{
			for(int j=0;j<ch.length;j++)
			{
				if(ch[i]==ch[j])
				{
					count++;
				}
			}
			System.out.println(ch[i] + " Occurred :" + count + " times.");
			//System.out.println(count);
			count=0;	
		}

		//		for(int i=0; i<str.length(); i++)
		//		{
		//			char ch = 0;
		//			if(str.charAt(i)==ch)
		//			{
		//				count++;
		//			}
		//			System.out.println(ch+ " occured "+ count + " times" );
		//		}
		//		for(int j = 0;j<str.length();j++)
		//		{
		//			if(ch[j]>1)
		//			{
		//				System.out.println(ch[j]+ " occured "+ j + " times" );
		//			}
		//		}
	}

}
