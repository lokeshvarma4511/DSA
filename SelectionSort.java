package company.dsa;
import java.util.Arrays;
public class SelectionSort {

    public static void main(String[] arg)
    {
        int[] arr={67,34,100,-235,9,0,-199};
        //function calling
        System.out.println(Arrays.toString(selectionSort(arr)));
    }
    //selection sort algorithm function defining
    static boolean[] selectionSort(int [] arr)
    {
        for(int i=0;i<arr.length-1;i++)
        {
           //max item from remaining array
            int end=arr.length-1-i;
           int max=max(arr,0,end);
        }


        return new boolean[0];
    }
    static int max(int[] arr, int start, int end)
    {
        return start;

    }
}
