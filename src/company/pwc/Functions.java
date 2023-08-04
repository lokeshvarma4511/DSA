package company.pwc;
import java.util.Scanner;
public class Functions
{
    public static void main(String[] args)
    {
        System.out.println(printing());
    }

    static int printing(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your name");

        String name=sc.nextLine();

        System.out.println("enter your age");
        int age=sc.nextInt();
        System.out.println(name);


        return age;
    }
}
