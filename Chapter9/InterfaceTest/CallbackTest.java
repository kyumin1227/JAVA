package Chapter9.InterfaceTest;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.Timer;

public class CallbackTest {
    public static void main(String[] args) {
        ActionListener listener = new MyClass();

        Timer timer = new Timer(1000, listener);
        timer.start();

        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        sc.close();
        System.out.println("프로그램을 종료합니다.");
    }
}

class MyClass implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Beep");
    }

}