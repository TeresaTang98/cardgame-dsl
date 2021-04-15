package uk.ac.kcl.inf.cardgame.library;

import java.util.*;
import java.util.stream.Collectors;

public class CardGame {
	private List<Card> cards;
	private List<Rule> rules;
	private List<Card> shuffedCards;
	private Player p1;
	private Player p2;
	private int holeCardNum;

	public CardGame(List<Card> cards, List<Rule> rules, int holeCardNum) {
		this.cards = new ArrayList<>(cards);
		this.rules = new ArrayList<>(rules);
		this.holeCardNum = holeCardNum;

		this.shuffedCards = shuffleCard(this.cards);

		List<Card> p1Cards = shuffedCards.subList(0, holeCardNum);
		System.out.printf("P1 get cards %s\n", p1Cards.toString());
		this.p1 = new Player(p1Cards);

		List<Card> p2Cards = shuffedCards.subList(holeCardNum, holeCardNum * 2);
		System.out.printf("P2 get cards %s\n", p2Cards.toString());
		this.p2 = new Player(p2Cards);
	}

	public void start() {
		for (Rule rule : rules) {
			int res = rule.compare(p1, p2);
			if (res > 0) {
				System.out.println("P1 wins!");
				return;
			} else if (res < 0) {
				System.out.println("P2 wins!");
				return;
			}
		}
		System.out.println("P1 P2 end in draw!");
	}

	static List<Card> shuffleCard(List<Card> cards) {
		List<Card> copyCards = new ArrayList<>(cards);
		Collections.shuffle(copyCards);
		return copyCards;
	}
}











class Player {
	public List<Card> cards;

	public Player(List<Card> cards) {
		this.cards = cards;
	}
}

class Util {
	static String mapToString(Map map) {
		return (String) map.keySet().stream()
				.map(key -> key + "=" + map.get(key).toString())
				.collect(Collectors.joining(", ", "{", "}"));
	}
}
