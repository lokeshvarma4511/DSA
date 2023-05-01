package company.pwc;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class PhoenNumber {
    public static void main(String[] args) {
//        System.out.println(phoneNumber());


        int  str = 1;
        System.out.println(phoneNumber());
    }
    static String phoneNumber()
    {
        Scanner sc = new Scanner(System.in);
        int[] ar1 = new int[10];
        String str = "";
        System.out.println("enter phone number: "+"\n");

        for (int i = 0; i < ar1.length ; i++)
        {
            int temp = sc.nextInt();
            if(temp>=0 && temp<10)
            {
                ar1[i]=temp;
                str=str+temp;
            }
            else {
                i = i - 1;
                System.out.println("entered invalid number");
            }
        }
//        int number = (int)str - '0';
        return str ;

    }

}