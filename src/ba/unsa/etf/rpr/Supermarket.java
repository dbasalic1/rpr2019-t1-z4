package ba.unsa.etf.rpr;

public class Supermarket {
    private Artikl[] artikli;
    public Supermarket() {
        artikli = new Artikl[1000];
    }

    public void dodajArtikl(Artikl a) {
        for(int i = 0; i < artikli.length; i++) {
            if(artikli[i] == null) {
                artikli[i] = a;
                break;
            }
        }
    }

    public Artikl[] getArtikli() {
        return artikli;
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
}
