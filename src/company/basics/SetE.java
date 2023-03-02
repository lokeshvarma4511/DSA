package company.basics;

import java.util.*;
import java.util.HashSet;
import java.util.Scanner;

public class SetE {
    public static void main(String[] args) {
        HashSet<Integer> s1= new HashSet<Integer>();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n value:");
        int n = sc.nextInt();
        int[] arr1={};
        System.out.println("Enter "+ n + " elements:");
        for (int i = 0; i < n; i++) {
            int a=sc.nextInt();
            arr1[i] = a;
            s1.add(a);
        }
//        Set<Integer> h1= new HashSet<>(Arrays.asList(arr1));
//        long total = list.stream().count();
        System.out.println(s1);
    }
}
