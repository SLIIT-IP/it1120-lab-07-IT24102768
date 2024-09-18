import java.util.Scanner;
public class IT24102768Lab7Q1A
{
	public static void main(String[]args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter marks for four subjects: ");
		int i;
		int subject=0;

		for(i=1; i<5; i++)
		{
			System.out.print("Enter Subject Marks " + i +":");
			int sub = input.nextInt();
			subject += sub;
		}

		float AVG = subject/4;
		System.out.println("\nAvarage is : "+AVG);
			

		if(AVG <= 49 && AVG >= 0)
		{
			System.out.print("Overall Grade is : Fail");
		}
		else if(AVG <= 74 && AVG >= 50)
		{
			System.out.print("Overall Grade is : Credit");
		}
		else if(AVG <= 100 && AVG >= 75)
		{
			System.out.print("Overall Grade is : Distinction");
		}

	}
}