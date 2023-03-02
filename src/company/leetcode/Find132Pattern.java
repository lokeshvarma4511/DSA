package company.leetcode;

public class Find132Pattern
{
    public static void main(String[] args) {
        int[] arr={23,235,};
        System.out.println(find132pattern(arr));
    }
    static boolean find132pattern(int[] arr)
    {
        for(int i=0;i<arr.length-2;i++)
        {
            for(int j=i+1;j<arr.length-1;j++)
            {
                for(int k=j+1;k<arr.length;k++)

                {
                    //132
                    if(arr[i]<arr[k] && arr[j]>arr[k])
                    {
                        return true;
                    }
                }
                }
        }
        return false;
    }
}
