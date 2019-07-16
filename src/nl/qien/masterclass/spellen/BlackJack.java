package nl.qien.masterclass.spellen;

import java.util.Scanner;


public class BlackJack {
    private static final char stoppen = 'q';
    private static final char passen = 'p';
    private static final char dealen = 'd';
    private static final char starten = 's';

    int totaleWaardeKaartenSpeler = 0;
    private static final int BlackJack = 21;
    public boolean gewonnen = false;
    public boolean verloren = false;
    public boolean verderSpelen = true;

    Deck speelDeck = new Deck();
    Deck spelerDeck = new Deck();


    public void spelen() {

        System.out.println("We spelen BlackJack");
        System.out.println("Dus pak je geld en ga lekker zitten.");
        System.out.println("Je wint bij 21, een aas kan een 1 of een 11 zijn, dit ligt eraan of je boven de 21 uitkomt met een 11");
        System.out.println("De kaarten worden nu geschud.");
        System.out.println(" ");


        speelDeck.maakEenDeck();
        speelDeck.schudden();

        //System.out.println(speelDeck); test om te kijken of er een geschud deck ontstaat


        System.out.println("Wanneer je de eerste kaart dealt krijg je twee kaarten toebedeeld, bij elke volgende beurt krijg je er 1.");
        System.out.println("Wanneer je wil passen typ je een p");
        System.out.println("Om het spel te stoppen typ je q");
        System.out.println("Druk op s om te starten");

        Scanner sc = new Scanner(System.in);
        char kaartTrekken; // wanneer er een d ingetypt wordt, wordt een kaart getrokken.
        char beginnen;
        beginnen = sc.next().charAt(0);


           if (beginnen == starten) { // als speler op s drukt krijgt hij twee kaarten
                spelerDeck.pakken(speelDeck);
                spelerDeck.pakken(speelDeck);
                totaleWaardeKaartenSpeler = spelerDeck.waardeVanKaart();
                System.out.println("Je bent gestart en hebt de kaarten " + spelerDeck.toString() + " gekregen. De totale waarde is " + totaleWaardeKaartenSpeler);
            }




        do {
            System.out.println("Typ een d in om de volgende kaart te dealen");
            kaartTrekken = sc.next().charAt(0);

            switch (kaartTrekken) {
                case stoppen:
                    System.out.println("Spel is gestopt");
                    break;
                case passen:
                    System.out.println("Je hebt gepast, je totaal is: " + totaleWaardeKaartenSpeler);
                    System.out.println("Het spel is hiermee beëindigd");
                    checkBlackJack();
                    verderSpelen = false;
                    break;
                case dealen:
                    verwerkKaart(kaartTrekken);
                    break;
                default:
                    System.out.println("Deze keuze bestaat niet, probeer opnieuw");
            }


        } while (kaartTrekken != 'q' && verloren != true && gewonnen != true && verderSpelen != false) ;
        System.out.println(" Het spel is beëindigd");


    }

    private void verwerkKaart(char kaartTrekken) {
        spelerDeck.pakken(speelDeck);
        System.out.println("Je hebt een kaart getrokken, de volgende kaarten zitten in je hand: " + spelerDeck.toString());
        // oproepen methode om waarde getrokken kaart op te tellen bij totaleWaardeKaartenSpeler
        totaleWaardeKaartenSpeler = spelerDeck.waardeVanKaart();
        System.out.println("De totale waarde van je kaarten is: " + totaleWaardeKaartenSpeler);
        checkBlackJack();


    }

    private boolean checkBlackJack() {
        if (totaleWaardeKaartenSpeler == BlackJack){
            System.out.println("BlackJack, je hebt gewonnen!");
        gewonnen = true;
        return gewonnen;}
        if (totaleWaardeKaartenSpeler > BlackJack) {
            System.out.println("Neeeeee, je hebt verloren :(, de waarde van je kaarten is te hoog");
            verloren = true;
            return verloren;
        }
//        System.out.println("druk op q om het spel te beëindigen");
        return verderSpelen;
    }
}
