package company.leetcode;
import java.util.Arrays;

public class Solution
{
    static boolean in=true;

    public static boolean negativeall(int[] nums)
    {
        boolean b1 = true;
        for (int i = 0; i <nums.length ; i++)
        {
            if (nums[i]>0)
            {
                b1= false;
            }
        }
        return b1;
    }
    public static int maxSubArray(int[] nums)
    {
        int max;
        if(negativeall(nums)==false)
        {
            max=kadens(nums);
            return max;
        }
        else{
            max=min(nums);
        }
        return max;
    }
    public static int min(int[] nums)
    {
        Arrays.sort(nums);
        int max=nums[nums.length-1];
        return max;
    }

    public static int kadens(int[] nums)
    {
        int pointer=0;
        int pointer1=0;
        for(int i=0;i<nums.length;i++)
        {
            pointer=pointer+nums[i];
            if(pointer>pointer1)
            {
                pointer1=pointer;
            }
            if(pointer<0)
            {
                pointer=0;
            }
        }
        return pointer1;
    }
    public static void main(String[] args) 
    {
        int[] nums={35,7,74,-2, -1, -5, -3};
        System.out.println(maxSubArray(nums));
    }
}