package company.codes;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class RandomLetter {
    public static void main(String[] args)
    {
        Random r = new Random();
        char targetLetter = (char)(r.nextInt(26) + 'a');
        int targetLetterint=Character.getNumericValue(targetLetter)-9;
        System.out.println(targetLetter);
        Scanner sc=new Scanner(System.in);
        int wish1 =8;
        int wish2 = 16;
        int wish3 = 25;
        int guessint;
        int count =0;
        do {
            count+=1;
            char guess;
            System.out.println("enter guess");
            guess= sc.next().charAt(0);
            guessint = guess - '0' -48;
            int diff = 0;
            if(targetLetterint > guessint) {
                diff = targetLetterint - guessint;
            }
            else if (guess>targetLetterint)
            {
                diff =guessint-targetLetterint;
            }
            else
            {
                diff=0;
            }
            if (diff == 0 )
            {
                System.out.println("target " + targetLetter);
                System.out.println("Correct");
                System.out.println("You guessed the letter in "+ count);
            } else if (diff <=wish3 && diff >wish2) {
                System.out.println("cold");
            }
            else if(diff <=wish2 && diff > wish1)
                System.out.println("hot");
            else
            {
                System.out.println("warm");
            }
        }
        while (targetLetterint!=guessint);
    }
}