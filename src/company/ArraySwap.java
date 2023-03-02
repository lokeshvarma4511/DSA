package company;
import java.util.Arrays;
public class ArraySwap
{
    public static void main(String[] args) {

                    int[] arr={234,532,3,5};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
//                    swap(arr,1,3);
//        System.out.println(Arrays.toString(arr));
    }
    static void reverse(int[] arr)
    {
        int a=0;
        int b=arr.length-1;
        while(a<b)
        {
//            int x=arr[a];
//            arr[a]=arr[b];
//            arr[b]=x;
            swap(arr,a,b);
            a+=1;
            b-=1;
        }
    }
    private static void swap(int[] arr, int x, int y)
    {
        int temp=arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
    }
}