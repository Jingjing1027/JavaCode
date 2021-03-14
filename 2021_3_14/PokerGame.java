package java_0131;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PokerGame {
    //使用这个数组把四种花色提前准备好
    public static final String[] suit = {"♥","♦","♣","♠"};


    private static List<Card> buyPoker() {
        List<Card> poker = new ArrayList<>();
        //四种花色
        for (int i = 0; i < 4; i++) {
            //每种花色的十三张牌
            for (int j = 2; j < 10; j++) {
                poker.add(new Card(suit[i],"" + j));
            }
            poker.add(new Card(suit[i],"j"));
            poker.add(new Card(suit[i],"Q"));
            poker.add(new Card(suit[i],"K"));
            poker.add(new Card(suit[i],"A"));
        }
        poker.add(new Card("","big Joker"));
        poker.add(new Card("","samll Joker"));
        return poker;
    }

    private static void shuffle(List<Card> poker) {
        Random random = new Random();
        for (int i = poker.size() - 1; i > 0; i--) {
            int pos = random.nextInt(i);
            swap4(poker,i,pos);
        }
    }

    private static void swap4(List<Card> poker, int i, int j) {
        Card tmp =poker.get(i);
        poker.set(i,poker.get(j));
        poker.set(j,tmp);
    }

    public static void main(String[] args) {
        //先创建一副牌
        List<Card> poker = buyPoker();
        shuffle(poker);
        System.out.println(poker);
        //洗牌
        List<List<Card>> players = new ArrayList<>();
        players.add(new ArrayList<>());
        players.add(new ArrayList<>());
        players.add(new ArrayList<>());
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                Card top =poker.remove(0);
                List<Card> player = players.get(j);
                player.add(top);
            }
        }
        for (int i = 0; i < players.size();i++) {
            List<Card> player =players.get(i);
            System.out.println("玩家" + i + " 的手牌是：" + player);
        }
    }
}
