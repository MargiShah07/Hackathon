import java.util.Arrays;
import java.util.Scanner;

public class Que3SortInt {

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the length of an Array: ");
		int arrlen = s.nextInt();
		int[] arr = new int[arrlen];
		System.out.println("Provide the number to sort: ");
		for(int i=0;i<arrlen;i++)
		{
			arr[i]=s.nextInt();
		}
		
		Arrays.sort(arr);
		
		System.out.println("Sorted Array is: " +Arrays.toString(arr));
		

	}

}
