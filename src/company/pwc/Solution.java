package company.pwc;
import java.util.Arrays;

class Solution {
    public static void main(String[] args)
    {
        int[]arr={2,5,5,11};
        int tg=10;
        System.out.println(Arrays.toString(twoSum(arr,tg)));
    }
    static int[] twoSum(int[] nums, int target)
    {
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]+nums[j]==target)
                {
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
}