package nl.qien.masterclass.spellen;

public class Card {
    private Waarde waarde;
    private Soort soort;

    // constructor voor de kaart
    public Card(Waarde waarde, Soort soort) {
        this.soort = soort;
        this.waarde = waarde;

    }
    // methode geeft de enums terug als string
    // de enums staan in een aparte class
    // ik heb deze methode en de enums met behulp van een tutorial gemaakt
    public String toString() {
        return this.soort.toString() + this.waarde.toString();

    }
    public Waarde getWaarde() {
        return this.waarde;

    }
}

