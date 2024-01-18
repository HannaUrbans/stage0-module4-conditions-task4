package school.mjc.stage0.conditions.task4;

public class TernaryMaxNumberPrinter {
    public static void printGreatest(int first, int second, int third) {
        int result;
        result = (first>=second && first>=third)?
                first:(first>=second && first<third)?third:(first<second && second>=third)?second:third;
    System.out.println(result);
    }
    public static void main(String[]args)
    {int first=1;
    int second=2;
    int third=3;
    printGreatest(first,second,third);}
}



