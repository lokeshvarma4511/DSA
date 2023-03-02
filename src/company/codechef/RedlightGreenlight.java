    package company.codechef;
    import java.util.Scanner;
    public class RedlightGreenlight {
        public static void  main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int T = sc.nextInt();
            for (int i = 0; i < T; i++) {
                int K = sc.nextInt();
                int N = sc.nextInt();
                int[] arr = new int[N];
                int count = 0;
                for (int k = 0; k < arr.length; k++)
                {
                    arr[k]=sc.nextInt();
                }
                for (int j = 0; j < arr.length; j++) {
                    if (arr[j] > K)
                    {
                        count++;
                    }
                }
                System.out.println(count);
            }


        }
    }
