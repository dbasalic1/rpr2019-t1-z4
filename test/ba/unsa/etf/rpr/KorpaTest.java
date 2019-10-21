package ba.unsa.etf.rpr;

import static org.junit.jupiter.api.Assertions.*;

class KorpaTest {



    @org.junit.jupiter.api.Test
    void izbaciArtiklSaKodom() {
        Korpa k = new Korpa();
        k.dodajArtikl(new Artikl("a", 1, "1"));
        k.dodajArtikl(new Artikl("b", 1, "2"));
        Artikl a = k.izbaciArtiklSaKodom("2");
        assertEquals("2", a.getKod());
    }
}