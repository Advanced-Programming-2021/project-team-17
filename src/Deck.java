import java.util.ArrayList;
import java.util.List;

public class Deck {
    private String deckName;
    private List<Card> mainDeck = new ArrayList<Card>();
    private List<Card> sideDeck = new ArrayList<Card>();

    public void addCardToMainDeck(Card card) {
        this.mainDeck.add(card);
    }

    public void addCardToSideDeck(Card card) {
        this.sideDeck.add(card);
    }

    public void removeCardFromMainDeck(Card card) {
        this.mainDeck.remove(card);
    }

    public void removeCardFromSideDeck(Card card) {
        this.sideDeck.remove(card);
    }

    public boolean isValid() {
        return ((this.mainDeck.size() >= 40) &&
                (this.mainDeck.size() <= 60) &&
                (this.sideDeck.size() >= 0) &&
                (this.sideDeck.size() <= 15));
    }

    public String toStringForMainDeck() {
        String toBeReturend = "Deck: " + this.deckName + "\nMain deck:\nMonsters:";
        for (Card card : mainDeck) {
            if (card instanceof MonsterCard) {
                toBeReturend += "\n" + card.getName() + ": " + card.getDescription();
            } else if ((card instanceof SpellCard) || (card instanceof TrapCard)) {
                toBeReturend += "\n" + card.getName() + ": " + card.getDescription();
            }
        }
        return toBeReturend;
    }

    public String toStringForSideDeck() {
        String toBeReturend = "Deck: " + this.deckName + "\nMain deck:\nMonsters:";
        for (Card card : mainDeck) {
            if (card instanceof MonsterCard) {
                toBeReturend += "\n" + card.getName() + ": " + card.getDescription();
            } else if ((card instanceof SpellCard) || (card instanceof TrapCard)) {
                toBeReturend += "\n" + card.getName() + ": " + card.getDescription();
            }
        }
        return toBeReturend;
    }

}
