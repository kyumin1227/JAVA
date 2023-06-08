package generic;

import java.util.ArrayList;

public class CollectionTest {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("김지훈");
        names.add("이재일");
        names.add("김 현");

        for (String name : names) {
            System.out.println(name);
        }

        ArrayList<Integer> ages = new ArrayList<>();
        ages.add(10);
        ages.add(18);
        ages.add(20);
        ages.add(23);

        for (int age : ages) {
            System.out.println(age);
        }
    }
}
