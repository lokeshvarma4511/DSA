package company.dsa;

public class OrderAgnosticBS
{
    public static void main(String[] args)
    {
        int[] arr ={81,76,50,41,32,20,13};
        int tg=20;
        System.out.println(agnosticBs(arr, tg));
    }

    static int agnosticBs(int[] arr, int tg)
    {
        int start=0;
        int end=arr.length;
        if(arr.length<=0)
        {
            return -1;
        }
        while(start<=end)
        {
            int mid= start+ (end-start)/2;
            if(arr[mid]==tg)
            {
                return mid;
            }
            else if(tg<arr[mid])
            {
                end=mid-1;
            }
            else
            {
                start=mid+1;
            }
        }
        return -1;
    }
}
