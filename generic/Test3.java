package generic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test3 {
    public static void main(String[] args) {
        Student std1 = new Student("고길동", 77);
        Student std2 = new Student("홍길동", 71);
        Student std3 = new Student("김길동", 87);
        Student std4 = new Student("이길동", 47);
        Student std5 = new Student("박길동", 15);
        Student std6 = new Student("기길동", 69);
        Student std7 = new Student("안길동", 47);
        Student std8 = new Student("석길동", 68);

        List<Student> list = new ArrayList<>();
        list.add(std1);
        list.add(std2);
        list.add(std3);
        list.add(std4);
        list.add(std5);
        list.add(std6);
        list.add(std7);
        list.add(std8);

        print(list);
        // Collections의 sort 메소드는 list<T> 유형의 객체에 들어있는 원소를 정렬해준다.
        // 단, 그 원소는 Comparable 인터페이스를 구현한 클래스의 객체이어야 한다.
        Collections.sort(list);

        System.out.println("정렬 후");
        print(list);

    }

    public static void print(List<Student> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println("[" + list.get(i).name + "," + list.get(i).grade + "]");
        }
        System.out.println();
    }
}
