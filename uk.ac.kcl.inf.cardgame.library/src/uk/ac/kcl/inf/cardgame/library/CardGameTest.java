package uk.ac.kcl.inf.cardgame.library;

import java.lang.reflect.Array;
import java.util.*;

public class CardGameTest {
    public static List<Card> genCards() {
        List<Card> cards = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < 20; i++) {
            CardProperty[] cardProperties = new CardProperty[]{new CardProperty("power", i), new CardProperty("suit", rand.nextInt(3)),};
            cards.add(new Card(Arrays.asList(cardProperties)));
        }
        return cards;
    }
    public static List<Rule> genRules() {
        Rule[] rules = new Rule[] {
                new SingleRule("rule1", 0, 0, "isSmallerThan", "power"),
                new SingleRule("rule2", 1, 1, "isBiggerThan", "power"),
                new EqualRule("rule3", "suit", 4),
        };
        return new ArrayList<Rule>(Arrays.asList(rules));
    }
    public static void main(String[] args) {
        CardGame game = new CardGame(genCards(), genRules(), 8);
        game.start();
    }
}
