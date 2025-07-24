package collection.compare.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class Deck {

    private static class Card implements Comparable<Card> {

        private final String shape;
        private final int num;

        public Card(String shape, int num) {
            this.shape = shape;
            this.num = num;
        }

        @Override
        public int compareTo(Card o) {
            if (this.num != o.num) {
                return Integer.compare(this.num, o.num);
            } else {
                return Integer.compare(shapes.get(this.shape), shapes.get(o.shape));
            }
        }

        @Override
        public String toString() {
            return num + "(" + shape + ")";
        }
    }

    private final static Map<String, Integer> shapes = Map.of("♠", 0, "♥", 1, "♦", 2, "♣", 3);
    private final List<Card> deck = new ArrayList<>();

    public Deck() {
        init();
    }

    private void init() {
        for (String shape : shapes.keySet()) {
            for (int num = 1; num <= 13; num++) {
                deck.add(new Card(shape, num));
            }
        }

        Collections.shuffle(deck);
    }

    public void play() {
        List<Card> p1 = new ArrayList<>(List.of(deck.get(0), deck.get(1), deck.get(2), deck.get(3), deck.get(4)));
        List<Card> p2 = new ArrayList<>(List.of(deck.get(5), deck.get(6), deck.get(7), deck.get(8), deck.get(9)));
        p1.sort(null);
        p2.sort(null);

        int sum1 = totalSum(p1);
        int sum2 = totalSum(p2);

        System.out.println("플레이어1의 카드: " + p1 + ", 합계: " + sum1);
        System.out.println("플레이어2의 카드: " + p2 + ", 합계: " + sum2);
        if (sum1 > sum2) {
            System.out.println("플레이어1 승리");
        } else if (sum1 < sum2) {
            System.out.println("플레이어2 승리");
        } else {
            System.out.println("무승부");
        }
    }

    private int totalSum(List<Card> list) {
        int sum = 0;
        for (Deck.Card card : list) {
            sum += card.num;
        }
        return sum;
    }
}
