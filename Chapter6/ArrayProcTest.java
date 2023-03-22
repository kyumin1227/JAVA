package Chapter6;
import java.util.Scanner;
public class ArrayProcTest {
    public static void main(String[] args) {
        int [] student = new int[5];

        ArrayProc ap = new ArrayProc();
        ap.getValues(student);
        System.out.println("평균은 = "+ap.getAverage(student));
    }
}
