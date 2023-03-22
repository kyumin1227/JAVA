package Chapter6;
import java.util.Scanner;
public class ArrayProc {
    Scanner sc = new Scanner(System.in);
    public void getValues(int [] array) {
        for(int i = 0; i<5; i++) {
            System.out.print("성적을 입력하시오:");
            array[i] = sc.nextInt();
        }
    }
    public double getAverage(int [] array) {
        double sum=0;
        for(int i = 0; i< array.length; i++) {
            sum += array[i];
        }
        return sum/array.length;
    }
}
