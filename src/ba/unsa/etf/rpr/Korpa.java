package ba.unsa.etf.rpr;

public class Korpa {
    private Artikl[] artikli;
    private int brojArtikala;

    public Korpa() {
        brojArtikala = 0;
        artikli = new Artikl[50];
    }

    public Artikl[] getArtikli() {
        return artikli;
    }

    public boolean dodajArtikl(Artikl a) {
        artikli[brojArtikala++] = a;
        return true;
    }

    public Artikl izbaciArtiklSaKodom(String kod) {
        Artikl x = new Artikl("bla", 120, "abc");
        for(int i = 0; i < brojArtikala; i++) {
            if(artikli[i] != null && artikli[i].getKod().equals(kod)) {
                Artikl temp = new Artikl(artikli[i].getNaziv(),artikli[i].getCijena(),artikli[i].getKod());
                brojArtikala--;
                artikli[i] = null;
                return temp;
            }
        }
        return x;
    }

    public int dajUkupnuCijenuArtikala() {
        int cijena = 0;
        for(int i = 0; i < brojArtikala; i++) {
            if(artikli[i] != null) cijena += artikli[i].getCijena();
        }
        return cijena;
    }
}
