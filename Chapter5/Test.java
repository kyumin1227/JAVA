package Chapter5;
public class Test {
    public static void main(String[] args) {
        JavaTest t1 = new JavaTest();
        t1.setName("HongGilDong");
        System.out.println(t1.getName());
        //String.charAt(0);
        String s1 = "동해물과 백두산이";
        char c = s1.charAt(5);
        System.out.println(c);
        String s2 = "동해물과 백두산이";
        boolean r = s1 == s2;
        System.out.println(r);
        String s3 = new String("동해물과 백두산이");
        r = s1 == s3;
        System.out.println(r);

        r = s3.equals(s1);
        System.out.println(r);

        s1 = new String("I love you");
        s2 = new String("I love You");

        r = s1.equals(s2);
        System.out.println(r);

        r = s1.equalsIgnoreCase(s2);
        System.out.println(r);

        //String 객체는 immutable 입니다. mutable이므로 String 객체의 값은 변경할 수 없다.
    }
}
