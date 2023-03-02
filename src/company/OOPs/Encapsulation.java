package company.OOPs;

public class Encapsulation
{
    public static void main(String[] args) {
        Calculator f1 = new Calculator(56,7);
        // if calc method in Calculator is private we cannot access it
        System.out.println(f1.calc());
    }
    public void calc()
    {
        System.out.println("calculating");
    }
}