package test0427.Chapter5;

import java.util.Scanner;

public class StringTest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = "";

        while (true) {
            System.out.print("문자열을 입력하세요> ");
            s = sc.next();
            String test = s.substring(0, 3);
            if (s.equals("quit")) {
                break;
            }
            if (test.equals("www")) {
                System.out.println(s + " 은 \'www\'로 시작합니다.");
            } else {
                System.out.println(s + " 은 \'www\'로 시작하지 않습니다.");
            }
        }

    }
}
