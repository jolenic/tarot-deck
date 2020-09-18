import java.util.Random;

public class Deck {
    private Card[] cards;
    private Random rand;
    
    Deck() {
        rand = new Random();
        cards = new Card[78];
        //Major Arcana
        cards[0] = new Card("The Fool", "Innocence, New Beginnings, Wonder, Foolishness");
        cards[1] = new Card("The Magician", "Willpower, Creation, Mastery, Adaptation");
        cards[2] = new Card("The High Priestess", "Inner Voice, Intuition, Divine Truth, Wisdom, Unconscious");
        cards[3] = new Card("The Empress", "Beauty, Fertility, Nurturing, Luxury, Creativity");
        cards[4] = new Card("The Emperor", "Structure, Ambition, Authority, Rationality");
        cards[5] = new Card("The Hierophant", "Tradition, Legacy, Society, Organized Religion");
        cards[6] = new Card("The Lovers", "Choices, Union, Love, Relationship");
        cards[7] = new Card("The Chariot", "Self-Control, Discipline, Success");
        cards[8] = new Card("Strength", "Courage, Inner Strength, Conviction, Compassion");
        cards[9] = new Card("The Hermit", "Contemplation, Solitude, Insight, Awareness");
        cards[10] = new Card("The Wheel of Fortune", "Fate, Karma, Destiny, Fortune, Cycles");
        cards[11] = new Card("Justice", "Truth, Fairness, Law, Clarity, Cause and Effect");
        cards[12] = new Card("The Hanged Man", "Sacrifice, Suspension, Release, Martyrdom, New Perspective");
        cards[13] = new Card("Death", "End of Cycle, New Beginnings, Change, Metamorphosis");
        cards[14] = new Card("Temperance", "Middle Path, Patience, Finding Meaning");
        cards[15] = new Card("The Devil", "Materialism, Playfulness, Pleasure, Addiction, Self-Destruction");
        cards[16] = new Card("The Tower", "Upheaval, Disaster, Foundational Shift");
        cards[17] = new Card("The Star", "Hope, Faith, Rejuvenation, Rebuilding, Healing");
        cards[18] = new Card("The Moon", "Unconscious, Illusions, Intuition, Lack of Clarity");
        cards[19] = new Card("The Sun", "Joy, Success, Celebration, Pleasure");
        cards[20] = new Card("Judgement", "Reflection, Reckoning, Awakening");
        cards[21] = new Card("The World", "Fulfillment, Harmony, Completion");
        
        //Suit of Cups
        cards[22] = new Card("Ace of Cups", "innocence, new beginnings, blind faith, a childlike sense of wonder, "
                + "foolishness, boldness, carelessness, feeling carefree");
        cards[23] = new Card("Two of Cups", "innocence, new beginnings, blind faith, a childlike sense of wonder, "
                + "foolishness, boldness, carelessness, feeling carefree");
        cards[24] = new Card("Three of Cups", "innocence, new beginnings, blind faith, a childlike sense of wonder, "
                + "foolishness, boldness, carelessness, feeling carefree");
        cards[25] = new Card("Four of Cups", "innocence, new beginnings, blind faith, a childlike sense of wonder, "
                + "foolishness, boldness, carelessness, feeling carefree");
        cards[26] = new Card("Five of Cups", "innocence, new beginnings, blind faith, a childlike sense of wonder, "
                + "foolishness, boldness, carelessness, feeling carefree");
        cards[27] = new Card("Six of Cups", "innocence, new beginnings, blind faith, a childlike sense of wonder, "
                + "foolishness, boldness, carelessness, feeling carefree");
        cards[28] = new Card("Seven of Cups", "innocence, new beginnings, blind faith, a childlike sense of wonder, "
                + "foolishness, boldness, carelessness, feeling carefree");
        cards[29] = new Card("Eight of Cups", "innocence, new beginnings, blind faith, a childlike sense of wonder, "
                + "foolishness, boldness, carelessness, feeling carefree");
        cards[30] = new Card("Nine of Cups", "innocence, new beginnings, blind faith, a childlike sense of wonder, "
                + "foolishness, boldness, carelessness, feeling carefree");
        cards[31] = new Card("Ten of Cups", "innocence, new beginnings, blind faith, a childlike sense of wonder, "
                + "foolishness, boldness, carelessness, feeling carefree");
        cards[32] = new Card("Page of Cups", "innocence, new beginnings, blind faith, a childlike sense of wonder, "
                + "foolishness, boldness, carelessness, feeling carefree");
        cards[33] = new Card("Knight of Cups", "innocence, new beginnings, blind faith, a childlike sense of wonder, "
                + "foolishness, boldness, carelessness, feeling carefree");
        cards[34] = new Card("Queen of Cups", "innocence, new beginnings, blind faith, a childlike sense of wonder, "
                + "foolishness, boldness, carelessness, feeling carefree");
        cards[35] = new Card("King of Cups", "innocence, new beginnings, blind faith, a childlike sense of wonder, "
                + "foolishness, boldness, carelessness, feeling carefree");
        
        //Suit of Pentacles
        cards[36] = new Card("Ace of Pentacles", "innocence, new beginnings, blind faith, a childlike sense of wonder, "
                + "foolishness, boldness, carelessness, feeling carefree");
        cards[37] = new Card("Two of Pentacles", "innocence, new beginnings, blind faith, a childlike sense of wonder, "
                + "foolishness, boldness, carelessness, feeling carefree");
        cards[38] = new Card("Three of Pentacles", "innocence, new beginnings, blind faith, a childlike sense of wonder, "
                + "foolishness, boldness, carelessness, feeling carefree");
        cards[39] = new Card("Four of Pentacles", "innocence, new beginnings, blind faith, a childlike sense of wonder, "
                + "foolishness, boldness, carelessness, feeling carefree");
        cards[40] = new Card("Five of Pentacles", "innocence, new beginnings, blind faith, a childlike sense of wonder, "
                + "foolishness, boldness, carelessness, feeling carefree");
        cards[41] = new Card("Six of Pentacles", "innocence, new beginnings, blind faith, a childlike sense of wonder, "
                + "foolishness, boldness, carelessness, feeling carefree");
        cards[42] = new Card("Seven of Pentacles", "innocence, new beginnings, blind faith, a childlike sense of wonder, "
                + "foolishness, boldness, carelessness, feeling carefree");
        cards[43] = new Card("Eight of Pentacles", "innocence, new beginnings, blind faith, a childlike sense of wonder, "
                + "foolishness, boldness, carelessness, feeling carefree");
        cards[44] = new Card("Nine of Pentacles", "innocence, new beginnings, blind faith, a childlike sense of wonder, "
                + "foolishness, boldness, carelessness, feeling carefree");
        cards[45] = new Card("Ten of Pentacles", "innocence, new beginnings, blind faith, a childlike sense of wonder, "
                + "foolishness, boldness, carelessness, feeling carefree");
        cards[46] = new Card("Page of Pentacles", "innocence, new beginnings, blind faith, a childlike sense of wonder, "
                + "foolishness, boldness, carelessness, feeling carefree");
        cards[47] = new Card("Knight of Pentacles", "innocence, new beginnings, blind faith, a childlike sense of wonder, "
                + "foolishness, boldness, carelessness, feeling carefree");
        cards[48] = new Card("Queen of Pentacles", "innocence, new beginnings, blind faith, a childlike sense of wonder, "
                + "foolishness, boldness, carelessness, feeling carefree");
        cards[49] = new Card("King of Pentacles", "innocence, new beginnings, blind faith, a childlike sense of wonder, "
                + "foolishness, boldness, carelessness, feeling carefree");
        
        //Suit of Wands
        cards[50] = new Card("Ace of Wands", "innocence, new beginnings, blind faith, a childlike sense of wonder, "
                + "foolishness, boldness, carelessness, feeling carefree");
        cards[51] = new Card("Two of Wands", "innocence, new beginnings, blind faith, a childlike sense of wonder, "
                + "foolishness, boldness, carelessness, feeling carefree");
        cards[52] = new Card("Three of Wands", "innocence, new beginnings, blind faith, a childlike sense of wonder, "
                + "foolishness, boldness, carelessness, feeling carefree");
        cards[53] = new Card("Four of Wands", "innocence, new beginnings, blind faith, a childlike sense of wonder, "
                + "foolishness, boldness, carelessness, feeling carefree");
        cards[54] = new Card("Five of Wands", "innocence, new beginnings, blind faith, a childlike sense of wonder, "
                + "foolishness, boldness, carelessness, feeling carefree");
        cards[55] = new Card("Six of Wands", "innocence, new beginnings, blind faith, a childlike sense of wonder, "
                + "foolishness, boldness, carelessness, feeling carefree");
        cards[56] = new Card("Seven of Wands", "innocence, new beginnings, blind faith, a childlike sense of wonder, "
                + "foolishness, boldness, carelessness, feeling carefree");
        cards[57] = new Card("Eight of Wands", "innocence, new beginnings, blind faith, a childlike sense of wonder, "
                + "foolishness, boldness, carelessness, feeling carefree");
        cards[58] = new Card("Nine of Wands", "innocence, new beginnings, blind faith, a childlike sense of wonder, "
                + "foolishness, boldness, carelessness, feeling carefree");
        cards[59] = new Card("Ten of Wands", "innocence, new beginnings, blind faith, a childlike sense of wonder, "
                + "foolishness, boldness, carelessness, feeling carefree");
        cards[60] = new Card("Page of Wands", "innocence, new beginnings, blind faith, a childlike sense of wonder, "
                + "foolishness, boldness, carelessness, feeling carefree");
        cards[61] = new Card("Knight of Wands", "innocence, new beginnings, blind faith, a childlike sense of wonder, "
                + "foolishness, boldness, carelessness, feeling carefree");
        cards[62] = new Card("Queen of Wands", "innocence, new beginnings, blind faith, a childlike sense of wonder, "
                + "foolishness, boldness, carelessness, feeling carefree");
        cards[63] = new Card("King of Wands", "innocence, new beginnings, blind faith, a childlike sense of wonder, "
                + "foolishness, boldness, carelessness, feeling carefree");
        
        //Suit of Swords
        cards[64] = new Card("Ace of Swords", "innocence, new beginnings, blind faith, a childlike sense of wonder, "
                + "foolishness, boldness, carelessness, feeling carefree");
        cards[65] = new Card("Two of Swords", "innocence, new beginnings, blind faith, a childlike sense of wonder, "
                + "foolishness, boldness, carelessness, feeling carefree");
        cards[66] = new Card("Three of Swords", "innocence, new beginnings, blind faith, a childlike sense of wonder, "
                + "foolishness, boldness, carelessness, feeling carefree");
        cards[67] = new Card("Four of Swords", "innocence, new beginnings, blind faith, a childlike sense of wonder, "
                + "foolishness, boldness, carelessness, feeling carefree");
        cards[68] = new Card("Five of Swords", "innocence, new beginnings, blind faith, a childlike sense of wonder, "
                + "foolishness, boldness, carelessness, feeling carefree");
        cards[69] = new Card("Six of Swords", "innocence, new beginnings, blind faith, a childlike sense of wonder, "
                + "foolishness, boldness, carelessness, feeling carefree");
        cards[70] = new Card("Seven of Swords", "innocence, new beginnings, blind faith, a childlike sense of wonder, "
                + "foolishness, boldness, carelessness, feeling carefree");
        cards[71] = new Card("Eight of Swords", "innocence, new beginnings, blind faith, a childlike sense of wonder, "
                + "foolishness, boldness, carelessness, feeling carefree");
        cards[72] = new Card("Nine of Swords", "innocence, new beginnings, blind faith, a childlike sense of wonder, "
                + "foolishness, boldness, carelessness, feeling carefree");
        cards[73] = new Card("Ten of Swords", "innocence, new beginnings, blind faith, a childlike sense of wonder, "
                + "foolishness, boldness, carelessness, feeling carefree");
        cards[74] = new Card("Page of Swords", "innocence, new beginnings, blind faith, a childlike sense of wonder, "
                + "foolishness, boldness, carelessness, feeling carefree");
        cards[75] = new Card("Knight of Swords", "innocence, new beginnings, blind faith, a childlike sense of wonder, "
                + "foolishness, boldness, carelessness, feeling carefree");
        cards[76] = new Card("Queen of Swords", "innocence, new beginnings, blind faith, a childlike sense of wonder, "
                + "foolishness, boldness, carelessness, feeling carefree");
        cards[77] = new Card("King of Swords", "innocence, new beginnings, blind faith, a childlike sense of wonder, "
                + "foolishness, boldness, carelessness, feeling carefree");        
    }
    
    public void draw() {
        int pick = rand.nextInt(78);
        cards[pick].display();
    }
}
