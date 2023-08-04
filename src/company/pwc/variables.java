package company.pwc;

public class variables {
    static int x = 22;
    boolean b ;
    char c;
    String s;

    public static void main(String[] args) {
        int x1= 20;


        variables v = new variables();
        System.out.println("This is accessing through object :"+v.x);
        System.out.println("This is accesseds through class name:"+variables.x);
        System.out.println(v.b);
        System.out.println(v.s);
        System.out.println(v.c);
//        System.out.println(x);
//        System.out.println(x1);
    }
}
