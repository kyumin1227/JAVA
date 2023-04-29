package test0427.Chapter6;

public class ArrayProcTest {

    final static int STUDENT = 5;

    public static void main(String[] args) {
        ArrayProc array = new ArrayProc();

        int[] scores = new int[STUDENT];

        array.getValues(scores);

        System.out.print("평균은:" + array.getAverage(scores));

    }

}
