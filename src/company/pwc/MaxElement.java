package company.pwc;

public class MaxElement {
    public static void main(String[] args) {
        int[] arr = {67, 34, 100, -235, 9, 0, -199};
        System.out.println(max(arr));
    }

    static int max(int[] arr)
    {
        int maxEl = Integer.MIN_VALUE;
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]>maxEl) {
                maxEl = arr[i];
            }
        }
        return maxEl;
    }
}
