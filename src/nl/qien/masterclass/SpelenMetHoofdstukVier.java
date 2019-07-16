package nl.qien.masterclass;

import java.util.ArrayList;

public class SpelenMetHoofdstukVier {
    public static void main(String[] args) {
        // de String class
        //je kan nieuwe objecten maken met de String class:
        String string1 = new String("voorbeeld");
        String string2 = new String("voorbeeld");
        // dit zijn twee verschillende objecten, wanneer je ze met == vergelijkt komt er false uit
        System.out.println(string1 == string2); // print false
// wanneer je geen niet object maakt, komt er true uit:
        String string3 = "voorbeeld1";
        String string4 = "voorbeeld1";
        System.out.println(string3 == string4); // print true
        System.out.println("voorbeeld1" == "voorbeeld1"); // print true, ook hier worden 2 String objecten aangemaakt tenzij ze al aanwezig zijn in de String pool
        // wanneer je twee leashes maakt met dezelfde String waarden erin refereren deze naar hetzelfde object in de Stringpool
        // Java zoekt eerst naar de waardes in de pool, als deze al bestaan wordt er geen nieuw object gemaakt
        // in bovenstaande sout worden dus geen nieuwe objecten aangemaakt! Dit komt omdat deze al in de string pool bestaan
        String ochtend1 = "ochtend";
        System.out.println(ochtend1 == "ochtend");// dit is dus true
        String ochtend2 = new String("ochtend");
        System.out.println(ochtend1 == ochtend2);// dit is false want er wordt neit naar hetzelfde gerefereerd.
        // een string constructor accepteert ook een char array
        char[] naam = new char[]{'J', 'a', 'n'};
        String naam2 = new String(naam);
        String naam1 = new String("Jan");
        System.out.println(naam2 == naam1); // print false, want het betreft 2  verschillende objecten
        // String is een class, dus de default waarde is null
        // null is altijd de literal default voor objecten
        System.out.println("Als je equals gebruikt komt er wel true, want dan worden de waarden vergeleken ");
        System.out.println(naam2.equals(naam1)); // print true
        //pro tip is dus ook om nooit een == te gebruiken om waardes van strings te vergelijken

        // de String class is immutable, dus wanneer een object is gemaakt kan het niet worden veranderd
        // alle methodes van String die een veranderde String teruggeven, geven een nieuw object terug. het oude object verandert niet
        // de String class heeft de methodes: charAt, indexOf, substring, trim, replace, length, startsWith, endsWith
        //charAt() kan een index van een karakter teruggeven
        System.out.println(naam2.charAt(2)); // geeft de n
        // wanneer je deze methode gebruikt voor een index die niet bestaat krijg je een runtime exception
        // indexOf() zoekt naar een bepaald karakter en geeft de  eerst matchende index terug van links naar rechts
        System.out.println(naam2.indexOf('J'));// geeft terug 0
        // je kan de methode ook vanaf een andere index laten beginnen
        String allemaalLetters = "HJHEHJKGBMYYY";
        // er staat een H op de 0, en 1 op de 2, en 1 op de 4.
        System.out.println(allemaalLetters.indexOf('H'));// geeft een 0
        System.out.println(allemaalLetters.indexOf('H', 2));// geeft een 2, hij neemt de 2 ook nog mee in de telling
        // de substring methode geeft een deel van een string terug van een beginindex tot het einde, of vanaf een gedefinieerd einde tot het begin
        String pianoLes = "pianoles";
        String sub = pianoLes.substring(5);// print les, neemt de beginindex ook mee
        System.out.println(sub);
        System.out.println(pianoLes.substring(0, 5)); // print piano, de laatste wordt juist niet meegenomen
        // het karakter aan het begin wordt dus wel meegenomen, en die aan het einde niet!!
        // trim() haalt alle spaties aan het begin en het einde weg
        String spaties = "       veel spaties     ";
        System.out.println(spaties.trim()); // print veel spaties zonder begin en eind spaties, de spatie in het midden blijft
        // de replce() method haalt alle instanties van een bepaald karakter eruit en vervangt ze voor een andere
        // je kan een char of een string doorgeven aan deze methode, maar niet allebei tegelijk
        // de methode verandert ook de waarde van het object niet,
        String woord = "goedemorgen";
        System.out.println(woord.replace('g', 'k')); // print koedemorken
        //System.out.println(woord.replace('g', "k"));// compileert niet
        System.out.println(woord);// het woord is neit aangepast en print goedemorgen
        // de length() methode kan de lengte van een String teruggeven
        System.out.println(woord.length()); // geeft 11 terug
        //startsWith() en endsWith() geven een true/ false terug wanneer je vraagt of een String begint of eindigt met een bepaalde karakter
        // je kan ook een positie opgeven om in te beginnen
        System.out.println(woord.startsWith("g"));// print true
        System.out.println(woord.endsWith("g")); // print false
        // alleen bij startswith kan je een positie opgeven, bij endsWith gaat het altijd vanaf het einde
        // je kan verschillende methoden van String in 1 line gebruiken, dit heet method chaining
        // de methodes wordwen van links naar rechts uitgevoerd
        String letters = "ABCAB";
        // System.out.println(letters.substring(0, 2).startsWith('A')); compileert niet want startsWith neemt geen char
        // String neemt de operators: +, += , ==, en !=
        // de compiler leest van links naar rechts, dus wanneer je bijv ook primitives gebruikt zal hij deze als zodanig behandelen als ze links staan
        // als ze rechts van de String staa nworden ze als String behandeld
        // of je moet er haakjes omheen zetten
        // wanneer je += gebruikt moet je ook opletten dat alles is geïnitieerd
        // om twee Strings te vergelijken moet je de equals methode gebruiken, het zijn immers objecten
        // deze methode wordt true als de waarde niet gelijk is aan null, het een String object is, en dezelfde sequence van karakters heeft
        //in het examen kan er gevraagd worden om Strings te vergelijken nadat een methode is toegepast, de methodes maken nieuwe objecten aan
        //dus == zal altijd false zijn omdat deze niet uit de Stringpool worden opgehaald maar twee verschillende objecten zijn


        // StringBuilder is een mutable class, objecten worden dus wel degelijk gemanipuleerd
        // een StringBuilder object heeft standaard 16 lengte
        // je kan dez veranderen door de constructor te vullen met een ander getal :
        StringBuilder build1 = new StringBuilder(20);
        // dit object heeft nu een capaciteit van 20
        // de append methode voegt waarden toe aan het bestaande object, achter de eventueel als bestaande waarde
        build1.append("stringbuilder ");
        build1.append(" is cool");
        System.out.println(build1);
        // naast een string waarde kan je ook booelan, int, char of double toevoegen zonder problemen
        build1.append(4829);
        System.out.println(build1);
        // ook kan je delen van een char array toevoegen
        char[] java = {'j', 'a', 'v', 'a'};
        build1.append(java, 1, 2); // voegt av toe
        System.out.println(build1);
        // append accepteert ook het object type
        // alleen je krijgt dan niet de value, maar het adres als default
        // je kan dit overriden
        // tenzij de parameter null is, dan wordt er niks teruggegeven
        StringBuilder build2 = new StringBuilder();
        build2.append("Henk");
        //build2.append(new Henk("gerrit"));
        System.out.println(build2);// geeft de leash terug van object Henk en niet de naam Gerrit
        // wanneer het object null is wordt er niet gecompileerd
        // insert() werkt soortgelijk alleen nu kan je de positie kiezen waar je de data wegzet (bij append komt die altijd aan het einde
        build2.insert(2, "John");
        System.out.println(build2);// gooit de naam John op index twee
        // je kan er ook een hele of delen van een char array ingooien
        // build2.insert (positie waar de insert moet beginnen in het oude object ,welk object geplaatst moet worden, van waar tot waar (welk deel) van het object geplaatst moet worden
        // delete haalt karakters uit je string
        //build2.delete(van waar tot waar moet er gedelete worden);
        // het laatste karakter wordt niet meegenomen!
        //deleteCharAt is ook een optie, deze delete het karakter op een bepaalde index
        // trim bestaat niet bij een StringBuilder
        // reverse draait de volgorde om
        build2.reverse();
        System.out.println(build2);
        // je kan geen substring reversen! ALLEEN HET HELE DING!
        //replace vervangt de waarden op bepaalde index voorgoed.
        // de methode werkt anders dan bij de string: ipv de karakters die je wil vervangen en welke karakters in de plaats moeten komen
        // geeft je de index op en hetgeen wat je daar wil neerzetten
        //subSequence gwerkt als substring en past de waarde va nde StringBuilder niet aan!

        // arrays
        // arrays zijn objecten die waarden kunnen opslaan
        //arrays kunnen een rij primitives opslaan, het slaat dan de waarde op
        //arrays kunnen een rij objecten opslaan, het slaat dan de reference op

        // een array declaratie heeft een type en variabele
        int[] anArray;
        // ik declareer hier de array, hij bestaat nog niet als object!
        // een array van Strings kan ook
        String[] anArray1;
        // je kan ook een array declareren die bestaat uit meerdere arrays (multidimensionaal
        int[] multiArray[];
        // je kan aan het aantal [] zien hoeveel dimensies een array heeft, je mag zelf weten waar je deze neer zet
        // int [] [] multiArray is goed
        // int multiArray [][] is ook goed\
        // je kan bij de declaratie nog niet aangeven hoeveel elementen er  in een array zitten
        // wanneer je gaat alloceren moet je wel de lengte va nde array aangeven, anders zal de code niet compileren
        anArray = new int[4];
        // code compileer ook niet als je de [4] aan de andere kant van de = zet
        // je mag wel formules neerzetten alszijnde de lengte va neen array als het maar gelijk is aan een int wanneer je een int arat hebt gedeclareerd

        // bij multiarrays mag je ook alleen de eerste lengte declareren
        multiArray = new int[5][];
        // je mag niet maar 1 [] wegzetten of alleen de achterste invullen
        // default waarde voor object array is null, voor primitive array 0, false, 0.0 of \u0000
        // je kan een gehele array initialiseren met een loop, of losse elementen initialiseren
        for (int i = 0; i < anArray.length; i++) {
            anArray[i] = i + 5;
            // deze loop vult de waardes in door steeds vijf toe te voegen per keer dat er geloopt wordt
            System.out.println(anArray);
        }
        String[] stringArray;
        stringArray = new String[4];
        for (int i = 0; i < stringArray.length; i++) {
            stringArray[i] = new String("Hello " + 1);

            System.out.println(stringArray);// print de locatie  van de objecten in de  string array
        }
        // wanneer je een index probeert te benaderen die niet bestaat krijg je een outofbounds error
        //runtime exception
        // als je 1 index de waarde null meegeeft wordt deze waarde geprint
        String seizoenen[] = new String[]{"Herfst", "Winter", "Zomer", "Lente"};
        seizoenen[2] = null;
        for (String val : seizoenen)
            System.out.println(val);

        //als je alle stappen: declaratie, initialisatie en allocatie in 1 regel zet mag je niet de lengte va nde array aangeven, deze wordt uitgerekend door de waarden die je eraan geeft
        // je mag maar hoeft geen new te gebruiken
        // wanneer je verschillende regels code gebruiikt moet je new gebruikern om de waarden te initialiseren

        // om een arraylist te maken moet je deze importeren, staat niet standaard in je class
        // declareren:
        ArrayList<String> eenArrayList = new ArrayList<String>();
        // mag ook zo:
        ArrayList<String> dezeArrayList = new ArrayList<>();
        // wanneer je geen argumenten in de constructor zet, wordt een no-argument constructor aangeroepen door java
        // je kan er op de volgende manier dingen instoppen:
        eenArrayList.add("het eerste ding");
        eenArrayList.add("het tweede ding");
        // wanneer je iets op een sepcifieke positie wil zetten:
        eenArrayList.add(4, "het vijfde ding");
        //alles rechts ervan verschuift dan een plek naar rechts
        // als jer er  niks bijzet wordt het achter het volgende gezet
        // hoe ku nje erbij? met een enhanced for loop, de get() methode, en de Iterator of ListIterator
        // je kan ook waarden aanpassen met de setr methode
        eenArrayList.set(1, "het achtste ding");
        // ook kan je verwijderen
        eenArrayList.remove(1); // verwijdert object op eerste index
        eenArrayList.remove("het tweede ding"); // verwijdert dit object als het bestaat
        // je kan alle elementen uit een ArrayList verwijderen met clear
        // ee narraylist kan ook de methoden hebbe: get(int index), size() indexOf(Object O) lastIndexOf(object o) contains (object o)


    }

    class Henk {
        String naam;

        Henk(String str) {
            naam = str;
        }


    }
}
