import java.util.Scanner;
public class Pattern4 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size : ");
        int num=sc.nextInt();
        m1(num);    
    }
    public static void m1(int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if (i==0 || i==n-1 || (i+j<=(n-1)/2 && i!=0) || (i-j>=(n-1)/2 && i!=n-1))
                System.out.print("*");
                else
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
