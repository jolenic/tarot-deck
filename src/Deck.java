import java.util.Random;

public class Deck {
    private Card[] cards;
    private Random rand;
    
    Deck() {
        rand = new Random();
        cards = new Card[78];
        cards[0] = new Card("The Fool", "innocence, new beginnings, blind faith, a childlike sense of wonder, "
                + "foolishness, boldness, carelessness, feeling carefree");
        cards[1] = new Card("The Fool", "innocence, new beginnings, blind faith, a childlike sense of wonder, "
                + "foolishness, boldness, carelessness, feeling carefree");
        cards[2] = new Card("The Fool", "innocence, new beginnings, blind faith, a childlike sense of wonder, "
                + "foolishness, boldness, carelessness, feeling carefree");
        cards[3] = new Card("The Fool", "innocence, new beginnings, blind faith, a childlike sense of wonder, "
                + "foolishness, boldness, carelessness, feeling carefree");
        cards[4] = new Card("The Fool", "innocence, new beginnings, blind faith, a childlike sense of wonder, "
                + "foolishness, boldness, carelessness, feeling carefree");
        cards[5] = new Card("The Fool", "innocence, new beginnings, blind faith, a childlike sense of wonder, "
                + "foolishness, boldness, carelessness, feeling carefree");
        cards[6] = new Card("The Fool", "innocence, new beginnings, blind faith, a childlike sense of wonder, "
                + "foolishness, boldness, carelessness, feeling carefree");
        cards[7] = new Card("The Fool", "innocence, new beginnings, blind faith, a childlike sense of wonder, "
                + "foolishness, boldness, carelessness, feeling carefree");
        cards[8] = new Card("The Fool", "innocence, new beginnings, blind faith, a childlike sense of wonder, "
                + "foolishness, boldness, carelessness, feeling carefree");
        cards[9] = new Card("The Fool", "innocence, new beginnings, blind faith, a childlike sense of wonder, "
                + "foolishness, boldness, carelessness, feeling carefree");
        cards[10] = new Card("The Fool", "innocence, new beginnings, blind faith, a childlike sense of wonder, "
                + "foolishness, boldness, carelessness, feeling carefree");
        cards[11] = new Card("The Fool", "innocence, new beginnings, blind faith, a childlike sense of wonder, "
                + "foolishness, boldness, carelessness, feeling carefree");
        cards[12] = new Card("The Fool", "innocence, new beginnings, blind faith, a childlike sense of wonder, "
                + "foolishness, boldness, carelessness, feeling carefree");
        cards[13] = new Card("The Fool", "innocence, new beginnings, blind faith, a childlike sense of wonder, "
                + "foolishness, boldness, carelessness, feeling carefree");
        cards[14] = new Card("The Fool", "innocence, new beginnings, blind faith, a childlike sense of wonder, "
                + "foolishness, boldness, carelessness, feeling carefree");
        cards[15] = new Card("The Fool", "innocence, new beginnings, blind faith, a childlike sense of wonder, "
                + "foolishness, boldness, carelessness, feeling carefree");
        cards[16] = new Card("The Fool", "innocence, new beginnings, blind faith, a childlike sense of wonder, "
                + "foolishness, boldness, carelessness, feeling carefree");
        cards[17] = new Card("The Fool", "innocence, new beginnings, blind faith, a childlike sense of wonder, "
                + "foolishness, boldness, carelessness, feeling carefree");
        cards[18] = new Card("The Fool", "innocence, new beginnings, blind faith, a childlike sense of wonder, "
                + "foolishness, boldness, carelessness, feeling carefree");
        cards[19] = new Card("The Fool", "innocence, new beginnings, blind faith, a childlike sense of wonder, "
                + "foolishness, boldness, carelessness, feeling carefree");
        cards[20] = new Card("The Fool", "innocence, new beginnings, blind faith, a childlike sense of wonder, "
                + "foolishness, boldness, carelessness, feeling carefree");
        cards[21] = new Card("The Fool", "innocence, new beginnings, blind faith, a childlike sense of wonder, "
                + "foolishness, boldness, carelessness, feeling carefree");
        cards[22] = new Card("The Fool", "innocence, new beginnings, blind faith, a childlike sense of wonder, "
                + "foolishness, boldness, carelessness, feeling carefree");
        cards[23] = new Card("The Fool", "innocence, new beginnings, blind faith, a childlike sense of wonder, "
                + "foolishness, boldness, carelessness, feeling carefree");
        cards[24] = new Card("The Fool", "innocence, new beginnings, blind faith, a childlike sense of wonder, "
                + "foolishness, boldness, carelessness, feeling carefree");
        cards[25] = new Card("The Fool", "innocence, new beginnings, blind faith, a childlike sense of wonder, "
                + "foolishness, boldness, carelessness, feeling carefree");
        cards[26] = new Card("The Fool", "innocence, new beginnings, blind faith, a childlike sense of wonder, "
                + "foolishness, boldness, carelessness, feeling carefree");
        cards[27] = new Card("The Fool", "innocence, new beginnings, blind faith, a childlike sense of wonder, "
                + "foolishness, boldness, carelessness, feeling carefree");
        cards[28] = new Card("The Fool", "innocence, new beginnings, blind faith, a childlike sense of wonder, "
                + "foolishness, boldness, carelessness, feeling carefree");
        cards[29] = new Card("The Fool", "innocence, new beginnings, blind faith, a childlike sense of wonder, "
                + "foolishness, boldness, carelessness, feeling carefree");
        cards[30] = new Card("The Fool", "innocence, new beginnings, blind faith, a childlike sense of wonder, "
                + "foolishness, boldness, carelessness, feeling carefree");
        cards[31] = new Card("The Fool", "innocence, new beginnings, blind faith, a childlike sense of wonder, "
                + "foolishness, boldness, carelessness, feeling carefree");
        cards[32] = new Card("The Fool", "innocence, new beginnings, blind faith, a childlike sense of wonder, "
                + "foolishness, boldness, carelessness, feeling carefree");
        cards[33] = new Card("The Fool", "innocence, new beginnings, blind faith, a childlike sense of wonder, "
                + "foolishness, boldness, carelessness, feeling carefree");
        cards[34] = new Card("The Fool", "innocence, new beginnings, blind faith, a childlike sense of wonder, "
                + "foolishness, boldness, carelessness, feeling carefree");
        cards[35] = new Card("The Fool", "innocence, new beginnings, blind faith, a childlike sense of wonder, "
                + "foolishness, boldness, carelessness, feeling carefree");
        cards[36] = new Card("The Fool", "innocence, new beginnings, blind faith, a childlike sense of wonder, "
                + "foolishness, boldness, carelessness, feeling carefree");
        cards[37] = new Card("The Fool", "innocence, new beginnings, blind faith, a childlike sense of wonder, "
                + "foolishness, boldness, carelessness, feeling carefree");
        cards[38] = new Card("The Fool", "innocence, new beginnings, blind faith, a childlike sense of wonder, "
                + "foolishness, boldness, carelessness, feeling carefree");
        cards[39] = new Card("The Fool", "innocence, new beginnings, blind faith, a childlike sense of wonder, "
                + "foolishness, boldness, carelessness, feeling carefree");
        cards[40] = new Card("The Fool", "innocence, new beginnings, blind faith, a childlike sense of wonder, "
                + "foolishness, boldness, carelessness, feeling carefree");
        cards[41] = new Card("The Fool", "innocence, new beginnings, blind faith, a childlike sense of wonder, "
                + "foolishness, boldness, carelessness, feeling carefree");
        cards[42] = new Card("The Fool", "innocence, new beginnings, blind faith, a childlike sense of wonder, "
                + "foolishness, boldness, carelessness, feeling carefree");
        cards[43] = new Card("The Fool", "innocence, new beginnings, blind faith, a childlike sense of wonder, "
                + "foolishness, boldness, carelessness, feeling carefree");
        cards[44] = new Card("The Fool", "innocence, new beginnings, blind faith, a childlike sense of wonder, "
                + "foolishness, boldness, carelessness, feeling carefree");
        cards[45] = new Card("The Fool", "innocence, new beginnings, blind faith, a childlike sense of wonder, "
                + "foolishness, boldness, carelessness, feeling carefree");
        cards[46] = new Card("The Fool", "innocence, new beginnings, blind faith, a childlike sense of wonder, "
                + "foolishness, boldness, carelessness, feeling carefree");
        cards[47] = new Card("The Fool", "innocence, new beginnings, blind faith, a childlike sense of wonder, "
                + "foolishness, boldness, carelessness, feeling carefree");
        cards[48] = new Card("The Fool", "innocence, new beginnings, blind faith, a childlike sense of wonder, "
                + "foolishness, boldness, carelessness, feeling carefree");
        cards[49] = new Card("The Fool", "innocence, new beginnings, blind faith, a childlike sense of wonder, "
                + "foolishness, boldness, carelessness, feeling carefree");
        cards[50] = new Card("The Fool", "innocence, new beginnings, blind faith, a childlike sense of wonder, "
                + "foolishness, boldness, carelessness, feeling carefree");
        cards[51] = new Card("The Fool", "innocence, new beginnings, blind faith, a childlike sense of wonder, "
                + "foolishness, boldness, carelessness, feeling carefree");
        cards[52] = new Card("The Fool", "innocence, new beginnings, blind faith, a childlike sense of wonder, "
                + "foolishness, boldness, carelessness, feeling carefree");
        cards[53] = new Card("The Fool", "innocence, new beginnings, blind faith, a childlike sense of wonder, "
                + "foolishness, boldness, carelessness, feeling carefree");
        cards[54] = new Card("The Fool", "innocence, new beginnings, blind faith, a childlike sense of wonder, "
                + "foolishness, boldness, carelessness, feeling carefree");
        cards[55] = new Card("The Fool", "innocence, new beginnings, blind faith, a childlike sense of wonder, "
                + "foolishness, boldness, carelessness, feeling carefree");
        cards[56] = new Card("The Fool", "innocence, new beginnings, blind faith, a childlike sense of wonder, "
                + "foolishness, boldness, carelessness, feeling carefree");
        cards[57] = new Card("The Fool", "innocence, new beginnings, blind faith, a childlike sense of wonder, "
                + "foolishness, boldness, carelessness, feeling carefree");
        cards[58] = new Card("The Fool", "innocence, new beginnings, blind faith, a childlike sense of wonder, "
                + "foolishness, boldness, carelessness, feeling carefree");
        cards[59] = new Card("The Fool", "innocence, new beginnings, blind faith, a childlike sense of wonder, "
                + "foolishness, boldness, carelessness, feeling carefree");
        cards[60] = new Card("The Fool", "innocence, new beginnings, blind faith, a childlike sense of wonder, "
                + "foolishness, boldness, carelessness, feeling carefree");
        cards[61] = new Card("The Fool", "innocence, new beginnings, blind faith, a childlike sense of wonder, "
                + "foolishness, boldness, carelessness, feeling carefree");
        cards[62] = new Card("The Fool", "innocence, new beginnings, blind faith, a childlike sense of wonder, "
                + "foolishness, boldness, carelessness, feeling carefree");
        cards[63] = new Card("The Fool", "innocence, new beginnings, blind faith, a childlike sense of wonder, "
                + "foolishness, boldness, carelessness, feeling carefree");
        cards[64] = new Card("The Fool", "innocence, new beginnings, blind faith, a childlike sense of wonder, "
                + "foolishness, boldness, carelessness, feeling carefree");
        cards[65] = new Card("The Fool", "innocence, new beginnings, blind faith, a childlike sense of wonder, "
                + "foolishness, boldness, carelessness, feeling carefree");
        cards[66] = new Card("The Fool", "innocence, new beginnings, blind faith, a childlike sense of wonder, "
                + "foolishness, boldness, carelessness, feeling carefree");
        cards[67] = new Card("The Fool", "innocence, new beginnings, blind faith, a childlike sense of wonder, "
                + "foolishness, boldness, carelessness, feeling carefree");
        cards[68] = new Card("The Fool", "innocence, new beginnings, blind faith, a childlike sense of wonder, "
                + "foolishness, boldness, carelessness, feeling carefree");
        cards[69] = new Card("The Fool", "innocence, new beginnings, blind faith, a childlike sense of wonder, "
                + "foolishness, boldness, carelessness, feeling carefree");
        cards[70] = new Card("The Fool", "innocence, new beginnings, blind faith, a childlike sense of wonder, "
                + "foolishness, boldness, carelessness, feeling carefree");
        cards[71] = new Card("The Fool", "innocence, new beginnings, blind faith, a childlike sense of wonder, "
                + "foolishness, boldness, carelessness, feeling carefree");
        cards[72] = new Card("The Fool", "innocence, new beginnings, blind faith, a childlike sense of wonder, "
                + "foolishness, boldness, carelessness, feeling carefree");
        cards[73] = new Card("The Fool", "innocence, new beginnings, blind faith, a childlike sense of wonder, "
                + "foolishness, boldness, carelessness, feeling carefree");
        cards[74] = new Card("The Fool", "innocence, new beginnings, blind faith, a childlike sense of wonder, "
                + "foolishness, boldness, carelessness, feeling carefree");
        cards[75] = new Card("The Fool", "innocence, new beginnings, blind faith, a childlike sense of wonder, "
                + "foolishness, boldness, carelessness, feeling carefree");
        cards[76] = new Card("The Fool", "innocence, new beginnings, blind faith, a childlike sense of wonder, "
                + "foolishness, boldness, carelessness, feeling carefree");
        cards[77] = new Card("The Fool", "innocence, new beginnings, blind faith, a childlike sense of wonder, "
                + "foolishness, boldness, carelessness, feeling carefree");        
    }
    
    public void draw() {
        int pick = rand.nextInt(78);
        cards[pick].display();
    }
}
