import java.util.Scanner;
public class star3 
{
    static int n;
    public void scan()
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the number");
    n=sc.nextInt();
    sc.close();
    }
    
       public static void main(String args[])
       {
        star3 st=new star3();
        st.scan();
        st.loop();
       }
       public void loop()
       {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(i==n||i==1||j==1||j==n){
                System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
       }
}
