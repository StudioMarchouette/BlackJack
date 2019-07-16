package nl.qien.masterclass;

public class SpelenMetHoofdstukTwee {
    public static void main(String[] args) {
        int baseDecimal = 267; // print 267
        int octVal = 0413 ;// print 267
        int hexVal = 0x10B; // print 267
        int binVal = 0b100001011;// print 267
        System.out.println(baseDecimal + octVal);
        System.out.println(hexVal + binVal );
        // primnt beiden 267+ 267 = 534

        float fl1 = 579457.49702F;// bij een float zet je er een F achter, default is double
        double doub1 = 32570754.34097075D; // je mag er bij double een d achter zetten maar hoeft niet

        char blue = 4893;
        System.out.println(blue);;
        char c2 = '\u0122';
        char c3= 122;
        System.out.println("c3 = " + c3);
        System.out.println("c2 = " + c2); // unicode karakters zijn niet hetzelfde als de int karakters
        //unicode karakters moeten tussen enkele haakjes
        // char c4 = -89; compileer niet, alleen positieve nummers, kan wel als je cast
        char c4 = (char) -122;
        System.out.println("c4 = " + c4);
        int i3 = 'a';// je mag dus ook een char toewijze naan een int, er komt dan wel een vreemd iets uit
        System.out.println("i3 = " + i3);// je mag compatibele datatypes casten
        // de uitkomst is alleen soms vet weird
    // wanneer je een groter type in een kleinere primitive cast doet ie het wel, maar het kan zijn dat er wat wordt geknipt aan de waarde
        // reference variables zijn hetzelfde als object reference variables en object references
        //de variabele naam verwijst naar het adres in het geheugen van java waar het object zich bevind
        // wannneer je een nieuw object aanmaakt wordt het adres in het geheugen teruggegeven en aan de referentie variabele gehangen
        // je mag bij assignen best veel maar je kan gen
        // boolean waarde toewijzen aan een integer of floating point
        //int int2= false;

        // boolean waarde toewijzen aan een char
        //char cha = false;
        // je kan gee ngrotere nummers toewijzen aan kleinere range primitives
        long num = 480872469836L;
        //int v = num;
        // dit kan alleen bij expliciet casten:
        // dit ka nwel tot onverwachte resultaten leiden! omdat de compiler kan kiezen stukken eraf te halen
        // een kleinere kan altijd in een grotere
        int v= (int) num;
        // bolvenstaand cast de long naar een int en dan mag het dus wel
        System.out.println(num);
        // wanneer je meerdere primitives op 1 rij inittialiseerd begint de compiler rechts
        int a =4, b = 6, c = 7;
        a=b=c;
        System.out.println(a);
        // a is hier dus 7, de compiler wijst eerst c toe aan b, dan b aa na
        int f = a ++;// dit mag wel, maar je mad niet letterlijk 4 wegzetten, dan com0ileer de code niet
        // je mag wel gewoon rekenen met char karakters, allee nde uitkomst is soms onduidelijk
        char r = 10;
        char bb= 67;
        char cc= 'a';
        int rr = r+ bb; // 77
        //dit mag dus de vraag is wat hieruiktomt
        System.out.println(rr);
        int tt= cc+ bb; //164
        // mag dus ook gewoon
        System.out.println(tt);
        // wannneer je gaat rekenen met primitives worden de kleine types automatisch een int
        // dus wanneer je de som van twee byte types toewijst aan een short zonder casten werkt het niet, want eeen short past niet in een int
        // wanneer er een long instaat, wordt alles geconvert naar een long
        // bij float en double een double
        byte leeftijd1= 56;
        byte leeftijd2 = 34;
        short opgeteld = (short)(leeftijd1 + leeftijd2); // zo mag het wel
        // tweede optie is om er final variablen van te maken
        final byte leeftijd3= 45;
        final byte leeftijd4 = 23;
        short resultaat = leeftijd3+ leeftijd4; // dit mag dus wel
        //++ en -- betekenen in principe hetzelfde
        // maar in een expressie is de plaatsing belangrijk voor het resultaat
        // relationele operators werken met alle nummers,
        //maar je kan geen appels met peren vergelijken
        System.out.println(leeftijd3 > leeftijd4);// het antwoord is een boolean, je kan het antwoord dus niet aan een int of iets toewijzen
        System.out.println(leeftijd1 > cc);// byte en ee nchar kunnen vergeleken worden
        // dit kan dus niet : int true = leeftijd3> leeftijd4;
        // gebruikv oor vergelijken altijd een ==, een = is assignment
        // bij een || && wordt de tweede statement niet geevalueerd als de eerst het antwoord al weggeeft, een ++ wordt dan ook niet gedaan, de compiler kijk niet naar de code
        int marks = 8;
        int total = 10;
        System.out.println(total< marks && ++ marks > 5); // false, kijkt niet naar de tweede
        System.out.println(marks); // hier is marks 8
        System.out.println(total > marks && ++ marks > 5); // true, kijkt naar beide
        System.out.println(marks); // heir is marks 9

// wrappers classes
        // wrappers classes zijn immutable
        // je kan objecten creëren door autoboxing, constructor, en statis methods
        // wrapper classes hebben gee ndefault constructor, want ze zijn immutable, dus een default waarde geven heeft geen zin want die kan je niet aanpassen


        boolean buy = true;
        boolean sell = true;
        System.out.println(buy==sell);// deze is true omdat literal values vergeleken worden

        Boolean buy1= true;
        Boolean sell1= true;
        System.out.println(buy1 == sell1); // deze is true ivm cache

        Boolean buy2= new Boolean (true);
        Boolean buy3 = new Boolean (true);
        System.out.println(buy2== buy3);


        String cijfer = "10";
        int aantal_Goed = 10;

        if ((aantal_Goed = aantal_Goed+ 0)== 10)
            cijfer = "10";
        else if (( aantal_Goed = aantal_Goed + 100) == 10)
            cijfer = "100";
        else if ((aantal_Goed== 10));
        cijfer = "500";
        System.out.println(cijfer);

    }
}
