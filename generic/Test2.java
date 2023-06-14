package generic;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Test2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList</* 앞에서 기재 했기에 생략 가능 */>();
        list.add("Grape");
        list.add("Potato");
        // list.add(10); type이 String이므로 문자만 가능
        list.add("Strawberry");
        list.add("Banana");

        print(list);

        Collections.sort(list);
        System.out.println("정렬 후");
        print(list);
    }

    public static void print(List<String> list) {
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println();
    }
}
