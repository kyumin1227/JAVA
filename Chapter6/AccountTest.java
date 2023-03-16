package Chapter6;
public class AccountTest {
    public static void main(String[] args) {
        Account obj = new Account();
        obj.setName("Tom");
        obj.setBalance(100000);
        System.out.println(obj.getName()+"의 통장 잔고는 "+obj.getBalance()+"입니다.");
    }
}
