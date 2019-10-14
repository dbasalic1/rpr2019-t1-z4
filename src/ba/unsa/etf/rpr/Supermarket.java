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
}
