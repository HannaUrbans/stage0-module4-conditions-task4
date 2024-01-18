package school.mjc.stage0.conditions.task4;

public class TernaryPrinter {
    public static void printWhichIsBigger(int first, int second) {
        int output;
        output= (first >= second)
                ?first
                :second;
        System.out.println(output);
    }
    public static void main (String[]args){
        int first=1;
        int second=2;
        printWhichIsBigger(first, second);
    }
}
