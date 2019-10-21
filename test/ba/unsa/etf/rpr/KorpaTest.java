package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KorpaTest {


    @Test
    void daLiSeIspravnoDodajeArtikl() {
        Korpa k = new Korpa();
        k.dodajArtikl(new Artikl("naziv",25,"kod"));
        Artikl[] artikli = k.getArtikli();
        assertAll( () -> {
            assertNotNull(artikli[0]);
            assertEquals("naziv", artikli[0].getNaziv());
        });
    }

    @Test
    void daLiCePrekoracitiBrojArtikala() {
        assertDoesNotThrow( ()-> {
            Korpa k = new Korpa();
            for (int i = 0; i < 2000; i++) k.dodajArtikl(new Artikl("naziv" + i, i, "kod" + i));
        });
    }
}