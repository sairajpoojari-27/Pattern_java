import java.util.Scanner;
class Pattern1
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the rows: ");
		int rows=sc.nextInt();
		System.out.println("enter the columns: ");
		int cols=sc.nextInt();
		for(int i=1;i<=rows;i++)
		{
			for(int j=1;j<=cols;j++)
			{
				System.out.print("*"+" ");
			}
			System.out.println(" ");
		}
		
		
	}
}
