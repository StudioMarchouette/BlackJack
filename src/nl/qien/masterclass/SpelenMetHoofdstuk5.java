package nl.qien.masterclass;

public class SpelenMetHoofdstuk5 {
    public static void main(String[] args) {
        // hoofdstuk 5 is flow control
        int leeftijd = 17;
        if (leeftijd > 18) {
            System.out.println("je mag drinken");

        } else {
            System.out.println("Helaas je bent nog te jong");
        }// je bent niet verplicht om de accolades te gebruiken, maar in de praktijk moet je het wel doen
        // zonder accolades wordt alleen de eerste regel code uitgevoerd indien true, dus niet de tweede regel
        // de tweede regel hoort dan gewoon niet bij de statement
        // als je een if hebt zonder accolades, en meer dan 1 regel code en dan een else dan compileert de code ook niet!

        if (leeftijd > 16)
            System.out.println("vroeger mocht je drinken maar nu niet meer");
            //System.out.println("dikke lul deze regel compileert dus niet zonder accolades");
        else
            System.out.println("je bent nog een baby");

        if (leeftijd > 19) ;
        else
            System.out.println("ook dit compileert, ; is ook een regel code.");
        // je mag dus een regel code maken zonder statement, of lege accolades
        // je mag ook de gehele statement op 1 regel zetten
        // maar er moet wel minimaal 1 regel code na de if komen, een if () alleen compileert niet, if (true);  compileert wel
        if (true) ;
        else
            ; // deze else is dead code, is niet bereikbaar. De if zal in dit geval gewoon altijd uitgevoerd worden en de else niet.
        // wat ook mag:
        System.out.println(leeftijd >= 18 ? "Je mag drinken" : "Je mag niet drinken");
        // dit is een ternary construct
        // statement ? wat als het waar is : als het niet waar is
        // kan handig zijn bij kleine statements
        // het is een soort return statement
        // accolades met code blokken zijn in deze niet toegestaan
        // je mag alleen twee gelijke typen teruggeven
        // je moet een boolean hebben om dit te kunnen uitvoeren
        // voor printen mag je wel twee verschillende types, omdat het geldige invoer betreft voor de sout
        System.out.println(leeftijd >= 18 ? "Je mag drinken" : 17);

        // je hebt ook geneste if statements, met een else waar een if in zit. let wel op de uitlijning! je kan ook de else if gebruiken wat ook een geneste if statement is
        if (leeftijd > 18) {
            System.out.println("zuipe!");
        } else {
            if (leeftijd < 16) {
                System.out.println("klein babytje");

            } else {
                System.out.println("superkut voor je");
            }
        }
        // je hebt daarnaast ook nog geneste ternary's . Dit mag dus gewoon.

        // switch statement
        String dag = "Vrijdag";
        // je moet de waarde van de variabelen erin stoppen anders compileert de code niet
        // of: je moet de variabele final maken! wanneer de waarde van de variabele een constante is compileert het wel
        switch (dag) {
            case "Maandag":
            case "Dinsdag":
            case "Woensdag":
            case "Donderdag":
                System.out.println("Gewoon een doordeweekse dagje");
            case "Vrijdag":
                System.out.println("het weekend is nabij");
            case "Zaterdag":
            case "Zondag":
                System.out.println("het weekend is hier!");
                break;
            default:
                System.out.println("Deze dag is geen dag");

                // wanneer je er geen break in zet blijft de code lopen nadat hij een match vindt.
                // het meest logisch is om de default onderaan te zetten, want anderes runt hij m altijd..
                // je moet dezelfde type variabele gebruiken voor alle cases
                // je mag de break alleen in een switch of een loop zetten, niet eronder oid
                // de kleinste switch optie:

                switch (dag) {
                } // maar deze doet niets
        }

        // de for loop
       stoppen:  for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println("deze switch doet vijf rondes en doet elke rond 5 rondes van de subloop");
                System.out.println("i en j" + i + " " + j);
                if (j == 2) {
                    System.out.println("tijd voor een break");
                    System.out.println("dit breakt de for loop waar het programma op dit moment in zit en begint dan weer met de volgende loop");
                    break stoppen; // met een label kan je meerdere loops breaken
                    // het label werkt alleen in het code block waar het voor staat,
                    // er bestaat ook nog een continue,
                }
            }
        }

        // de for loop met continue
        // het is ook mogelijk om een continue te maken naar een label
        label: for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println("deze switch doet vijf rondes en doet elke rond 5 rondes van de subloop");
                System.out.println("i en j" + i + " " + j);
                if (j == 2) {
                    System.out.println("tijd voor een continue");
                    continue label; // het label sprint naar het begin van het label, continue zonder label springt in deze weer naar het begin va nde loop waar je inzat, dus de j loop
                }
                    System.out.println("de continue geeft aan dat de code eronder niet uitgevoerd moet worden wanneer j 2 is");

                }
            }
        }
    }

