import java.util.Scanner;

public class DeckOfCards {

    static String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
    static String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10",
                             "Jack", "Queen", "King", "Ace"};

    public static String[] initializeDeck() {
        String[] deck = new String[52];
        int index = 0;
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index++] = rank + " of " + suit;
            }
        }
        return deck;
    }

    public static void shuffleDeck(String[] deck) {
        for (int i = 0; i < deck.length; i++) {
            int random = i + (int)(Math.random() * (deck.length - i));
            String temp = deck[i];
            deck[i] = deck[random];
            deck[random] = temp;
        }
    }

    public static void distributeCards(String[] deck, int players, int cardsPerPlayer) {
        if (players * cardsPerPlayer > deck.length) {
            System.out.println("Not enough cards to distribute.");
            return;
        }

        for (int i = 0; i < players; i++) {
            System.out.println("Player " + (i + 1) + ":");
            for (int j = 0; j < cardsPerPlayer; j++) {
                System.out.println("  " + deck[i * cardsPerPlayer + j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] deck = initializeDeck();
        shuffleDeck(deck);

        int players = sc.nextInt();
        int cardsPerPlayer = sc.nextInt();

        distributeCards(deck, players, cardsPerPlayer);
    }
}
