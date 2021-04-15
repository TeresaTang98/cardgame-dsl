package uk.ac.kcl.inf.cardgame.library;

public class SingleRule extends Rule {

    private String name;
    private int p1CardIndex;
    private int p2CardIndex;
    private String type; // isBiggerThan | isSmallerThan | isEqualTo
    private String property;

    public SingleRule(String name, int p1CardIndex, int p2CardIndex, String type, String property) {
        this.name = name;
        this.p1CardIndex = p1CardIndex;
        this.p2CardIndex = p2CardIndex;
        this.type = type;
        this.property = property;
    }

    @Override
    int compare(Player p1, Player p2) {
        System.out.printf("Executing single rule: %s\n", name);
        int p1Value = p1.cards.get(p1CardIndex).propertyMap.get(property);
        int p2Value = p2.cards.get(p2CardIndex).propertyMap.get(property);
        if (type == "isBiggerThan") {
            if (p1Value > p2Value) {
                return 1;
            }
        } else if (type == "isSmallerThan") {
            if (p1Value < p2Value) {
                return 1;
            }
        } else if (type == "isEqualTo") {
            if (p1Value == p2Value) {
                return 1;
            }
            return 0;
        } else {
            System.err.printf("Error type in SingleRule: %s\n", type);
            System.exit(-1);
        }
        return 0;
    }

}