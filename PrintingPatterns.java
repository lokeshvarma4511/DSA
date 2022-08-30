package company.dsa;

public class PrintingPatterns
{
    public static void main(String[] a)
    {
        int n=5;
        pattern5(n);
    }
    static void pattern1(int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern2(int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=5;j>i;j--)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern3(int n) {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    static void pattern4(int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    static void pattern5(int n) {

        for(int i=0;i<2*n;i++)
        {

            if(i>n)
            {
                int c=i-1;
            }
            for(int j=0;j<i;j++)
            {

                System.out.print("* ");
            }
            System.out.println();
        }
    }
}