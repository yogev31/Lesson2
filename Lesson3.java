// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        sumNums(375);

    }
    public static void avg(int a, int b, int c)
    {
        System.out.println("Avg is: " + (a+b+c)/3.0);
    }
    public static void yeter(int a, int b)
    {
        System.out.println("yeter is: " + Math.sqrt((Math.pow(a,2)+Math.pow(b,2))));
    }

    public static void func(int x)
    {
        int y = 2*x+5;
        System.out.println("Y = " + y);
    }

    public static void is(int x)
    {
        if(x > 0)
        {
            System.out.println("Positive");
        }
        else if (x < 0)
        {
            System.out.println("negative");
        }
    }
    public static void fre(int x)
    {
        double price = 0;
        if(x > 108)
        {
            System.out.println("Cant buy more than 108!");
        }
        else
        {
            price += (x/54)*50;
            x = x%54;
            price += (x/10)*10;
            x = x%10;
            price += x*1.1;
            System.out.println("price = " + price);
        }
    }
    public static void id(Scanner scan)
    {
        System.out.println("Enter your full name: ");
        String name = scan.next();
        System.out.println("Enter your school's name: ");
        String school = scan.next();
        System.out.println("Enter your amount of subjects: ");
        int num = scan.nextInt();
        System.out.println("My name is " + name + ", My school is " + school + ", The num o subjects " + num);
    }

    public static void sumNums(int a)
    {
        int num = 0;
        num += a % 10;
        a = a / 10;
        num += a % 10;
        a = a / 10;
        num += a;
        System.out.println("num = " + num);

    }


}
