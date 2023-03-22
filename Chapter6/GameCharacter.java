package Chapter6;

import java.util.ArrayList;

public class GameCharacter {
    private ArrayList<GameItem> list = new ArrayList<>();           // ArrayList의 장점: 객체의 용량이 초과될 경우 부족한 크기 만큼 용량이 증가
    // GameItem[] list = new GameItem[2];
    // private static int count = 0;

    public class GameItem {
        String name;
        int type;
        int price;

        public int getPrice() {
            return price;
        }
        @Override
        public String toString() {
            // return ("[name="+name+", type="+type+", price="+price+"]");
            return ("GameItem [name="+name+", type="+type+", price="+price+"]");
        }
    }

    public void add(String name, int type, int price) {
        GameItem item = new GameItem();
        item.name = name;
        item.type = type;
        item.price = price;
        // list[count] = item;
        list.add(item);
        // count++;
    }

    public void print() {
        int sumPrice=0;
        // for(int i = 0; i<count; i++) {
        //     System.out.println("GameItem "+list[i].toString());
        //     sumPrice += list[i].getPrice();
        // }
        for(GameItem x : list) {                 // for-each 문으로  for(타입 변수 : 배열)로 이용하며 기존의 for문과 생김새 외의 차이점은 없음
            System.out.println(x);               // toString 출력
            sumPrice += x.getPrice();
        }
        System.out.println(sumPrice);
        
    }
}