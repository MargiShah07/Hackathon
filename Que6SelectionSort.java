import java.util.Scanner;

public class Que6SelectionSort {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the length of an Array: ");
		int arrlen = s.nextInt();
		int[] arr = new int[arrlen];
		System.out.println("Provide the numbers for array: ");
		for(int i=0;i<arrlen;i++)
		{
			arr[i]=s.nextInt();
		}
		
		for(int i=0;i<=arrlen-1;i++)
		{
			int min = i;
			for(int j=i+1;j<arrlen;j++)
			{
				if(arr[j]<arr[min])
				{
					min = j;
				}
			}
			int temp=arr[min];
			arr[min]=arr[i];
			arr[i]=temp;
		}
		for(int i=0;i<arrlen;i++)
		{
			System.out.println(arr[i]);
		}
	}
}
