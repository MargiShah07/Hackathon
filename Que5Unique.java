import java.util.Scanner;

public class Que5Unique 
{

	public static void main(String[] args) 
	{	
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the length of an Array: ");
		int arrlen = s.nextInt();
		int[] arr = new int[arrlen];
		System.out.println("Provide the numbers for array: ");
		for(int i=0;i<arrlen;i++)
		{
			arr[i]=s.nextInt();
		}
		
		int[] a = new int[220];
		
		for(int i = 0;i<arrlen;i++)
		{
			a[arr[i]]++;
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
