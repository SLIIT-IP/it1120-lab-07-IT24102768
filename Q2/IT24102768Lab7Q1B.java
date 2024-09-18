import java.util.Scanner;
public class IT24102768Lab7Q1B
{
	public static void main(String[]args)
	{
		Scanner input = new Scanner(System.in);
		
		int i;
		int j;
		int subject=0;

		for(j=1; j<4; j++)
		{
			System.out.println("Student "+j);
			

		for(i=1; i<5; i++)
		{
			System.out.print("Enter Marks: ");
			int sub = input.nextInt();
			
				
			for(i=1; i<4; i++)
			{
				System.out.print("");
				int sub = input.nextInt();
			}


			subject += sub;
		}

		float AVG = subject/4;
		System.out.println("Avarage is : "+ AVG );
			

		if(AVG <= 49 && AVG >= 0)
		{
			System.out.println("Overall Grade is : Fail\n");
		}
		else if(AVG <= 74 && AVG >= 50)
		{
			System.out.println("Overall Grade is : Credit\n");
		}
		else if(AVG <= 100 && AVG >= 75)
		{
			System.out.println("Overall Grade is : Distinction\n");
		}

		}

	}
}