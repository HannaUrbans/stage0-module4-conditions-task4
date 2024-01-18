package school.mjc.stage0.conditions.task4;

public class TernaryGreatestNumberPrinter {
    public static void printGreatest(int first, int second) {
        int output;
        output= (first >= second)
                ?first
                :second;
        System.out.println(output);
    }

    public static void main(String[] args) {
        int first = 1;
        int second = 2;
        printGreatest(first, second);
    }
}
