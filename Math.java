public class Math {
    int add(int x, int y) {
        return x+y;
    }
    public static void main(String[] args) {
        int sum;
        Math obj = new Math();
        sum = obj.add(25, 33);
        System.out.println("25와 33의 합은 "+sum+"입니다.");
        sum = obj.add(82, 107);
        System.out.println("82와 107의 합은 "+sum+ "입니다.");
        
    }
}
