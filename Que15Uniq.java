import java.util.Scanner;

public class Que15Uniq
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the length of an Array: ");
		int strlen = s.nextInt();
		String[] str = new String[strlen];
		System.out.println("Provide the numbers for array: ");
		for(int i=0;i<strlen;i++)
		{
			str[i]=s.nextLine();
		}	
	    int sc=str.length;

	    String p=s[0];
	    list.add(p);

	    for(int i=1;i<s.length;i++)
	    {

	      if(!(p==s[i])){
	        list.add(s[i]);
	      }
	      p=s[i];
	    }//i

	    for(int i=0;i<list.size();i++){
	      System.out.println(list.get(i));
	    }
	    
	    
	    
	    
	    
	    
			
		
		//int[] a = new int[str.length];

		for(int i = 0;i<strlen;i++)
		{
			str.c
		}
		for(int j = 0;j<a.length;j++)
		{
			if(a[j]>1)
			{
				System.out.println(j+ " occured "+a[j]+ " times" );
			}
			else if(a[j]==1)
			{
				System.out.println("Unique value: " + j);
			}
		}

	}
}
