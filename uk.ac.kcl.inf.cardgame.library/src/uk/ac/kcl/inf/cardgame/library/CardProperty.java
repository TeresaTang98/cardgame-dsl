package uk.ac.kcl.inf.cardgame.library;

import java.util.Objects;

public class CardProperty {
    public String name;
    public int value;

    public CardProperty(String propertyName, int value) {
        this.name = propertyName;
        this.value = value;
    }

    public String toString() {
        return "{name=" + name + ", " + "value=" + Integer.toString(value) + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CardProperty property = (CardProperty) o;
        return value == property.value && name.equals(property.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, value);
    }
}