package company;

import java.util.*;
import java.lang.*;


public class FoodOrdering {
    static String name;
    static void signup() {

        int  x=validate();

    }

    static String mail;
    static String pass1;
    static int  validate() {
        Scanner sc=new Scanner(System.in);
        int flag=1,count=0,success=0;

        System.out.println("ENTER YOUR NAME :-");
        String name=sc.next();
        int len=name.length();
        for(int i=0;i<=len-1;i++)
        {

            char ch=name.charAt(i);

            if (!((ch >= 'a' && ch <= 'z')
                    || (ch >= 'A'
                    && ch <= 'Z') || ch<='.'))
            {
                System.out.println("PLEASE ENTER VALID NAME");
                flag=0;
                System.exit(0);
                break;
            }

        }



        if (flag==1)
        {


            System.out.println("ENTER YOUR AGE");
            int age =sc.nextInt();
            if (age != 0 && age > 0)
            {
            }
            else
            {
                System.out.println("ENTER VALID AGE");
                System.exit(0);
            }
            count=0;
            System.out.println("ENTER MAIL ID");
            String mail=sc.next();
            int len1=mail.length();

            for(int i=0;i<=len1-1;i++)
            {
                char ch1=mail.charAt(i);
                if(ch1=='@'||ch1=='.' )
                {
                    count++;
                }


            }

            if(count>=2 && len1>=5)
            {
            }
            else
            {
                System.out.println("PLEASE ENTER VALID MAIL ID");
                System.exit(0);
                return 0;
            }
            System.out.println("ENTER PASSWORD");
            String pass1=sc.next();
            int pass1_len=pass1.length();
            if(pass1_len>=8 && pass1_len<=12)
            {
                int caps = 0;
                int small = 0;
                int numbers = 0;
                int special = 0;
                for(int i=0;i<=pass1_len-1;i++)
                {
                    char ch2=pass1.charAt(i);
                    if (ch2 >= 'A'
                            && ch2 <= 'Z')
                    {
                        caps++;
                    }
                    else if (ch2 >= 'a'
                            && ch2<= 'z')
                    {
                        small++;
                    }
                    else if (ch2 >= '0'
                            && ch2<= '9')
                    {
                        numbers++;
                    }
                    else if (ch2 == '@' || ch2== '&' || ch2 == '#' || ch2== '*' || ch2 =='$')
                    {
                        special++;
                    }

                }



                if (caps >= 1 && small >= 1 && numbers >= 1 && special >= 1)
                {


                    if (success == 1)
                    {
                        return 1;
                    }
                }


                else
                {
                    System.out.println("PLEASE ENTER STRONG PASSWORD,YOUR PASSWORD MUST CONTAIN ONE UPPER CASE LETTER,ONE LOWER CASE ,ATLEAST ONE NUMBER AND SPECIAL CHARACTER");
                    System.exit(0);
                    return 0;
                }
            }

            else
            {
                System.out.println("OUR PASSWORD IS VERY SHORT ");
                System.out.println("LENGTH MUST BE BETWEEN 8 TO 12");
                System.exit(0);
                return 0;
            }
            System.out.println("CONFIRM PASSWORD");
            String pass2=sc.next();
            int pass2_len=pass2.length();

            if((!pass1.equals(pass2)))
            {
                System.out.println("PASSWORD MISMATCH PLEASE TRY AGAIN");
                System.exit(0);
                return 0;
            }
            else
            {

            }

            System.out.println("ENTER MOBILE NUMBER");
            String num=sc.next();
            int num_len=num.length();
            if(num_len==10)
            {
                for (int i = 0; i < 10; i++)
                {
                    char chn=num.charAt(i);
                    if (chn >= '0' && chn <= '9')
                    {
                        success=1;
                    }

                }
            }
            else
            {
                System.out.println("PLEASE ENTER VALID MOBILE NUMBER");
                System.exit(0);

            }

        }
        System.out.println("                                          ");
        System.out.println("YOUR ACCOUNT HAS BEEN CREATED SUCCESSFULLY\n\n");

        return 0;


    }



