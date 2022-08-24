package company.dsa;
import java.util.Arrays;
public class CyclicSort {
    public static void main(String[] a) {
        int[] arr = {3, 5, 4, 1, 2};
        System.out.println(Arrays.toString(cyclicSort(arr)));
    }

    static int[] cyclicSort(int[] arr) {
        int i = 0;
        while (i < arr.length - 1)
        {
            if (arr[i]!=i+1) {
            //swapping
                int a=arr[i]-1;
                int b=arr[a];
                int c=arr[i];
                arr[i]=b;
                arr[a]=c;
            }
            else
            {
                i++;
            }
        }
        return arr;
    }
}


//    {
//        //starts from element 0
//        for(int i=0;i<arr.length-1;i++)
//        {
//            //checks whether the ith element value is i+1 or not
//            if(arr[i]!=i+1)
//            {
//                // if not, swaps the element to  element value -1 index < -- >
//                int temp=arr[i]-1;
//                int k=arr[temp];
//                arr[temp]=arr[i];
//                arr[i]=k;
//                i=-1;
//            }
//            // else the loop continues
//        }
//        return arr;
//    }