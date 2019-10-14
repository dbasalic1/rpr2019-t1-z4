package ba.unsa.etf.rpr;

public class Korpa {
    private Artikl[] artikli;

    public Korpa() {
        artikli = new Artikl[50];
    }

    public Artikl[] getArtikli() {
        return artikli;
    }

    public boolean dodajArtikl(Artikl a) {
        for(int i = 0; i < artikli.length; i++) {
            if(artikli[i] == null) {
                artikli[i] = a;
                return true;
            }
        }
        return false;
    }

    public Artikl izbaciArtiklSaKodom(String kod)  {

        for(int i = 0; i < artikli.length; i++) {
            if(artikli[i] != null && artikli[i].getKod().equals(kod)) {
                Artikl temp = new Artikl(artikli[i].getNaziv(),artikli[i].getCijena(),artikli[i].getKod());
                artikli[i] = null;
                return temp;
            }
        }
        return new Artikl();
    }

    public int dajUkupnuCijenuArtikala() {
        int cijena = 0;
        for(int i = 0; i < artikli.length; i++) {
            if(artikli[i] != null) cijena += artikli[i].getCijena();
        }
        return cijena;
    }
}
