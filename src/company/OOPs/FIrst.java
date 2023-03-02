package company.OOPs;
public class FIrst
{
    public static void main(String[] args) {
//        Calculator c1= new Calculator();
        Calculator c2= new Calculator(1,4);
//        c1.a1=345;
//        System.out.println("c1== "+c1.a1);
//        System.out.println("2nd para. calc "+c1.calc(2,4));
//        System.out.println("object 2 ");
//        System.out.println(c2.calc());
//
//        System.out.println("count "+Calculator.count);
        Dev d1=new Dev(2,5,4);
        System.out.println(d1.calc(1,2,3));


        Encapsulation en = new Encapsulation();
        en.calc();


            }
}
class Calculator {
    int a1 = 14;
    int b1 = 34;
    static int count;
//    public Calculator()
//    {
//        count++;
//        System.out.println("object created!");
////        System.out.println(count);
//    }
    // constructor overloading
    public Calculator(int a1, int b1)
    {
        //this is of 2 types this to call copnstructor and assign the parameters to self.
//        this();
        this.a1=a1;
        this.b1=b1;
    }
    int calc()
    {
//        System.out.println(a1+b1);
        return a1 + b1;
    }
    //indicated method overloading(polymorphism)
    private void calc(int a, int b) {
        System.out.println(a + b);
    }
}
//inheritance
class Dev extends Calculator{
    public Dev(int a1, int b1, int i) {
        super(a1, b1);
    }
    int calc(int a1, int b1, int i)
    {
        return a1+b1+i;
    }
}