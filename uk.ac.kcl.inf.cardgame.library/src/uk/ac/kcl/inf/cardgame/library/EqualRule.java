package uk.ac.kcl.inf.cardgame.library;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EqualRule extends Rule {

    private String name;
    private String property;
    private int num;

    public EqualRule(String name, String property, int num) {
        this.name = name;
        this.property = property;
        this.num = num;
    }

    @Override
    int compare(Player p1, Player p2) {
        System.out.printf("Executing equal rule: %s\n", name);
        if (num > p1.cards.size()) {
            System.err.printf("Error num in EqualRule: %d\n", num);
            System.exit(-1);
        }

        Map<CardProperty, Integer> p1SamePropertyCountMap = countSameProperty(p1.cards);
        Map<CardProperty, Integer> p2SamePropertyCountMap = countSameProperty(p2.cards);

        System.out.printf("p1SamePropertyCountMap %s\n", Util.mapToString(p1SamePropertyCountMap));
        System.out.printf("p2SamePropertyCountMap %s\n", Util.mapToString(p2SamePropertyCountMap));

        boolean p1Res = isSamePropertyCountMapSatisfyCondition(p1SamePropertyCountMap);
        boolean p2Res = isSamePropertyCountMapSatisfyCondition(p2SamePropertyCountMap);

        if ((p1Res && p2Res) || (!p1Res && !p2Res)) { // if they both satisfy or both not satisfy condition, they end in draw.
            return 0;
        }

        if (p1Res) {
            return 1;
        }

        return -1;
    }

    boolean isSamePropertyCountMapSatisfyCondition(Map<CardProperty, Integer> samePropertyCountMap) {
        for (Map.Entry<CardProperty, Integer> entry : samePropertyCountMap.entrySet()) {
            if (entry.getKey().name == property && entry.getValue() >= num) {
                return true;
            }
        }
        return false;
    }

    Map<CardProperty, Integer> countSameProperty(List<Card> cards) {
        Map<CardProperty, Integer> samePropertyCountMap = new HashMap<>();
        for (Card card : cards) {
            for (CardProperty property: card.propertyList) {
                samePropertyCountMap.put(property, samePropertyCountMap.getOrDefault(property, 0) + 1);
            }
        }
        return samePropertyCountMap;
    }

}