package ba.unsa.etf.rpr;

public class Supermarket {
    private Artikl[] artikli;
    private int brojArtikala;

    public Supermarket() {
        brojArtikala = 0;
        artikli = new Artikl[1000];
    }

    public void dodajArtikl(Artikl a) {
        artikli[brojArtikala++] = a;
    }

    public Artikl[] getArtikli() {
        return artikli;
    }

    public Artikl izbaciArtiklSaKodom(String kod) {
        Artikl x = new Artikl("bla", 120, "abc");
        for(int i = 0; i < brojArtikala; i++) {
            if(artikli[i].getKod().equals(kod)) {
                Artikl temp = new Artikl(artikli[i].getNaziv(),artikli[i].getCijena(),artikli[i].getKod());
                brojArtikala--;
                artikli[i] = null;
                return temp;
            }
        }
        return x;
    }
}
