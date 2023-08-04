package company.pwc;
//import java.util.Arrays;
public class Varargs
{
    public static void main(String[] args)
    {
        varargs(234,2,3423,4,23);
    }
//    static void varargs(int ...v)
//    {
//        System.out.println(Arrays.toString(v));
//    }
    static void varargs(int ...v)  //variable length arg must come at last
    {
        System.out.println(v);
    }
}