    static void login()
    {
        Scanner bc= new Scanner(System.in);


        System.out.println("  YOUR ARE SUCCESSFULLY  LOGGED IN   ");
        System.out.println("                                      ");
        System.out.println("                                      ");
        System.out.println("          1.SEARCH BY HOTELS          ");
        System.out.println("                                      ");
        System.out.println("          2.SEARCH BY FOOOD            ");
        System.out.println("                                       ");
        System.out.println("            3.EXIT                     ");
        System.out.println("                                       ");
        System.out.println("    PLEASE ENTER SUITABLE OPTION :-     ");
        int ch=bc.nextInt();

        switch(ch)
        {
            case 1:
            {
                search_by_hotels();
                break;
            }
            case 2:
            {
                search_by_food();
                break;
            }
            case 3:
            {
                return;
            }
            default: {
                System.out.println("PLEASE ENTER THE VALID CHOICE");
                break;
            }

        }



    }

    static void search_by_hotels()
    {
        Scanner qw=new Scanner(System.in);
        System.out.println(" PLEASE CHOOSE THE HOTELS ");
        System.out.println("                          ");
        System.out.println("       1.HARI HOTEL       ");
        System.out.println("                          ");
        System.out.println("       2.SHARMI HOTEL      ");
        System.out.println("                          ");
        System.out.println("      3.KEERTHI HOTEL       ");
        System.out.println("                           ");
        System.out.println("  PLEASE ENTER OUR CHOICE  ");
        int chhh=qw.nextInt();
        switch(chhh)
        {
            case 1:
            {
                Hari_food();
                break;
            }
            case 2:
            {
                Sharmi_food();
                break;
            }
            case 3:
            {
                Keerthi_food();
                break;
            }
            default :
            {
                System.out.println("PLEASE ENTER VALID CHOICE");
            }
        }
    }
    static int order,a,b=0,c,e,f,g,h,re;
    static char ys;
    static Object Hari_food()
    {

        int count;
        Scanner as=new Scanner(System.in);
        System.out.println("======== WELCOME TO HARI FOOD ORDERING SYSTEM ========");
        System.out.println("                                                     ");
        System.out.println("             === YOU CAN ORDER NOW ===                ");
        System.out.println("======================================================================");
        System.out.println( "\n\t[1] CHILLI CHICKEN(₹159)\t[2] CHICKEN CURRY(₹500)\t[3] MUTTON CURRY(₹800)\n\n\t[4] MUTTON FRY(₹900)\t[5] FISH FRY(₹350)\t[6]PRAWN CURRY(₹650)\n\n\t\t\t\t   [7] Exit");
        System.out.println("                                                           ");
        System.out.println("======================================================================");
        do {
            System.out.println("\n\n\tEnter your order:-");
            order =as.nextInt();
            System.out.println("\n\n\tDo you want to change your order? (y/n) :");
            ye=as.next().charAt(0);
        }
        while (ye=='y'|| ye=='Y');
        switch(order)
        {
            case 1:
            {
                System.out.println("\n\n\tHow many order? :");
                int ord=as.nextInt();
                a=159;
                b=b+a*order;
                System.out.println("You ordered Chilli Chicken: ₹159");
                System.out.println("\n");
                System.out.println("Number of order is: "+order);
                System.out.println("\n");
                System.out.println("\n\n\n\tYou Have ordered  Chilli Chicken. Sucessfully saved the order!");
                break;
            }
            case 2:
            {
                System.out.println("\n\n\tHow many order? :");
                int ord=as.nextInt();
                c=500;
                b=b+c*order;
                System.out.println("You ordered Chicken Curry: ₹500");
                System.out.println("\n");
                System.out.println("Number of order is: "+order);
                System.out.println("\n");
                System.out.println("\n\n\n\tYou Have ordered Chicken Curry. Sucessfully saved the order!");
                break;
            }
            case 3:
            {
                System.out.println("\n\n\tHow many order? :");
                int ord=as.nextInt();
                e=800;
                b=b+e*order;
                System.out.println("You ordered Mutton Curry: ₹800");
                System.out.println("\n");
                System.out.println("Number of order is: "+order);
                System.out.println("\n");
                System.out.println("\n\n\n\tYou Have ordered  Mutton Curry. Sucessfully saved the order!");
                break;
            }
            case 4:
            {
                System.out.println("\n\n\tHow many order? :");
                int ord=as.nextInt();
                f=900;
                b=b+f*order;
                System.out.println("You ordered Mutton Fry: ₹900");
                System.out.println("\n");
                System.out.println("Number of order is: "+order);
                System.out.println("\n");
                System.out.println("\n\n\n\tYou Have ordered  Mutton Fry. Sucessfully saved the order!");
                break;
            }
            case 5:
            {
                System.out.println("\n\n\tHow many order? :");
                int ord=as.nextInt();
                g=350;
                b=b+g*order;
                System.out.println("You ordered Fish Fry: ₹350");
                System.out.println("\n");
                System.out.println("Number of order is: "+order);
                System.out.println("\n");
                System.out.println("\n\n\n\tYou Have ordered  Fish Fry. Sucessfully saved the order!");
                break;
            }

            case 6:
            {
                System.out.println("\n\n\tHow many order? :");
                int ord=as.nextInt();
                h=650;
                b=b+h*order;
                System.out.println("You ordered Prawn Curry: ₹650");
                System.out.println("\n");
                System.out.println("Number of order is: "+order);
                System.out.println("\n");
                System.out.println("\n\n\n\tYou Have ordered Prawn Curry. Sucessfully saved the order!");
                break;
            }
            case 7:
            {
                System.out.println("\n\tGoodbye.....");
                System.exit(0);
                break;
            }
            default:
            {
                System.out.println("\n\n\tYou entered the wrong keyword !!!!!\n\n ");
                return Hari_food();
            }
        }
        Scanner cv=new Scanner(System.in);
        System.out.println("\n\tDo you want to order again? (y/n) :\n");
        ys=cv.next().charAt(0);
        char y;
        if(ys=='y'|| ys=='Y')
        {
            return Hari_food();
        }
        else
        {
            System.out.println("\nThank You for your order!! Your Food is on the way. Welcome again!! \n\n");
            System.out.println(" GENERATING BILL");
            for(int a=1;a<5;a++)
            {
                Sleep(500);
                System.out.println(".....");
            }
            System.out.println("\n\t\t================================================");
            System.out.println("\n\t\t|              Food Ordering System            |");
            System.out.println("\n\t\t================================================");
            System.out.println(" \t\tBill No : Ap10           Order : SPG2021");
            System.out.println("\t\tCashier :  GANESH ");
            System.out.println("\n\n\t\tTotal bill is : ₹"+b);
            System.out.println("\n\n");
            System.out.println("Total: ₹"+b);
            System.out.println("\n\t\t================================================");

        }
        return re;
    }

