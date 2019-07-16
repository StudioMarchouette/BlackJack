package nl.qien.masterclass.LibraryQien;

public class Demo {

    public static void main(String[] args) {
        Zeilboot optimist = new Zeilboot();
        optimist.lengte = 23;
        optimist.zeilOppervlak = 30;
        Boot deBoot = new Zeilboot(); // dit soort dingen zullen in de werkelijkheid niet vaak voorkomen
        Sail sail2019 = new Sail();
        sail2019.meevaren(optimist); // hier wordt het bootstuk van de zeilboot aangesproken, het argument moet co variant zijn.
        Bungalow lachendZonnetje = new Bungalow();
       //  sail2019.meevaren(lachendZonnetje); dit kan niet!
        sail2019.meevaren(new Zeilboot()); // er wordt een object geïnstantieerd maar er is geen leash naartoe, dus meteen eligible gc
        System.out.println(optimist.zeilOppervlak);

        Koopbaar k = new Bungalow();
        k.kopen();







    }
}

abstract class Boot{ // je kan geen object boot meer aanmaken, maar je kan het nog wel gebruiken als referentie type.
    int lengte;
    abstract void varen();
    // mag geen body
    // moet in een abstracte class
    // alle childs moeten de methode ook implementeren
}// als je een abstracte methode implementeert kan je op het niveau van boot de methode al aanspreken.
// je wil dat alle boten kunnen varen. dus daarom implenteer je een abstracte class

class Salesman {
    void inkopen(Koopbaar ko){
    ko.kopen(); // de salesman kan allerlei dingen kopen die koopbaar zijn
    }
}


class Zeilboot extends Boot implements Koopbaar{ // een class kan maar 1 andere class extenden: inheritance by state
    // je hebt ook inheritance by type: dit kan met interfaces. Je kan dan typen die een gemene deler hebben in een interface zetten
   int zeilOppervlak;
   void varen(){}
   public void kopen(){};



}

interface Koopbaar {
    void kopen(); // impliciet abstract en public
    // dus wanneer je Koopbaar implement moet ook de methode in de koopbare classes en deze moet public zijn
    // sinds java 8 mag je ook een default en een static methode aangeven:
    default void ruilen(){} // dit is geen default als acces modifier, maar default als implementatie van de methode
    // het vervangt eigenlijk het woord abstract (niet het woord public)
    // de verplichting om te overriden vervalt! De methode mag dus een body en deze wordt dan de default voor allem is A relaties.
    static void verwisselen(){}
    // dit mag dus
    // wanneer je dit implementeert in een hogere class als boot zijn impliciet alle kinderen  het ook

}

class Sail {
    void meevaren(Boot jouwBoot) {
        if (jouwBoot instanceof Zeilboot) { // dit zorgt ervoor dat een zeilboot alleen gecst wordt als het een instanceof zeilboot is. anders niet
            // dus een kano wordt niet gecast

            Zeilboot tijdelijk = (Zeilboot) jouwBoot;
            tijdelijk.zeilOppervlak = 22;// een andere optie is:
            ((Zeilboot) jouwBoot).zeilOppervlak = 33;// casten is beloven dat er een zeilboot in zit, maar als dit dan niet waar is werkt het progrmma niet meer


        }

    }
}
class Bungalow implements Koopbaar {
public void kopen (){}
}


