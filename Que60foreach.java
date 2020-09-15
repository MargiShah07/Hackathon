import java.util.Scanner;

public class Que60foreach {
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
		 
		for(int num : arr)
		{
		        System.out.print(num);
		}
	}
}
