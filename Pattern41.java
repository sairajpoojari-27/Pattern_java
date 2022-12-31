import java.util.Scanner;
class Pattern41
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
            for (int j = cols; j >=1; j--) 
            {
                System.out.print(j+" ");
            }
            System.out.println(" ");
        }


    }
}