public class MyMath {
    int square(int i) {
        return i*i;
    }
    double square(double i) {
        return i*i;
    }
    public static void main(String[] args) {
        MyMath obj = new MyMath();
        System.out.println(obj.square(9));
        System.out.println(obj.square(3.8));
    }
        
}
