import java.util.Scanner;
class Pattern36
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
            for (int j = 1; j <=cols; j++) 
            {
                if(j%2!=0)
                {
                    System.out.print("1");
                }
                else
                {
                    System.out.print("0");
                }
            }
            System.out.println(" ");
        }


    }
}