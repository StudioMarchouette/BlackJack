package nl.qien.masterclass.spellen;

import java.util.Random;
import java.util.ArrayList;
// een aantal stukken van deze class heb ik gemaakt met behulp van een tutorial
// ik kwam er zelf niet helemaal uit en raakte verloren in mijn code en wist het allemaal even niet meer

public class Deck { // class voor een deck kaarten
    // initialiseren van variabele: een arraylist met kaarten
    private ArrayList<Card> kaarten;

    //constructor: een deck bevat een arraylist met kaarten
    public Deck() {
        this.kaarten = new ArrayList<Card>();

    }

    //deze methode maakt het deck van kaarten, hij maakt bij elke soort alle values (met behulp van tutorial gemaakt)
    public void maakEenDeck() {
        for (Soort kaartSoort : Soort.values()) {
            for (Waarde kaartWaarde : Waarde.values())// enhanced for loop om alle elementen te benaderen  in de Waarde
                this.kaarten.add(new Card(kaartWaarde, kaartSoort));

        }
    }

    public void schudden() {// methode die een geschud deck maakt: haalt steeds een random kaart uit het originele deck en stopt die in het geschudde deck
        // gemaakt met behulp van een tutorial
        ArrayList<Card> geschudDeck = new ArrayList<Card>();
        Random random = new Random();
        int randomKaartIndex = 0;
        int aantalKaartenInDeck = this.kaarten.size();
        for (int i = 0; i < aantalKaartenInDeck; i++) {
            randomKaartIndex = random.nextInt(this.kaarten.size());
            geschudDeck.add(this.kaarten.get(randomKaartIndex));
            this.kaarten.remove(randomKaartIndex);

        }
        this.kaarten = geschudDeck;


    }

    public String toString() { // deze methode heb ik uit een tutorial gehaald, de methode maakt van de this.kaarten waarde een string
        String kaartenLijst = "";
        for (Card eenKaart : this.kaarten) {
            kaartenLijst += "\n" + eenKaart.toString();

        }
        return kaartenLijst;
    }

    public void verwijderKaart(int i) { // zie pakken
        this.kaarten.remove(i);

    }

    public Card getKaart(int i) { //zie pakken
        return this.kaarten.get(i);

    }

    public void voegKaartToe(Card voegKaartToe) {
        this.kaarten.add(voegKaartToe);

    }

    public void pakken(Deck komtUit) { // methode om een kaart van het deck te pakken en ook uit het deck te verwijderen
        this.kaarten.add(komtUit.getKaart(0));
        komtUit.verwijderKaart(0);

    }

    public int waardeVanKaart() { // methode zet de waarden uit de enum class om in int zodat er mee gerekend kan worden
        int totaleWaarde = 0;
        int aantalAazen = 0;
        for (Card eenKaart : this.kaarten) {
            switch (eenKaart.getWaarde()) {
                case twee:
                    totaleWaarde += 2;
                    break;
                case drie:
                    totaleWaarde += 3;
                    break;
                case vier:
                    totaleWaarde += 4;
                    break;
                case vijf:
                    totaleWaarde += 5;
                    break;
                case zes:
                    totaleWaarde += 6;
                    break;
                case zeven:
                    totaleWaarde += 7;
                    break;
                case acht:
                    totaleWaarde += 8;
                    break;
                case negen:
                    totaleWaarde += 9;
                    break;
                case tien:
                    totaleWaarde += 10;
                    break;
                case boer:
                    totaleWaarde += 10;
                    break;
                case vrouw:
                    totaleWaarde += 10;
                    break;
                case heer:
                    totaleWaarde += 10;
                    break;
                case aas:
                    aantalAazen ++; // aas kan 11 of 1 zijn, dus for loop telt het aantal aazen en voor elke aas kijkt hij
                    // of de totale waarde hoger is dan tien (10 + 11 = 21) als hoger is dan 10 dan is aas 1
                    for (int i =0 ; i < aantalAazen; i++)
                    if (totaleWaarde > 10) totaleWaarde += 1;
                    else totaleWaarde+= 11;
                    break;

            }
        }
        return totaleWaarde;

    }
}
