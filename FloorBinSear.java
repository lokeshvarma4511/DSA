package company.dsa;
public class FloorBinSear {
    public static void main(String[] args) {
        int[] arr={12,15,19,26,39,43,47,49,50,60,70,80};
        int tg=30;
        System.out.println(floorSearch(arr,tg));
    }
    // returns the smallest number which is lesser than or equal to target
    static int floorSearch(int[]arr,int tg)
    {
        if(arr.length==0)
        {
            return -1;
        }
        int start=0;
        int end=arr.length;
        while(start<=end)
        {
            int mid=start+(end-start)/2;

            if(arr[mid]==tg)
            {
                return -1;
            }
            else if(arr[mid]<tg)
            {
                start=mid+1;
            }
            else
            {
                end=mid-1;
            }
        }
        return end;
    }
}