package Chapter5;
public class JavaTest {

    private String name;

    String getName() {
        return name;
    }

    // static method
    static void sayHello() {
        System.out.println("HI!!!!!!!!!");
    }
    void setName(String name) {
        this.name = name;
    }
    // member method
    // instance method
    double square(double df) {
        test();
        return df*df;
    }
    double square(int df) {
        return df*df;
    }
    void test() {
        System.out.println("test method called");
    }
    public static void main(String[] args) {

        JavaTest jt = new JavaTest();
        jt.square(1);
        

        JavaTest.sayHello();
        // JavaTest t = new JavaTest();
        // t.sayHello();
    }
}