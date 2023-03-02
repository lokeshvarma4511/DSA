import java.util.* ;
import java.io.*;
public class isFlexible {
    public static void main(String[] arg)
    {
        Scanner sc= new Scanner(System.in);
        int T=sc.nextInt();

        for(int i=0;i<T;i++)
        {
            int n=sc.nextInt();
            int [] arr=new int[n];

            for(int j=0;j<arr.length;j++)
            {
                arr[j]=sc.nextInt();
            }
            System.out.println(isFlexible(n,arr));
        }
    }
    // System.out.println(isFlexible(n,arr);)
    public static String isFlexible(int n, int[] arr) {

        String st="NO";
        if(arr[0]<=arr[arr.length-1] )
        {
            for(int k=1;k<arr.length-2;k++)
            {
                if(arr[k]<=arr[k+1])
                {
                    st="YES";
//                    return st;
                }
                else{
                    st="NO";
                    return st;
                }
            }
        }
        else if (arr[0]>arr[arr.length-1])
        {
            for(int h=0;h<arr.length-2;h++)
            {
                if(arr[h]>=arr[h+1])
                {
                    st="YES";
//                    return st;
                }
                else
                {
                    st="NO";
                    return st;
                }
            }
        }
        else
        {
            st="NO";
        }
        return st;
    }
}