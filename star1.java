import java.util.Scanner;
class star1
{
    static int n;
    public static int scr()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        n=sc.nextInt();
        return n;
    }
    public static void loop()
    {
        for(int i=0;i<n;i++)
        {
            for (int j=0;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
    public static void main(String args[])
    {
        scr();
        loop();

    }
}