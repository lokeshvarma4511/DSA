package company;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayLists
{
    public static void main(String[] args)
    {
        ArrayList<String> arr = new ArrayList<String>();
        arr.add("spd");
        arr.add("power");
        arr.add("rangers");
//        System.out.println(arr.set(0,"SPD"));
//        System.out.println(arr.contains(233));

        arr.remove(1);
//        System.out.println(arr);
        Scanner sc=new Scanner(System.in);

//        System.out.println("enter size of arraylist: ");
//        int j=sc.nextInt();
//        System.out.println("enter elements of arraylist");
//        for(int i=2;i<j+2;i++)
//        {
//            arr.add(sc.next());
//        }
//        for(int i=0;i<j+2;i++)
//        {
//            System.out.println(arr.get(i));
//        }
        System.out.println(arr.get(1));
    }
}