package company.leetcode;

public class funcOfArray
{
    public static void main(String[] args) {
        int[] arr1={1,-5,-9};
        System.out.println(func(arr1));
    }
    static boolean func(int[] arr)
    {
        boolean b1 = true;
        for (int i = 0; i <arr.length ; i++) 
        {
            if (arr[i]>0)
            {
                b1= false;
            }
        }
        return b1;
    }
}


//class Solution
//{
//    public int maxSubArray(int[] nums)
//
//    {
//
//        static boolean in=true;
//
//        public static boolean negativeall(int[] nums)
//        {
//            boolean b1 = true;
//            for (int i = 0; i <nums.length ; i++)
//            {
//                if (nums[i]>0)
//                {
//                    b1= false;
//                }
//            }
//            return b1;
//
//        }
//        public static void minArray(int[] nums)
//        {
//            if(negativeall(nums)==false)
//            {
//                kadens(nums);
//            }
//            else{
//                min(nums);
//            }
//        }
//        public static void min(int[] nums)
//        {
//            Arrays.sort(nums);
//            System.out.println(nums[nums.length-1]);
//        }
//
//        public static void kadens(int[] nums)
//        {
//            int pointer=0;
//            int pointer1=0;
//            for(int i=0;i<nums.length;i++)
//            {
//                pointer=pointer+nums[i];
//                if(pointer>pointer1)
//                {
//                    pointer1=pointer;
//                }
//                if(pointer<0)
//                {
//                    pointer=0;
//                }
//
//
//            }
//            System.out.println(pointer1);
//        }
//
//
//    }
//
//}