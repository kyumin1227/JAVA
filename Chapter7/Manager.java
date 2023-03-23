package Chapter7;

public class Manager extends Employee {
    private int bonus;
    
    public Manager(String name, String address, int salary, int rrn, int bonus) {
        super(name, address, salary, rrn);      // 부모 클래스의 참조 변수 (this와 마찬가지)
        this.bonus = bonus;
    }

    public void test() {
        System.out.println("name="+name);
        System.out.println("address="+address);
        System.out.println("salary="+salary);
        // System.out.println("rrn="+rrn);
    }
}
