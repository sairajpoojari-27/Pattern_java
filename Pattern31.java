import java.util.Scanner;
class Pattern31
{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the rows: ");
        int rows=sc.nextInt();
        System.out.println("enter the column: ");
        int cols=sc.nextInt();
		int space=0;
		int star=(2*rows)-1;
		for(int i=1;i<=rows;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" "+" ");
			}
			for(int k=1;k<=star;k++)
			{
				System.out.print("*"+" ");
			}
			System.out.println(" ");
			space++;
			star=star-2;
		}
		
	}

}
