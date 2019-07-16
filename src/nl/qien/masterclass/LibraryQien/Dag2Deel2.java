package nl.qien.masterclass.LibraryQien;

public class Dag2Deel2 {
    public static void main(String[] args) {
        System.out.println("Ik kan de aantalPoten variabele ook hier oproepen: " + Tafel.aantalPoten);
        Tafel.aantalPoten = 4; // dit kan op deze manier
        Tafel kleineTafel = new Tafel();
        Tafel groteTafel = new Tafel();
        System.out.println("Aantal poten van de kleine tafel = " + kleineTafel.aantalPoten); // dit mag wel, een class variabele kan via een instantie variabele worden benaderd
        // kleineTafel is een instantie van nl.qien.masterclass.LibraryQien.Tafel. De eigenschappen van nl.qien.masterclass.LibraryQien.Tafel zijn aan kleineTafel gegeven.
        //aantalPoten is een static variabele van nl.qien.masterclass.LibraryQien.Tafel
        groteTafel.aantalPoten = 6;
        System.out.println("Poten kleine tafel na veranderen de grote tafel verandert ook! Namelijk: " + kleineTafel.aantalPoten);
        // dat komt omdat het veld statisch is!

        // nl.qien.masterclass.LibraryQien.Tafel.kleur kan hier niet benaderd worden. Omdat het een instance of object variabele is.
        // kan dus alleen via het object
        kleineTafel.kleur = "bruin";
        System.out.println("de kleine tafel is " + kleineTafel.kleur);
        System.out.println("de grote tafel is " + groteTafel.kleur);// de default van een string is null.
        groteTafel.schilderTafel ("blauw");
        kleineTafel.schilderTafel("groen");

    }
}

class Tafel {  // in de praktijk zul je nieuwe classen eerder in een ander bestand zetten. maar het mag wel in 1
    // deze class staat dan ook buiten de scope van de andere class
    public static int aantalPoten; // dit is een class variabele, deze variabele krijgt een standaard waarde mee
    // zowel class variabelen als instance variabelen krijgen een default waarde
    // een int heeft een default van 0
    // aantalPoten is een static variabele en verwijst elke keer naar dezelfde vier poten
    public String kleur; // deze variabele is niet statisch. In een statische methode kan je geen niet statische variabelen gebruiken
    // nl.qien.masterclass.LibraryQien.Tafel is een blauwdruk in een statische omgeving. als je een nieuwe tafel maakt maak je een object.

    public static void toonAantalPoten() {
        System.out.println("De tafel heeft: " + aantalPoten + " poten."); // binnen de class nl.qien.masterclass.LibraryQien.Tafel kun je de variabele aanroepen
    }

    public void schilderTafel(String nieuweKleur) { // method variabele
        // deze variabele is niet static, als je deze in een static omgeving zet zal deze niet compileren
        System.out.println("Welkom in de schilderfabriek");
        if (kleur != null) {
            System.out.println("Eerst schuren want de tafel had al een kleur namelijk " + kleur);
        }
        kleur = nieuweKleur;
        System.out.println("De nieuwe kleur van de tafel wordt " + nieuweKleur);

    }
    public void scopingMetShadowing() {
        System.out.println("dit stuk gebruikt de object variabele "+ kleur);
        {
            // accolades definieren een subblock
            String kleur = "groen";
            System.out.println("Hier is de kleur de lokale variabele " + kleur);
        } // wanneer de accolades eindigen, eindigt ook de scope

        }
    }







