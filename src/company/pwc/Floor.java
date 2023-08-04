package company.pwc;

public class Floor
{
    public static void main(String[] args)
    {
        int x= 4%10;
        int y=98%10;
        System.out.println(floorS(x, y));
    }
    static int floorS(int x, int y)
    {
        if(x>y)
        {
            return x-y+1;
        }
        else
        {
            return y-x+1;
        }
    }
}