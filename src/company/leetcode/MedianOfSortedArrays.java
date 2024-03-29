package company.leetcode;

import java.util.Arrays;

public class MedianOfSortedArrays {
    public static void main(String[] args) {
        int[] arr1={1,3};
        int[] arr2={2};
        System.out.println(findMedianSortedArrays(arr1,arr2));
    }
    static float findMedianSortedArrays(int[] arr1, int[] arr2) {
        int a=arr1.length;
        int b=arr2.length;
        int[] arr3 = new int[a+b];
        int c=arr3.length;
        for(int i=0;i<c;i++)
        {
            if(i<a) {
                arr3[i] = arr1[i];
            }
            else
            {
                arr3[i]=arr2[i-a];
            }
        }
        Arrays.sort(arr3);
        //even
        if(arr3.length%2==0)
        {
            //1 2 3 4 5 6 7 8
            int mid=c/2;
            return (float)(arr3[mid] +arr3[mid-1])/2;
        }
        //odd
        else
        {
            // 1 2 3 4 5 6 7 8 9
            int mid= (c+1)/2;
            mid=mid-1;
            return arr3[mid];
        }
    }
}
