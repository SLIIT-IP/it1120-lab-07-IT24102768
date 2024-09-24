public class IT24102768Lab7Q2C
{
	public static void main(String[]args)
	{
		int i;
		int j;
		int k=5;

		for(i=1; i<6; i++)
		{			
			for(j=1; j<=k; j++)
			{
				System.out.print(k);
			}
			System.out.print("\n");
			k-=1;
		}
	}
}