    private static void Sleep(int l) {


    }
    static char ye,yos;
    static int orders,ret;
    static int aa,bb=0,cc,dd,ee,ff,gg,hh,ii,jj,kk;

    static Object Keerthi_food()
    {
        int counter;
        Scanner tn=new Scanner(System.in);
        System.out.println("======== WELCOME TO  KEERTHI FOOD ORDERING SYSTEM ========");
        System.out.println("                                                     ");
        System.out.println("             === YOU CAN ORDER NOW ===                ");
        System.out.println("======================================================================");
        System.out.println( "\n\t[1] CURRY CHICKEN(₹160)\t[2] CHICKEN FRY(₹300)\t[3] MUTTON DUM BIRIYANI(₹750)\n\n\t[4] MUTTON GHEE(₹800)\t[5] MUTTON KEEMA(₹950)\t[6]PRAWN FRY(₹950)\n\n\t\t\t\t   [7] Exit");
        System.out.println("                                                           ");
        System.out.println("======================================================================");
        do {
            System.out.println("\n\n\tEnter your order:-");
            orders =tn.nextInt();
            System.out.println("\n\n\tDo you want to change your order? (y/n) :");
            ye=tn.next().charAt(0);
        }
        while (ye=='y'|| ye=='Y');
        switch(orders)
        {
            case 1:
            {
                System.out.println("\n\n\tHow many order? :");
                int ord=tn.nextInt();
                aa=160;
                bb=bb+aa*ord;
                System.out.println("You ordered Curry Chicken: ₹160");
                System.out.println("\n");
                System.out.println("Number of order is: "+ord);
                System.out.println("\n");
                System.out.println("\n\n\n\tYou Have ordered  CURRY Chicken. Sucessfully saved the order!");
                break;
            }
            case 2:
            {
                System.out.println("\n\n\tHow many order? :");
                int ord=tn.nextInt();
                cc=300;
                bb=bb+cc*ord;
                System.out.println("You ordered Chicken Fry: ₹300");
                System.out.println("\n");
                System.out.println("Number of order is: "+ord);
                System.out.println("\n");
                System.out.println("\n\n\n\tYou Have ordered Chicken Fry. Sucessfully saved the order!");
                break;
            }
            case 3:
            {
                System.out.println("\n\n\tHow many order? :");
                int ord=tn.nextInt();
                ee=750;
                bb=bb+ee*ord;
                System.out.println("You ordered Mutton Dum Biriyani: ₹750");
                System.out.println("\n");
                System.out.println("Number of order is: "+ord);
                System.out.println("\n");
                System.out.println("\n\n\n\tYou Have ordered  Mutton Dum Biriyani. Sucessfully saved the order!");
                break;
            }
            case 4:
            {
                System.out.println("\n\n\tHow many order? :");
                int ord=tn.nextInt();
                ff=800;
                bb=bb+ff*ord;
                System.out.println("You ordered Mutton Ghee: ₹800");
                System.out.println("\n");
                System.out.println("Number of order is: "+ord);
                System.out.println("\n");
                System.out.println("\n\n\n\tYou Have ordered  Mutton Ghee. Sucessfully saved the order!");
                break;
            }
            case 5:
            {
                System.out.println("\n\n\tHow many order? :");
                int ord=tn.nextInt();
                gg=950;
                bb=bb+gg*ord;
                System.out.println("You ordered Mutton Keema: ₹950");
                System.out.println("\n");
                System.out.println("Number of order is: "+ord);
                System.out.println("\n");
                System.out.println("\n\n\n\tYou Have ordered  Mutton Keema. Sucessfully saved the order!");
                break;
            }

            case 6:
            {
                System.out.println("\n\n\tHow many order? :");
                int ord=tn.nextInt();
                hh=700;
                bb=bb+hh*ord;
                System.out.println("You ordered crab Fry: ₹700");
                System.out.println("\n");
                System.out.println("Number of order is: "+ord);
                System.out.println("\n");
                System.out.println("\n\n\n\tYou Have ordered Crab Fry. Sucessfully saved the order!");
                break;
            }
            case 7:
            {
                System.out.println("\n\tGoodbye.....");
                System.exit(0);
                break;
            }
            default:
            {
                System.out.println("\n\n\tYou entered the wrong keyword !!!!!\n\n ");
                return Keerthi_food();
            }
        }
        Scanner cv=new Scanner(System.in);
        System.out.println("\n\tDo you want to order again? (y/n) :\n");
        yos=cv.next().charAt(0);

        if(yos=='y'|| yos=='Y')
        {
            return Keerthi_food();
        }
        else
        {
            System.out.println("\nThank You for your order!! Your Food is on the way. Welcome again!! \n\n");
            System.out.println(" GENERATING BILL");
            for(int a=1;a<5;a++)
            {
                Sleep(5000);
                System.out.println(".....");
            }
            System.out.println("\n\t\t================================================");
            System.out.println("\n\t\t|              Food Ordering System            |");
            System.out.println("\n\t\t================================================");
            System.out.println(" \t\tBill No : Ap75           Order :NONVEGSPEC2021");
            System.out.println("\t\tCashier : GANESH  ");
            System.out.println("\n\n\t\tTotal bill is : ₹"+bb);
            System.out.println("\n\n");
            System.out.println("\t\t\t\tTotal: ₹"+bb);
            System.out.println("\n\t\t================================================");
        }

        System.out.flush();
        return ret;
    }
    static char yeee,yosss;
    static int ordersss,rettt;
    static int aaaa,bbbb=0,cccc,dddd,eeee,ffff,gggg,hhhh,iiii,jjjj,kkkk;
    static Object search_by_food()
    {
        int counter;
        Scanner tnnn=new Scanner(System.in);
        System.out.println("======== WELCOME TO KEERTHI FOOD ORDERING SYSTEM ========");
        System.out.println("                                                     ");
        System.out.println("             === YOU CAN ORDER NOW ===                ");
        System.out.println("======================================================================");
        System.out.println( "\n\t[1] SANDWICH (₹70)\t[2] PIZZA (₹100)\t[3] FRIED RICE (₹95)\n\n\t[4] PAROTTA (₹15)\t[5] NOODLES(₹75)\t[6]  FALODA (₹35)\n\n\t\t\t\t   [7] Exit");
        System.out.println("                                                           ");
        System.out.println("======================================================================");
        do {
            System.out.println("\n\n\tEnter your order:-");
            ordersss =tnnn.nextInt();
            System.out.println("\n\n\tDo you want to change your order? (y/n) :");
            yeee=tnnn.next().charAt(0);
        }
        while (yeee=='y'|| yeee=='Y');
        switch(ordersss)
        {
            case 1:
            {
                System.out.println("\n\n\tHow many order? :");
                int orddd=tnnn.nextInt();
                aaaa=70;
                bbbb=bbbb+aaaa*orddd;
                System.out.println("You ordered Sandwich: ₹70");
                System.out.println("\n");
                System.out.println("Number of order is: "+orddd);
                System.out.println("\n");
                System.out.println("\n\n\n\tYou Have ordered Sandwich . Sucessfully saved the order!");
                break;
            }
            case 2:
            {
                System.out.println("\n\n\tHow many order? :");
                int orddd=tnnn.nextInt();
                cccc=100;
                bbbb=bbbb+cccc*orddd;
                System.out.println("You ordered Pizza : ₹100");
                System.out.println("\n");
                System.out.println("Number of order is: "+orddd);
                System.out.println("\n");
                System.out.println("\n\n\n\tYou Have ordered Sandwich . Sucessfully saved the order!");
                break;
            }
            case 3:
            {
                System.out.println("\n\n\tHow many order? :");
                int orddd=tnnn.nextInt();
                eeee=95;
                bbbb=bbbb+eeee*orddd;
                System.out.println("You ordered Mutton Fried Rice : ₹95");
                System.out.println("\n");
                System.out.println("Number of order is: "+orddd);
                System.out.println("\n");
                System.out.println("\n\n\n\tYou Have ordered  Fried Rice. Sucessfully saved the order!");
                break;
            }
            case 4:
            {
                System.out.println("\n\n\tHow many order? :");
                int orddd=tnnn.nextInt();
                ffff=15;
                bbbb=bbbb+ffff*orddd;
                System.out.println("You ordered Parotta: ₹15");
                System.out.println("\n");
                System.out.println("Number of order is: "+orddd);
                System.out.println("\n");
                System.out.println("\n\n\n\tYou Have ordered Parotta. Sucessfully saved the order!");
                break;
            }
            case 5:
            {
                System.out.println("\n\n\tHow many order? :");
                int orddd=tnnn.nextInt();
                gggg=75;
                bbbb=bbbb+gggg*orddd;
                System.out.println("You ordered Noodles: ₹75");
                System.out.println("\n");
                System.out.println("Number of order is: "+orddd);
                System.out.println("\n");
                System.out.println("\n\n\n\tYou Have ordered  Noodles. Sucessfully saved the order!");
                break;
            }

            case 6:
            {
                System.out.println("\n\n\tHow many order? :");
                int orddd=tnnn.nextInt();
                hhhh=35;
                bbbb=bbbb+hhhh*orddd;
                System.out.println("You ordered Deep Fried Faloda: ₹35");
                System.out.println("\n");
                System.out.println("Number of order is: "+orddd);
                System.out.println("\n");
                System.out.println("\n\n\n\tYou Have ordered Faloda. Sucessfully saved the order!");
                break;
            }
            case 7:
            {
                System.out.println("\n\tGoodbye.....");
                System.exit(0);
                break;
            }
            default:
            {
                System.out.println("\n\n\tYou entered the wrong keyword !!!!!\n\n ");
                return search_by_food();
            }
        }
        Scanner cvv=new Scanner(System.in);
        System.out.println("\n\tDo you want to order again? (y/n) :\n");
        yosss=cvv.next().charAt(0);

        if(yosss=='y'|| yosss=='Y')
        {
            return search_by_food();
        }
        else
        {
            System.out.println("\nThank You for your order!! Your Food is on the way. Welcome again!! \n\n");
            System.out.println(" GENERATING BILL");
            for(int a=1;a<5;a++)
            {
                Sleep(5000);
                System.out.println(".....");
            }
            System.out.println("\n\t\t================================================");
            System.out.println("\n\t\t|              Food Ordering System         |");
            System.out.println("\n\t\t================================================");
            System.out.println(" \t\tBill No : FSTFD67           Order :FSTSPEC2021");
            System.out.println("\t\tCashier : NAGA ");
            System.out.println("\n\n\t\tTotal bill is : ₹"+bbbb);
            System.out.println("\n\n");
            System.out.println("\t\t\t\tTotal: ₹"+bbbb);
            System.out.println("\n\t\t================================================");
        }

        System.out.flush();
        return rettt;
    }
    static char yee,yoss;
    static int orderss,rett;
    static int aaa,bbb=0,ccc,ddd,eee,fff,ggg,hhh,iii,jjj,kkk;
    static Object Sharmi_food()
    {
        int counter;
        Scanner tnn=new Scanner(System.in);
        System.out.println("======== WELCOME TO SHARMILA FOOD ORDERING SYSTEM ========");
        System.out.println("                                                     ");
        System.out.println("             === YOU CAN ORDER NOW ===                ");
        System.out.println("======================================================================");
        System.out.println( "\n\t[1] CUISINE DISH (₹200)\t[2] JACK FRUIT CURRY (₹100)\t[3] EGG PLANT CURRY (₹110)\n\n\t[4] CRISPY BHINDI (₹180)\t[5] SHIKAMPURI KEBAB(₹250)\t[6] DEEP FRIED SWEET DUMPLINGS (₹280)\n\n\t\t\t\t   [7] Exit");
        System.out.println("                                                           ");
        System.out.println("======================================================================");
        do {
            System.out.println("\n\n\tEnter your order:-");
            orderss =tnn.nextInt();
            System.out.println("\n\n\tDo you want to change your order? (y/n) :");
            yee=tnn.next().charAt(0);
        }
        while (yee=='y'|| yee=='Y');
        switch(orderss)
        {
            case 1:
            {
                System.out.println("\n\n\tHow many order? :");
                int ordd=tnn.nextInt();
                aaa=200;
                bbb=bbb+aaa*ordd;
                System.out.println("You ordered cuisine dish: ₹200");
                System.out.println("\n");
                System.out.println("Number of order is: "+ordd);
                System.out.println("\n");
                System.out.println("\n\n\n\tYou Have ordered cuisine dish . Sucessfully saved the order!");
                break;
            }
            case 2:
            {
                System.out.println("\n\n\tHow many order? :");
                int ordd=tnn.nextInt();
                ccc=100;
                bbb=bbb+ccc*ordd;
                System.out.println("You ordered Jack fruit curry : ₹100");
                System.out.println("\n");
                System.out.println("Number of order is: "+ordd);
                System.out.println("\n");
                System.out.println("\n\n\n\tYou Have ordered Jack fruit curry . Sucessfully saved the order!");
                break;
            }
            case 3:
            {
                System.out.println("\n\n\tHow many order? :");
                int ordd=tnn.nextInt();
                eee=110;
                bbb=bbb+eee*ordd;
                System.out.println("You ordered Mutton Egg Plant Curry : ₹110");
                System.out.println("\n");
                System.out.println("Number of order is: "+ordd);
                System.out.println("\n");
                System.out.println("\n\n\n\tYou Have ordered  Egg Plant Curry. Sucessfully saved the order!");
                break;
            }
            case 4:
            {
                System.out.println("\n\n\tHow many order? :");
                int ordd=tnn.nextInt();
                fff=180;
                bbb=bbb+fff*ordd;
                System.out.println("You ordered Crispy Bhindi: ₹180");
                System.out.println("\n");
                System.out.println("Number of order is: "+ordd);
                System.out.println("\n");
                System.out.println("\n\n\n\tYou Have ordered  Crispy Bhindhi. Sucessfully saved the order!");
                break;
            }
            case 5:
            {
                System.out.println("\n\n\tHow many order? :");
                int ordd=tnn.nextInt();
                ggg=250;
                bbb=bbb+ggg*ordd;
                System.out.println("You ordered Shikampuri Kebab: ₹250");
                System.out.println("\n");
                System.out.println("Number of order is: "+ordd);
                System.out.println("\n");
                System.out.println("\n\n\n\tYou Have ordered  Shikampuri Kebab. Sucessfully saved the order!");
                break;
            }

            case 6:
            {
                System.out.println("\n\n\tHow many order? :");
                int ordd=tnn.nextInt();
                hhh=280;
                bbb=bbb+hhh*ordd;
                System.out.println("You ordered Deep Fried Sweet Dumplings : ₹280");
                System.out.println("\n");
                System.out.println("Number of order is: "+ordd);
                System.out.println("\n");
                System.out.println("\n\n\n\tYou Have ordered Sweet Dumplings. Sucessfully saved the order!");
                break;
            }
            case 7:
            {
                System.out.println("\n\tGoodbye.....");
                System.exit(0);
                break;
            }
            default:
            {
                System.out.println("\n\n\tYou entered the wrong keyword !!!!!\n\n ");
                return Sharmi_food();
            }
        }
        Scanner cvv=new Scanner(System.in);
        System.out.println("\n\tDo you want to order again? (y/n) :\n");
        yoss=cvv.next().charAt(0);

        if(yoss=='y'|| yoss=='Y')
        {
            return Sharmi_food();
        }
        else
        {
            System.out.println("\nThank You for your order!! Your Food is on the way. Welcome again!! \n\n");
            System.out.println(" GENERATING BILL");
            for(int a=1;a<5;a++)
            {
                Sleep(5000);
                System.out.println(".....");
            }
            System.out.println("\n\t\t================================================");
            System.out.println("\n\t\t|             Bhanu Food Ordering System         |");
            System.out.println("\n\t\t================================================");
            System.out.println(" \t\tBill No : BNU79           Order :VEGSPEC2021");
            System.out.println("\t\tCashier : BHANU  ");
            System.out.println("\n\n\t\tTotal bill is : ₹"+bbb);
            System.out.println("\n\n");
            System.out.println("\t\t\t\tTotal: ₹"+bbb);
            System.out.println("\n\t\t================================================");
        }

        System.out.flush();
        return rett;
    }
    public static void main(String args[]) {
        //FoodOrdering obj = new FoodOrdering();
        signup();
        login();
//        Sharmi_food();

    }


}