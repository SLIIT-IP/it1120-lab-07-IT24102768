import java.util.Scanner;
public class IT24102768Lab7Q3
{
	public static void main(String[]args)
	{
		Scanner input = new Scanner(System.in);
		
		int count=1;
		int TTL_DIS=0;
		while(count<6)
		{
			System.out.print("Customer " + count + "\n");
			System.out.print("Enter total bill amount: ");
			int TT_BILL = input.nextInt();

			System.out.print("Enter mode of payment (C for cash, O for other): ");
			char MD_PY = input.next().charAt(0);
			
			if(MD_PY == 'C' || MD_PY == 'c')
			{
				Double DIS = (double)((TT_BILL * 5)/100);
				Double AMT_PD = TT_BILL - DIS;
				System.out.println("Discount is: " + DIS);
				System.out.print("Amount to be paid: " + AMT_PD);
			}
			else if(MD_PY == 'O' || MD_PY == 'o')
			{
				System.out.println("No discount applicable");
				System.out.print("Amount to be paid: " + (double)TT_BILL);
			}
			else
			{
				System.out.print("Payment Mode is Not Valid");
			}
			count += 1;
			System.out.println("\n");
		}
		
		
	}
}