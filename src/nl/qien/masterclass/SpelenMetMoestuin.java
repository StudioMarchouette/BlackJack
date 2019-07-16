package nl.qien.masterclass;

public class SpelenMetMoestuin {
    public static void main(String[] args) {
        Moestuin moestuin1 = new Moestuin(); //aanmaken van de moestuin objecten
        Moestuin moestuin2 = new Moestuin();

        moestuin1.eigenaar = ("Klaas"); // namen eigenaren instellen via variabele in de instantie nl.qien.masterclass.Moestuin, variabele is bepaald in de class en niet in een method
        moestuin2.eigenaar = ("Pietje");
        System.out.println("De eigenaren van de moestuinen zijn: "+ moestuin1.eigenaar + " en "+ moestuin2.eigenaar);

        moestuin1.setEigenaar("Peter"); // naam eigenaren instellen via methode variabele, deze kan alleen via de methode benaderd worden
        moestuin2.setEigenaar("Hendrik");

        moestuin1.isBeplant = true;  // is de moestuin beplant instellen
        moestuin2.isBeplant = false;

        moestuin1.beplant();  // methode toont of moestuin is beplant
        moestuin2.beplant();

        moestuin1.aantalTomaten = 10; //  variabele die het aantal tomaten instelt
        moestuin1.aantalKomkommers = 20;

        moestuin1.toonTomaten();  // methode toont het aantal groenten per groenten
        moestuin1.toonKomkommers();


        moestuin1.oogstTomaten = 4; // hoeveel tomaten zijn er geoogst
        moestuin1.geoogsteTomaten(); // methode die aangeeft hoeveel er over zijn

        moestuin1.oogstKomkommers = 5;
        moestuin1.geoogsteKomkommers();


    }

}

class Moestuin { // deze class bevat de blauwdruk van alle objecten die een moestuin zijn
    public String eigenaar;
    public boolean isBeplant;

    public int aantalTomaten;
    public int aantalKomkommers;

    public boolean oogst;
    public int oogstTomaten;
    public int oogstKomkommers;


    public void setEigenaar(String eigenaar) {// een methode om te bepalen wie de eigenaar is
        this.eigenaar = eigenaar;
        System.out.println("De eigenaar van de moestuin is " + eigenaar);
    }

    public void toonTomaten() {// methode die aangeeft hoeveel tomaten er zijn
        System.out.println("Er staan " + aantalTomaten + " tomaten in de moestuin.");
    }

    public void toonKomkommers() {// methode die aangeeft hoeveel komkommers er zijn
        System.out.println("Er staan " + aantalKomkommers + " komkommers in de moestuin.");
    }

    public void beplant() { // methode die aangeeft of de moestuin beplant is
        this.isBeplant = isBeplant;

        if (isBeplant == true) {
            System.out.println("Deze tuin is beplant");
        }
        if (isBeplant == false)
            System.out.println("Deze tuin is niet beplant");
    }

    public void geoogsteTomaten() { // methode die aangeeft wat er moet gebeuren als er tomaten geoogst zijn
        if (oogst = true) {
            aantalTomaten = aantalTomaten - oogstTomaten;
            System.out.println("Er zijn "+ oogstTomaten + " tomaten geoogst. Het aantal tomaten is nu " + aantalTomaten);
        }
    }

    public void geoogsteKomkommers() { // methode die aangeeft wat er moet gebeuren als er komkommers geoogst zijn
        if (oogst = true) {
            aantalKomkommers = aantalKomkommers - oogstKomkommers;
            System.out.println("Er zijn "+ oogstKomkommers + " komkommers geoogst. Het aantal komkommers is nu " + aantalKomkommers);
        }
    }
}


