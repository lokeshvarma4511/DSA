package company.pwc;

public class FunOverloading
{
    public static void main(String[] args)
    {
        func(245);
    }
    static void func(int a)
    {
        System.out.println("int func :"+a);
    }
    static void func(char a)
    {
        System.out.println("char func:"+a);
    }
}
