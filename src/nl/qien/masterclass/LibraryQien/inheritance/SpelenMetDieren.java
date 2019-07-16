package nl.qien.masterclass.LibraryQien.inheritance;

public class SpelenMetDieren {
    // een dier is een groot begrip, voortbewegen kan bijv. een slang op een andere manier dan een kat.
    // java heeft een manier om dit op te lossen: namelijk met inheritance: je maakt een sub class aan
    public static void main(String[] args) {
//        Dier dier = new Dier();
//        Dier kat = new Dier();
//        Dier slang = new Dier(); ( deze zijn uitgecomment i.v.m. abstract class dier, als een class abstract is kan je geen objecten meer aanmaken


//        slang.voortbewegen();// deze slang is een dier, dus deze heeft de methode van dier
//
        Kat katkat = new Kat();
        Dier dierkat = new Kat();
        Object objectkat = new Kat();

        katkat.voortbewegen();
        dierkat.voortbewegen();
        // ook al is iets van het type dier, bij een niet statische member zal de compiler kijken naar wat er werkelijk in de doos zit
        // en dat is dus een kat,
        // compiler kijkt eerst of het type dier het gedrag heeft, en dan pas wat er in zit. uiteindelijk komt het gedrag van de kat dus
        // dit heet polymorphisme: compiler kijkt eerst aan de linkerkant of de methode benaderbaar is, maar in runtime wordt de
        // methode van kat gekozen: dynamic binding
        // dit is dus vreemd gedrag, magical.
        // geldt alleen bij niet statische methodes dus,

        //objectkat.voortbewegen();
        // objectkat is van het type object, en niet van het type kat.
        // de class object heeft geen voortbewegen gedefinieerd. dus dit werkt niet op deze manier
        // hoe werkt dit dan??
        ((Kat) objectkat).voortbewegen(); // je mag dit dus wel casten, maar wel specifiek aangeven dat je dus het object wil casten
        // dus haakjes eromheen zetten!
        // de compiler checkt de relatie, maar niet of er echt een kat in de doos zit. Dat is de verantwoordelijkheid van de progrmmeur
        //((Slang)objectkat).voortbewegen();
        // compiler vindt dit prima want in theorie zou er een slang in de doos kunnen zitten, alleen krijg je ene runtime error
        //class nl.qien.masterclass.LibraryQien.inheritance.Kat cannot be cast to class nl.qien.masterclass.LibraryQien.inheritance.Slang

        // dit mag, zolang links qua verzameling groter is dan rechts
        // andersom mag dit niet
        // Kat = new Dier mag dus niet!, want een dier is niet altijd een kat, en als je een dier aanmaakt hoeft dat geen kat te zijn
        // links staat de class waar je in bezig bent of de parent!
        // dit soort vragen kunnen in een zekere abstractie ook op het examen komen A a = new B();

        // ook de class object mag je instantieren:

        Object object = new Object();
        // de praktische waarde is niet heel hoog, maar het zou wel op het examen kunnen staan
        System.out.println(katkat.getClass());
        System.out.println(katkat.getClass().getSimpleName());
        if (dierkat instanceof Dier) {
            System.out.println("Een kat is een dier."); // print wel want een kat is van type dier
        }
        if (dierkat instanceof Slang) {
            System.out.println("een kat is een slang"); // print dus niet want een kat valt extends slang niet
        }
        if (katkat instanceof Dier) {
            System.out.println("Deze type kat extends dier");// kat extends dier, dus kat is ook dier.// je kan dit gebruiken om te zien of je kan casten naar een dier
            // variabelen worden dus weggeduwd maar niet statische methodes hebben polymorphisme, verandert dus automatisch!, alle andere dingen niet!
            //wanneer je bij niet statische methodes het kind ander gedrag geeft, dan verandert het gedrag, anders niet

        }
        // een dier heeft nu statisch 2 poten en een kat heeft er 4, hoe zit dit nu als we dit gana checken bij de kat:
        System.out.println("De poten van een dier en een kat, dier heeft standaard 2, kat heeft er 4");
        System.out.println(dierkat.aantalPoten); // hier komt twee uit
        System.out.println(((Kat) dierkat).aantalPoten); // casten naar kat, komt vier uit
        System.out.println(katkat.aantalPoten);// kat dus vier
        System.out.println(((Dier) katkat).aantalPoten);// gecast naar dier geeft 2
// je kan een object altijd casten binnen een familie relatie, maar het type object verander je daari n principe niet mee!
        // je krijgt dan ook runtime errors als behavior of stat niet overenekomt met wat er is gedefinieerd in het type object.
        // een dier is geen kat dus dat gaat niet met casten, maar een kat is wel een dier, dus dat kun je wel casten,
        //  je verandert het type kat object niet in een dier, maar een kat heeft dier gedrag in zich

        System.out.println("De kleur van een kat of van een dier?");
        System.out.println(dierkat.kleur); // er komt grijs uit, polyporhpisme geldt alleen voor methodes
        // de kat heeft als kat een kleur maar ook als dier
        System.out.println(katkat.kleur);// er komt oranje uit
        // bij instantie variabelen geldt net als bij static variabelen dat gekeken wordt naar het type van het object
        // dus de kat die hier het type dier heeft, krijgt de kleur grijs

        Kat garfield = new Kat();
        Dier garfieldDier = new Kat();
        System.out.println();
        garfieldDier.voortbewegen();
        garfield.voortbewegen(); // zie de methodes voor wat erin staat , het betreft geen static methode dus polymorphism

    }
}

