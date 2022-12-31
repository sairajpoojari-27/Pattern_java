import java.util.Scanner;
class Pattern40
{
    public static void main(String[] args) 
	{
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the rows: ");
        int rows=sc.nextInt();
        System.out.println("enter the column: ");
        int cols=sc.nextInt();
        for (int i = rows; i >=1; i--) 
        {
            for (int j = 1; j <=cols; j++) 
            {
                System.out.print(i+" ");
            }
            System.out.println(" ");
        }


    }
}