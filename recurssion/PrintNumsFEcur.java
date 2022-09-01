package company.dsa.recurssion;

public class PrintNumsFEcur
{
    public static void main(String[] args)
    {

        print(1,5);
    }

    int i=0;
    static void print(int i,int n) {
        if(i<=n)
        {
            System.out.println(i);
            print(i+=1, n);
        }
        else
        {

        }


    }
}
