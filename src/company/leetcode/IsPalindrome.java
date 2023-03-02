package company.leetcode;

public class IsPalindrome
{
    public static boolean main(String[] a) {
        // int x=121;
        int x=12;
        if(palindrome(x)==1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static int palindrome(int n)
    {
        int count=0;
        int sum=0, rem=0, k=n;

        while(k!=0)
        {
            rem=k%10;

            sum=sum*10 +rem;

            k=k/10;
        }
        if(sum==n)
        {
            count+=1;
        }
        return count;
    }
}