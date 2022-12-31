import java.util.Scanner;
class Pattern43
{
    public static void main(String[] args) 
	{
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the rows: ");
        int rows=sc.nextInt();
        System.out.println("enter the column: ");
        int cols=sc.nextInt();
		char ch='A';
        for (int i = 1; i <=rows; i++) 
        {
            for (int j = 1; j <=cols; j++) 
            {
                System.out.print(ch+" ");
            }
            System.out.println(" ");
			ch++;
        }


    }
}