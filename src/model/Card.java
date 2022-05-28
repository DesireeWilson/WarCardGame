package model;

public class Card implements Comparable<Card>{
    Suit suit;
    Rank rank;

    Card() {};
    Card(int num) {
          suit = assignSuit(num);
          rank = assignRank(num);
    }

    Suit assignSuit(int num) {
        return (num <= 12 && num >= 0 ) ? Suit.CLUB
                : (num <= 25 && num >= 13) ? Suit.DIAMOND
                : (num <= 38 && num >= 26) ? Suit.HEART
                : Suit.SPADE;
    }

    // I don't like this "assignRank" code:
    Rank assignRank(int num) {
        final int value = (num % 13);
        switch (value) {
            case 0:
                return Rank.TWO;
            case 1:
                return Rank.THREE;
            case 2:
                return Rank.FOUR;
            case 3:
                return Rank.FIVE;
            case 4:
                return Rank.SIX;
            case 5:
                return Rank.SEVEN;
            case 6:
                return Rank.EIGHT;
            case 7:
                return Rank.NINE;
            case 8:
                return Rank.TEN;
            case 9:
                return Rank.JACK;
            case 10:
                return Rank.QUEEN;
            case 11:
                return Rank.KING;
            case 12:
                return Rank.ACE;
        };
        return Rank.TWO;
    }

    @Override
    public String toString() {
        return rank.toString() + " of " + suit.toString();
    }

    @Override
    public int compareTo(Card otherCard) {
        return Integer.compare(this.rank.ordinal(), otherCard.rank.ordinal());
    }
}
