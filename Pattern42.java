import java.util.Scanner;
class Pattern42
{
    public static void main(String[] args) 
	{
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the rows: ");
        int rows=sc.nextInt();
        System.out.println("enter the column: ");
        int cols=sc.nextInt();
		int count=0;
        for (int i = 1; i <=rows; i++) 
        {
            for (int j = 1; j <=cols; j++) 
            {
				count++;
                System.out.print(count+" ");
            }
            System.out.println(" ");
        }


    }
}