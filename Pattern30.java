import java.util.Scanner;
class Pattern30
{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the rows: ");
        int rows=sc.nextInt();
        System.out.println("enter the column: ");
        int cols=sc.nextInt();
		int space=rows-1;
		int star=1;
		if(rows%2==0)
		{
			rows++;
		}
        for (int i = 1; i <=rows; i++) 
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print("."+ " ");
			}
			for(int k=1;k<=star;k++)
			{
				System.out.print("*"+ " ");
			}
			System.out.println(" ");
			if(i>=(rows+1)/2)
			{
				space++;
				star=star-2;
			}
			else
			{
				space--;
				star=star+2;
			}
		}
        
	}
	
}
