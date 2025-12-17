package bva_desciisionTable.bva_desciisionTable;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CoinDecisionTest {

    @Test
    void R1() {
        CoinDecision cd = new CoinDecision();
        String result = cd.CoinDecision("T", "T", "T", "T");
        assertEquals("Negative", result);
    }

    @Test
    void R2() {
        CoinDecision cd = new CoinDecision();
        String result = cd.CoinDecision("H", "T", "T", "T");
        assertEquals("Negative", result);
    }

    @Test
    void R3() {
        CoinDecision cd = new CoinDecision();
        String result = cd.CoinDecision("H", "H", "T", "T");
        assertEquals("Positive", result);
    }

    @Test
    void R4() {
        CoinDecision cd = new CoinDecision();
        String result = cd.CoinDecision("H", "H", "H", "T");
        assertEquals("Positive", result);
    }
}
