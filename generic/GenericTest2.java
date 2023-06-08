package generic;

public class GenericTest2 {
    public static void main(String[] args) {
        // GenericPair 클래스 객체 2개 생성해서 값을 넣고 빼고 해보세요.

        GenericPair<String, Integer> ex1 = new GenericPair<>("값", 100);
        String key1 = ex1.getKey();
        int value1 = ex1.getValue(); // auto unboxing
        System.out.println("키는 [ " + key1 + " ] 값은 [ " + value1 + " ]");

        GenericPair<String, Integer> ex2 = new GenericPair<>("값2", 500);
        String key2 = ex2.getKey();
        int value2 = ex2.getValue();
        System.out.println("키는 [ " + key2 + " ] 값은 [ " + value2 + " ]");

        // Generic 클래스의 타입 파라미터 값으로는 반드시 참조한 타입이 와야 한다.
        // 기초자료형(primitive type)은 절대 올 수 없다. (int)

        int[] jumsus = { 90, 87, 88, 87, 93 };
        GenericPair<String, int[]> gp3 = new GenericPair<String, int[]>("1조 점수", jumsus);

    }
}
