package nl.qien.masterclass;

import java.util.ArrayList;

public class ArrayListDemo {

        public static void main(String[] args) {
            ArrayList<Persoon> namen = new ArrayList<>();
            namen.add(new Persoon("Robin"));  // Deze komt automatisch op plek 0
            namen.add(new Persoon("Ben"));
            namen.add(new Persoon("Bart"));
            namen.add(new Persoon("Kalim"));
            namen.add(new Persoon("Dwight"));
            namen.add(new Persoon("Maartje"));
            namen.add(new Persoon("Reinoud"));
            System.out.println("namen = " + namen);
            System.out.println(namen.getClass());
            System.out.println(namen.clone().getClass());

           ArrayList<Persoon> gekopieerdeLijst =(ArrayList<Persoon>) namen.clone ();
           // dit levert een shallow copy op
            System.out.println(namen == gekopieerdeLijst);
            // dit levert dus een false op
            // de arraylist wordt gekopieerd maar de objecten die erin zitten worden niet gekopieerd.  Daarom is het niet gelijk
            // de leash naar de objecten is hetzelfde, de objecten in de list izjn dus hetzelfde
            // als je er 1 aanpast in de ene past het automatisch ook de andere aan!!!
            // de lijst zelf is dus wel een nieuwe lijst
            // als je nu een object verandert in de lijst personen, verandert deze neit in de gekopieerde lijst omdat de kopie eerst is gemaakt
            // de kopie blijft dan naar de originele verwijzen.
            //try it here:
           //  namen[0] = new nl.qien.masterclass.Persoon ("Bert");

        }
    }

    class Persoon {
        String naam;

        public Persoon(String naam) {
            this.naam = naam;
        }
    }


