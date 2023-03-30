package Chapter7;

public class BankTest {
    public static void main(String[] args) {
        BadBank bb = new BadBank();
        NormalBank nb = new NormalBank();
        GoodBank gb = new GoodBank();

        System.out.println("BadBank의 이자율: "+bb.getInterestRate());
        System.out.println("NormalBank의 이자율: "+nb.getInterestRate());
        System.out.println("GoodBank의 이자율: "+gb.getInterestRate());
    }
}
