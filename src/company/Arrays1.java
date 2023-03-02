package company;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays1
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
//        int [][] arr=new int[3][3];
//
//        for(int i=0;i< arr.length;i++)
//        {
//            for(int j=0;j<arr[i].length;j++)
//            {
//                arr[i][j]=sc.nextInt();
//            }
//        }
////        for(int[]  a:arr)
////        {
////            System.out.println(sc.);
////        }
//        for (int[] i:arr)
//        {
//            System.out.println(Arrays.toString(i) );
//        }
        int [] arr;
        arr=new int[]{234,23,423,4,324,23,4,234,2};
        for(int i:arr)
        {
            System.out.println(i);
        }
//        System.out.println(arr);
        System.out.println(Arrays.toString(arr));
    }
}