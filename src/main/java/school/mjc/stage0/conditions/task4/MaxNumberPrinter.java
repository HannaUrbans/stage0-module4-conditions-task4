package school.mjc.stage0.conditions.task4;

public class MaxNumberPrinter {
    public static void printGreatest(int first, int second, int third) {
        if (first>=second && first>=third)
        {System.out.println(first);}
        else if (first>=second && first<third)
        {System.out.println(third);}
        else if (first<second && second>=third)
        {System.out.println(second);}
        else
        {System.out.println(third);}
    }
    public static void main (String[]args)
    {int first=1;
    int second=2;
    int third=3;
    printGreatest(first, second, third);}
}
