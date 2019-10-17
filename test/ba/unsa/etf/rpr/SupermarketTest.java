package ba.unsa.etf.rpr;

import static org.junit.jupiter.api.Assertions.*;

class SupermarketTest {

    @org.junit.jupiter.api.Test
    void dodajArtikl() {
        Supermarket s = new Supermarket();
        s.dodajArtikl(new Artikl("zvake",0.80,"1"));
        int brojArtikala = 0;
        for(int i = 0; i < s.getArtikli().length; i++) {
            if(s.getArtikli()[i] != null) brojArtikala++;
        }
        assertEquals(1, brojArtikala);
    }

    @org.junit.jupiter.api.Test
    void getArtikli() {
    }

    @org.junit.jupiter.api.Test
    void izbaciArtiklSaKodom() {
    }
}