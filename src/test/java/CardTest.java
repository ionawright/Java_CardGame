import static org.junit.Assert.*;
import org.junit.*;
import org.junit.experimental.theories.suppliers.TestedOn;

public class CardTest {

    Card card;

    @Before
    public void before(){
        card = new Card(SuitType.HEARTS, RankType.ACE);
    }

    @Test
    public void canGetSuit(){
        assertEquals(SuitType.HEARTS,card.getSuit());
    }

    @Test
    public void canGetRank() {
        assertEquals(RankType.ACE,card.getRank());
    }

    @Test
    public void queenHasValue10() {
        card = new Card(SuitType.HEARTS, RankType.QUEEN);
        assertEquals(10, card.getValueFromEnum());
    }



}