import java.util.Scanner;
class Pattern44
{
    public static void main(String[] args) 
	{
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the rows: ");
        int rows=sc.nextInt();
        System.out.println("enter the column: ");
        int cols=sc.nextInt();
		char count='A';
        for (int i = 1; i <=rows; i++) 
        {
            for (int j = 1; j <=cols; j++) 
            {
				
                System.out.print(count+" ");
				count++;
            }
            System.out.println(" ");
        }


    }
}