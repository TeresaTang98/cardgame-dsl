package uk.ac.kcl.inf.cardgame.library;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Card {
    public Map<String, Integer> propertyMap;
    public List<CardProperty> propertyList;

    public Card(List<CardProperty> propertyList) {
        this.propertyList = propertyList;
        propertyMap = new HashMap<>();
        for (CardProperty property : propertyList) {
            propertyMap.put(property.name, property.value);
        }
    }

    public String toString() {
        return Util.mapToString(propertyMap);
    }

}
