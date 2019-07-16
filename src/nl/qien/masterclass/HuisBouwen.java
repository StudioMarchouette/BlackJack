package nl.qien.masterclass;

public class HuisBouwen {
    public static void main(String[] args) {

        Huis huis1 = new Huis();
        huis1.toonGegevensHuis();
    }
}

// het is standaard om een class public te maken maar het is gen vereiste
class Huis {
    String straat;
    String huisnummer;
    int hoogte;
    int breedte;
    int diepte;
    int inhoud;
    boolean internetAansluiting;

    public void toonGegevensHuis() {
        System.out.println("Gegevens huis");
        System.out.println("adres = " + straat + " " +huisnummer);

        System.out.println("internetAansluiting = " + internetAansluiting);
    }


}

