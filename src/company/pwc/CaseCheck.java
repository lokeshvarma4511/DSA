package company.pwc;
import java.util.Scanner;

public class CaseCheck
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);

        System.out.println("enter");
        char a = sc.next().trim().charAt(0);


        if (a>='a' && a<='z')
        {
            System.out.println("Lower Case");
        }
        else
        {
            System.out.println("Upper Case");

        }

    }


}