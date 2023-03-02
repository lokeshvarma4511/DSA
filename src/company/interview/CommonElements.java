package company.interview;

import java.util.HashSet;
import java.util.Set;

public class CommonElements {
    public static void main(String[] args) {
        int[] arr1={8,5,3,213,24,57};
        int[] arr2={34,1,6,8,24,8};

        commonElements(arr1,arr2);
    }
    static void commonElements(int[] arr1, int[] arr2 )
    {
        Set<Integer> s1=new HashSet<>();
        for(int i=0;i<arr1.length;i++)
        {
            s1.add(arr1[i]);
        }
        Integer[] s11=s1.toArray(new Integer[s1.size()]);

        Set<Integer> s2=new HashSet<>();
        for(int i=0;i<arr2.length;i++)
        {
            s2.add(arr2[i]);
        }
        Integer[] s21=s2.toArray(new Integer[s2.size()]);
        if(s11.length>s21.length) {
            for (int j = 0; j < s21.length; j++) {
                if (s1.contains(s21[j])) {
                    System.out.println(s21[j]);
                }
            }
        }
    }
}
