package company.pwc;

import java.util.Scanner;

public class Conditions {
    public static void main(String[] args)
    {
        /*
        for
        loop
         */
        /*
        while
        loop
         */

        /*
        do
        while
        loop
         */
//        int a=7;
//        do{
//            System.out.println("hi");
//            a++;
//        }while(a<7);

        Scanner sc=new Scanner(System.in);
        System.out.println("enter");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        System.out.println(Math.max(a,Math.max(b,c)));
    }
}
