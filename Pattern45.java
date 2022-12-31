import java.util.Scanner;
class Pattern45
{
    public static void main(String[] args) 
	{
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the rows: ");
        int rows=sc.nextInt();
        System.out.println("enter the column: ");
        int cols=sc.nextInt();
        for (int i = 1; i <=rows; i++) 
        {
			char ch='A';
            for (int j = 1; j <=cols; j++) 
            {
				if(i%2!=0)
				{
                System.out.print(j);
				}
				else
				{
					System.out.print(ch);
				}
			    ch++;
            }
            System.out.println(" ");
        }


    }
}
