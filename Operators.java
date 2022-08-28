package company.dsa;

import java.util.ArrayList;

public class Operators
{
    public static void main(String[] args) {
//        /*the only operator overloading
//        in java is string concatination (+) used
//        with atlest one sting obj
//         */
//        //operator overloading
//        //adding ASCII values
//        System.out.println('a'+'b');
//        System.out.println('a'+3);
//        System.out.println('a'-3);
//
//        //concatination
//        System.out.println("a"+"b");
//        //casting
//        System.out.println((char)('a'+4));
//        System.out.println("a"+1);
//        System.out.println("a"+ new ArrayList<>());
//        //new Integer is an object so it calls toString then adds
//        System.out.println("a"+new Integer(34));
//        // anywhere between any objects should be string to perform addition
////        System.out.println(345+ArrayList);
//        System.out.println(39+""+new ArrayList<>());


        //Performance

        String s1 = "start ";
        for(int i=0;i<26;i++)
        {
            char ch = (char) ('a' + i);
            s1+=ch;
        }
        s1+=" end";
        System.out.println(s1);

    }
}
