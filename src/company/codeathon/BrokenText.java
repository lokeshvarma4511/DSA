package company.codeathon;
import java.util.*;
public class BrokenText {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int T1 = sc.nextInt();
            for(int i=0;i<T1;i++)
            {
                int N=sc.nextInt();
                int[] A=new int[N];
                for (int j = 0; j <N; j++) {
                    A[j] = sc.nextInt();
                }
                System.out.println(call(N,A));
            }
        }
        static int call(int N, int[] A)
        {
            int count=0;

            if(A[0]!=A[N-1])
            {
                for(int k=0;k<N-1;k++) {
                    if (A[k]!=A[k+1])
                    {
                        count+=2;
                    }
                }
            }
            if(A[0]==A[N-1])
            {
                for (int i = 0; i <N ; i++) {
                    if(A[i]!=A[0])
                    {
                        count+=N-2;
                    }
                }
            }
            return count;
        }
}