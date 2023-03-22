package Chapter6;

public class GameCharacter {
    GameItem[] list = new GameItem[2];
    private static int count = 0;

    public class GameItem {
        String name;
        int type;
        int price;

        public int getPrice() {
            return price;
        }
        @Override
        public String toString() {
            return ("[name="+name+", type="+type+", price="+price+"]");
        }
    }

    public void add(String name, int type, int price) {
        GameItem l1 = new GameItem();
        l1.name = name;
        l1.type = type;
        l1.price = price;
        list[count] = l1;
        count++;
    }

    public void print() {
        int sumPrice=0;
        for(int i = 0; i<count; i++) {
            System.out.println("GameItem "+list[i].toString());
            sumPrice += list[i].getPrice();
        }
        System.out.println(sumPrice);
        
    }
}