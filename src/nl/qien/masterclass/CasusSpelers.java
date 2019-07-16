package nl.qien.masterclass;

public class CasusSpelers {
    public static void main(String[] args) {
// dit is de main
        speler Speler1 = new speler();
        speler Speler2 = new speler();
        Speler1.naam = "Karel";
        Speler2.naam = "Kees";

        Speler1.team = "Team 1";
        Speler2.team = "Team 2";


        Speler1.toonSpeler();
        Speler2.toonSpeler();

        Speler1.toonTeam();
        Speler2.toonTeam();

        Speler1.veranderTeam("Team 5");
        Speler2.veranderTeam("Team 9");

        Speler1.veranderNaam("Henk");
        Speler2.veranderNaam("Jos");

        Speler2.lokaleNaam();

        Speler1.setNaam("John");
        Speler2.setNaam("Johan");

    }
}

class speler { // dit is een aparte class voor de nl.qien.masterclass.speler en bevat de blauwdruk voor de spelers
    public String team; // variabelen zijn niet statisch, zodat de spelers niet in hetzelfde team zitten. Er wordt bijna nooit gebruik gemaakt van echte statische variabelen
    public String naam;

    public void toonTeam() {
        System.out.println("Speler zit in team " + team);
    }

    public void toonSpeler() {
        System.out.println("Speler heet " + naam);

    }


    public void veranderNaam(String nieuweNaam) { // methode om naam te veranderen, mag niet static omdat de variabele Naam niet static is
        naam = nieuweNaam;
        System.out.println("De nieuwe naam van de nl.qien.masterclass.speler is " + nieuweNaam);
    }

    public void veranderTeam(String nieuwTeam) { // methode om team te veranderen
        team = nieuwTeam;
        System.out.println("De nl.qien.masterclass.speler zit nu in team " + nieuwTeam);

    }
    public void lokaleNaam () {
        String team = "Team blauw";
        System.out.println("Het team is nu "+ team); // er wordt nu gebruik gemaakt van de lokale variabele, maar alleen in deze methode!
    }

    public void setNaam (String naam) { // deze methode mag niet static worden
        this.naam = naam;
        System.out.println("De naam is nu "+ naam);

    }
}

