package nl.qien.masterclass.LibraryQien;

public class FlowControl {
    public static void main(String[] args) {
        // Opdracht: zet deze code om naar een ternary.
        int aantalBomen = 80;
        int oppervlakte = 300;
        String soortBos = "Geen Bos";
        if (aantalBomen > 20)
            if (aantalBomen > 100)
                if (oppervlakte > 100)
                    soortBos = "Groot Bos";

                else
                    soortBos = "Compact Bos";
            else
                soortBos = "Klein Bos";
        System.out.println("Buiten if statement!! " + soortBos);


        soortBos = (aantalBomen > 20) ?
                ((aantalBomen > 100) ?
                        ((oppervlakte > 100) ?
                                "Groot Bos"
                                : "Compact Bos")
                        : "Klein Bos")
                : "Geen Bos";
        System.out.println(soortBos);

        // de bovenste if heeft geen else, maar een ternary moet altijd een else hebben.
        // daarom is de variabele geen bos nog opgenomen in de ternary statement


// in een if -statement mag je de waarde van een primitive veranderen

        String cijfer = "10";
        int aantal_Goed = 10;

        if (aantal_Goed ==10)
            cijfer = "10";
        else if (( aantal_Goed = aantal_Goed + 100) == 10)
            cijfer = "100";
        else if ((aantal_Goed == 10))
            cijfer = "60";
      //  cijfer = "500"; // deze statement hoort niet bij het code block  van deelse if en is dus het antwoord
          System.out.println(cijfer);
// deze code mag dus wel maar is niet heel overzichtelijk: er staan geen braces in, er wordt dan maar 1 line van code gecompileerd
        int score = 100;
        if (score > 100)
            if (score< 400)
                if (score > 300)
        System.out.println(1);
                else
        System.out.println(2);
                else
        System.out.println(3);
// deze code print dus niks, want de eerste if is niet waar en er is geen else



    }
}

