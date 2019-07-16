package nl.qien.masterclass.spellen;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.ArrayList;

public class Yahtzee { // deze class bevat de flow van het Yahtzee spel. Methoden om het spel te kunnen spelen.
    Scanner sc = new Scanner(System.in);
    private static final char startSpel = 's';
    private static final char gooien = 'g';
    private static final char stoppen = 'q';
    private static char nogEenKeerGooien = 'j';
    private static char nietOpnieuwGooien = 'n';
    ArrayList<Dobbelsteen> YahtzeeDobbelStenen;

    Dobbelsteen dA = new Dobbelsteen();
    Dobbelsteen dB = new Dobbelsteen();
    Dobbelsteen dC = new Dobbelsteen();
    Dobbelsteen dD = new Dobbelsteen();
    Dobbelsteen dE = new Dobbelsteen();

    public Yahtzee() {// constructor die vijf dobbelstenen maakt
        this.YahtzeeDobbelStenen = new ArrayList<Dobbelsteen>();


        YahtzeeDobbelStenen.add(dA);
        YahtzeeDobbelStenen.add(dB);
        YahtzeeDobbelStenen.add(dC);
        YahtzeeDobbelStenen.add(dD);
        YahtzeeDobbelStenen.add(dE);




    }


    public void spelen() {

        System.out.println("+++++Welkom bij Yahtzee+++++");
        System.out.println("De knoppen: g = dobbelstenen gooien, q = stoppen");
        System.out.println("Druk op s om the spel te starten");
        char beginnen = sc.next().charAt(0);

        if (beginnen == startSpel) {

            System.out.println("De dobbelstenen liggen klaar op de tafel... de spanning stijgt...");
            System.out.println("Druk op g om de dobbelstenen op te pakken en te gooien");
            char gooi = sc.next().charAt(0);
            if (gooi == gooien) {


                do {
                    System.out.println("De dobbelstenen zijn gegooid. ");
                    werpDobbelstenen();

                    System.out.println();
                    System.out.println("Wil je  nog een keer gooien om je score te verbeteren? j/n");
                    char gooiOpnieuw = sc.next().charAt(0);
                    if (gooiOpnieuw == nogEenKeerGooien) {
                        opnieuwGooien();

                    } else if (gooiOpnieuw == nietOpnieuwGooien)  {
                        System.out.println("De dobbelstenen worden niet opnieuw gegooid, je score is " );
                    }else if (gooiOpnieuw == stoppen){
                    System.out.println("Het spel is beeïndigd");}





                } while (gooi != stoppen );


            }


        } else {
            System.out.println("Je hebt geen geldige optie gekozen");
        }

    }

    public void werpDobbelstenen() {// methode om dobbelstenen te werpen
        for (int i=1 ;i<=(YahtzeeDobbelStenen.size());i++) {
            System.out.print("\t"+i);
        }
        System.out.println();

        for (Dobbelsteen steen : YahtzeeDobbelStenen) {
            int worp = steen.gooiDobbelsteen();

            //kan die worp r niet uit? hij returnt al waarde? even proberen nog
            // dus ipv int worp = steen...
            // gewoon allee steen.gooiDobbeslteen()


            System.out.print("\t" + worp);
            System.out.print("");
        }


    }



    public void opnieuwGooien() {
        System.out.println("Welke dobbelstenen wil je opnieuw gooien? Typ voor elke steen een 0 voor behouden en een 1 voor opnieuw gooien. Typ een enter tussen je keuzes in");
        int steen1= sc.nextInt();
        int steen2= sc.nextInt();
        int steen3= sc.nextInt();
        int steen4= sc.nextInt();
        int steen5 = sc.nextInt();
        int [] stenen = {steen1, steen2, steen3, steen4, steen5};

        for (int i : stenen)
            System.out.println("Je heb voor " + stenen[]+ "ingevoerd "+ i);

        System.out.println( "Je hebt het volgende ingevoerd : "+ steen1 + steen2 + steen3 + steen4+ steen5);

       }



// index i hold worp = worp
        // index j gooiDobbelsteen = worp



    }











