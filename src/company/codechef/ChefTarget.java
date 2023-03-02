package company.codechef;
import java.util.Scanner;
public class ChefTarget {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        System.out.print("enter size of array:");
    int t=sc.nextInt();
    int[] arr=new int[t];
        System.out.print("enter elements:");
    for(int i=0;i<t;i++)
    {
        arr[i]=sc.nextInt();
    }
        System.out.println(count(arr));
    }
    static int count(int[] arr)
    {
        int count=0;

        for(int i=0;i<arr.length;i++)
        {
            if (arr[i]>=10)
            {
                count++;
            }
        }
        return count;
    }
}
