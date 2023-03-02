package company.codechef;
import java.util.Scanner;
//import java.util.;

public class PlayingWithMatches {
    public static void main(String[] args) {

        int x=143;
        System.out.println(x);



        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int i=0;i<T;i++)
        {
            int A = sc.nextInt();
            int B = sc.nextInt();
            int c=A+B;
            System.out.println(totalMatches(c));

        }
    }

    static int totalMatches(int x)
    {
        int count = 0;

        switch(x)
        {
            case 1:
        }


        return count;
    }
}
