package company.leetcode;
import java.util.ArrayList;
import java.util.List;
public class FindingAllMissingCyclicSort
{
    public static void main(String[] args) {
    }
    public List<Integer> findDisappearedNumbers(int[] nums)
    {
        int i=0;
        while(i<nums.length)
        {
            int cor=nums[i]-1;
            if(nums[i]!=nums[cor])
            {
                swap(nums,i,cor);
            }
            else
            {
                i++;
            }
        }
        List<Integer> ans= new ArrayList<>();
        for(int j=0;j<nums.length;j++)
        {
            if(nums[j]!=j+1)
            {
                ans.add(j+1);
            }
        }
        return ans;
    }
    static void  swap(int[] arr, int a,int b)
    {
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}