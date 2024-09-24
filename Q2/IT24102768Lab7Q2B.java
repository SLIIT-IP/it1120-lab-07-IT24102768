public class IT24102768Lab7Q2B
{
	public static void main(String[]args)
	{
		int i;
		int j;
		int k=1;

		for(i=1; i<6; i++)
		{
			System.out.print(i + " - ");
			
			for(j=1; j<=k; j++)
			{
				System.out.print("*");
			}
			System.out.print("\n");
			k+=1;
		}
	}
}