abstract class Dier { // indirect is elke class een kind van object, het staat er niet achter maar de default bij een class is class Dier extends Object
    // object is de moeder van alle classes
    // classes erven dan ook alle niet static members en methoden van de moederclass
    // daarom kunnen alle objecten ook met equals() werken, dit is een methode van moederclass object
    // als je niet wil dat er objecten worden aangemaakt van de class Dier, dan kan je de class abstract maken
    // je kan geen objecten aanmaken van abstracte classes

    public void voortbewegen() {
        System.out.println("Een dier kan zich voortbewegen en zijn kleur is " + kleur);
    }

    public static int aantalPoten = 2;
    public String kleur = "Grijs";


    // dit concept is belangrijk in java, het kan veel voorkomen in de praktijk
    // voorbeelden: een kermis met attracties, elke attractie kan aan en uit, elke attractie beweegt, maar ze doen dit allemaal anders
    // snacks zijn allemaal snacks, je kan ze eten, maar de bereidingswijze en ingredienten zijn allemaal anders
    // je hebt altijd maar 1 parent, maar je mag bijv. kat die dier extends ook weer abstract maken, bijv. britse korthaar, pers etc.
    // alleen zodra je een class abstract maakt, compileren gemaakte objecten van die class niet meer
    // het tegenovergestelde van abstract is final
    // wanneer e een class final hebt gemaakt mag je er geen nieuwe classes meer onder hangen
    //mensen kunnen dan dus geen class eronder hangen en moeten de bestaande class gaan gebruiken


}

class Kat extends Dier {
    @Override
    public void voortbewegen() {
        System.out.println("Een kat kan zich voortbewegen door rennen en al en zijn kleur is " + kleur);
        System.out.println("Een kat weet ook de kleur van een dier " + super.kleur);
        // ook kan je het gedrag dat je override van de super class aanspreken in deze class
        super.voortbewegen();

    }

    static int aantalPoten = 4;
    // deze variabele heeft een andere zichtbaarheid dan die van de Dier class, dit hoeft niet gelijk te zijn bij static variabelen
    // bij methodes moet dit wel! De zichtbaarheid moet gelijk of groter zijn bij de child/sub.
    String kleur = "Oranje"; // bij niet static variabelen hoeft de zichtbaarheid ook niet gelijk te zijn
}

class Slang extends Dier {
    @Override   // dit zet je erbij als je een gedrag van een superclass overschrijft door een subclass
    // het is voor de duidelijkheid dat je dit erbij zet
    // je mag per methode bepalen of je wil overriden, als je een methode met dezelfde naam opzet in de subclass
    // vervalt de methode van de parent: @Override
    // daarnaast geeft de @Override ook aan dat het een geldige override methode is
    public void voortbewegen() {
        System.out.println("Een slang kronkelt een beetje door het gras");
    }

}

