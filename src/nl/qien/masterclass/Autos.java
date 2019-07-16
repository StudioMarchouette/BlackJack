package nl.qien.masterclass;

public class Autos {
    public static void main(String[] args) {
        Auto mercedes = new Auto("Mercedes", 120, "Blauw");
        Auto volkswagen = new Auto(); // dit object krijgt nu dus de constructor mee met de standaard waarden!
        mercedes.vermogen = 120;
        mercedes.setKleur("Groen");
        System.out.println("De kleur van mijn auto is "+ mercedes.getKleur());
        mercedes.toonGegevensAuto();
        volkswagen.toonGegevensAuto(); // deze hoeft niet static, omdat hij op de instance terugslaat
        Auto.toonDataAuto (volkswagen); // deze methode is statisch, anders compileert het niet in deze class. HIj verwijst namelijk naar de class zelf

        Auto [] mijnAutos = new Auto [4]; // dit is een array van de auto's
        mijnAutos [0] = mercedes;
        mijnAutos [1] = volkswagen;
        // een andere optie om een array te maken, als je nog niet vantevoren weet hoeveel erin moeten:

        Auto[] mijnAutosAlternatief = { mercedes, volkswagen, null, null };
        // bij declaratie en initialisatie in 1 regel hoeft de new nl.qien.masterclass.Auto niet perse
        // een arraylist is flexibeler dan een array. Een arraylist kan je vullen zonder dat je eerst aangeeft hoeveel waarden erin moeten


        for ( int i = 0; i < mijnAutos.length; i++){
            System.out.println(mijnAutos[i]);// print de adressen uit van de auto's in de array.
        }


    }
}

class Auto {
    public int vermogen;
    private String kleur;
    public String merk;

    public void setKleur(String kleur){
        this.kleur = kleur;

    }

    public Auto ( String merk, int vermogen, String kleur ){
        this.merk = merk;
        this.vermogen = vermogen;
        setKleur(kleur);

    }

    public Auto () {
        this( "Daihatsu", 120, "Roze");
        // dit mag dus ook als constructor. Je maakt dan een standaard aan.
    }

    public String getKleur (){

        return kleur; // je mag hier ook this wegzetten voor kleur : this.kleur, maar dat hoeft in dit geval niet

    }
    public void toonGegevensAuto (){
        System.out.println("Mijn auto: "+ merk+ " "+ vermogen + " "+ kleur );
    }

    public static void toonDataAuto (Auto auto){
        System.out.println("Mijn auto heeft de volgende eigenschappen: ");

    }
}
