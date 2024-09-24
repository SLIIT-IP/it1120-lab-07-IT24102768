import java.util.Scanner;
public class IT24102768Lab7Q1B
{
	public static void main(String[]args)
	{
		Scanner input = new Scanner(System.in);
		
		int i;
		int j;
		int std=3;
		int MRK=4;

		for(j=1; j<=std; j++)
		{
			System.out.println("Student "+j);
			System.out.print("Enter Marks: ");

			String marksLine = input.nextLine();
			String[] marksArray = marksLine.split(" ");

			int total = 0;
			
			for(i=0; i<MRK; i++)
			{
			int mark = Integer.parseInt(marksArray[i]);
			total += mark;
			
			
			}
		
		double AVG = (double)total/MRK;
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
		else 
		{
			System.out.print("No grade");
		}
		}
	}
}