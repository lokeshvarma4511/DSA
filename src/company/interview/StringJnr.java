package company.interview;

import java.util.StringJoiner;

public class StringJnr
{


    public static void main(String[] args) {
        StringJoiner s1= new StringJoiner(",","[","]");
        s1.add("ew").add("e");
        System.out.println(s1);

        StringJoiner s2= new StringJoiner(":","{","}");
        s2.add("app").add("le");
        System.out.println(s2);

        s1.merge(s2);
        System.out.println(s1);

    }
}
