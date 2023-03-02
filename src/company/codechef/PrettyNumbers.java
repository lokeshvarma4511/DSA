package company.codechef;
import java.util.Scanner;
public class PrettyNumbers
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i = 0;i<T;i++)

        {
            int L = sc.nextInt();
            int R = sc.nextInt();
            int count =0;
             for(int j=L;j<=R;j++)
             {
                 if(j%10==2||j%10==3||j%10==6)
                 {
                     count++;
                 }
             }
            System.out.println(count);
        }
    }
}
