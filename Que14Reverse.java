import java.util.Scanner;

public class Que14Reverse {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter String: ");
		String str = s.nextLine();
		String r = "";
		String[] words = str.split(" ");
		//String[] temp = null;
		for (int i = 0; i < words.length; i++) { 
			if (i == words.length - 1) 
				r = words[i] + r; 
			else
				r = " " + words[i] + r;
		}
		//		for (int i = 0; i < words.length; i++)
		//		{		
		//			String word = words[i];
		//
		//			for(int j=word.length()-1;j>=0;j--)
		//			{
		//				r = r + str.charAt(j);
		//			}
		//		}

		System.out.println("Reverse String is: " +r);
	}


}


