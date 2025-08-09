import java.util.Scanner;
public class star2 
{
    static int n;
    public void data()
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the number");
        n = sc.nextInt();
        sc.close();
    }
    public void loop()
    {
        for(int i=n;i>0;i--)
        {
            for(int j=n;j>n-i;j--)
            {
                System.out.print(j);
            }
            System.out.println(" ");
        }
    }
    public static void main(String[] args)
    {
        star2 st=new star2();
        st.data();
        st.loop();
    }
    
}
