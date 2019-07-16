package nl.qien.masterclass.LibraryQien.inheritance;

public class SpelenMetVoertuigen {
    public static void main(String[] args) {

        Auto auto = new Auto();
        Vrachtwagen vrachtwagen = new Vrachtwagen();
        Fiets fiets = new Fiets();
        Step step = new Step();

        Voertuig auto2 = new Auto();
        MotorischVoertuig vrachtwagen2 = new Vrachtwagen();
        //MotorischVoertuig motor = auto2; // dit mag zo niet omdat een voertuig groter is dan een auto

        Voertuig fiets2 = new Fiets();
        NietMotorischVoertuig step2 = new Step();

        auto.rijden();
        auto2.rijden(); // polymorphisme want het is een niet static method

        auto.tanken();
        // auto2 kan tanken doordat de methode abstract is gemaakt en ingevuld wordt door de methode van de child.
        vrachtwagen2.tanken();
        // de vrachtwagen heeft nu de tankinhoud van 60 liter omdat deze geen vrachtwagen is, maar de methode is abstract dus implementeert hij deze van de child

        System.out.println( vrachtwagen2.tankinhoud); // deze is dus nog wel 60, met casten kan hij 100 worden

        vrachtwagen2.rijden();
        System.out.println(((Vrachtwagen)vrachtwagen2).aantalWielen);// aantal wielen klopt nu niet, deze pakt hij van het algemene voertuig
        //met casten krijg je wel het juiste aantal
        System.out.println(vrachtwagen.aantalWielen); // deze klopt wel, want deze vrachtwagen is een vrachtwagen

        System.out.println(step2.aantalWielen);// pakt de default van voertuig, en dat is twee, voor niet motorisch is geen apart aantal ingesteld gezien zij altijd twee hebben
        System.out.println(step.aantalWielen);

        System.out.println(auto.aantalWielen);
        System.out.println(((Auto)auto2).aantalWielen); // er is nu geen standaard gedefinieerd, voertuig heeft geen standaard aantal wielen.
        // dus voor een waarde moet je casten!

        fiets.rijden();
        fiets2.rijden(); // polymorphisme

    }
}

abstract class Voertuig {



    public void rijden() {
        System.out.println("Lekker algemeen aan het rijden.");
    }
}

abstract class MotorischVoertuig extends Voertuig {

    public int tankinhoud = 60;

    abstract public void tanken();// dit maakt dat alle objecten die deze class als super hebben een methode tanken moeten hebben, maar dat er geen default waarde is


}

abstract class NietMotorischVoertuig extends Voertuig {
    int aantalWielen = 2;
}


class Fiets extends NietMotorischVoertuig {
    @Override
    public void rijden() {
        System.out.println("Lekker fietsen.");
    }
}

class Step extends NietMotorischVoertuig {

    @Override
    public void rijden() {
        System.out.println("Lekker steppen.");
    }
}

class Auto extends MotorischVoertuig {
    int aantalWielen = 4;
    int tankinhoud = 60;

    @Override
    public void rijden() {
        System.out.println("Lekker aan het rijden in een auto.");
    }

    public void tanken() {
        System.out.println("Met dit voertuig kun je tanken. De inhoud van de tank is " + tankinhoud);

    }
}

class Vrachtwagen extends MotorischVoertuig {
    public int tankinhoud = 100;
    int aantalWielen = 8;

    @Override
    public void rijden() {
        System.out.println("Lekker rijden in een vrachtwagen.");
    }

    public void tanken() {
        System.out.println("Met dit voertuig kun je tanken. De inhoud van de tank is " + tankinhoud);

    }
}



