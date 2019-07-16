package nl.qien.masterclass.LibraryQien.inheritance;

import java.util.ArrayList;
import java.util.List;

public class SpelenMetSnacks {
    public static void main(String[] args) {

        Snack kroketje = new Kroket();
        Kroket kaasKroket = new Kroket();
        Snack sateKroket = new Kroket();
        Object groenteKroket = new Kroket();
        List<Snack> mijnBestelling = new ArrayList<>();

        mijnBestelling.add(kroketje);
        mijnBestelling.add(kaasKroket);

        for (Snack snack : mijnBestelling){
            snack.frituren();
            // for each loop laat je over de lijst gaan en iedere snack die ering staat wordt gefrituurd

        }

//
//        kroketje.frituren();
//        kaasKroket.frituren();
//        sateKroket.frituren();
//        ((Kroket)groenteKroket).frituren();

       Snack falafel = new Falafel();
        Falafel falafeltje = new Falafel ();
        //falafel.frituren();
        falafeltje.frituren();



    }
}

abstract class Snack{
public  void frituren () {
        System.out.println("Een snack moet 5 minuten in de frituur.");
    }
    abstract public void opeten (); // een abstracte methode heeft geen body
    // een abstracte methode moet in de childs staan!  compileert ook niet als de kinderen de methode zelf niet hebben
    // er wordt geen default gedrag geinitialiseerd
}

class Kroket extends Snack {
   // @Override
    public  void frituren(){
        System.out.println("Een kroket moet je uit de frituur halen voordat hij ontploft: 5,5 minuut op 180 graden");
    }
    public void opeten(){
        System.out.println("Kroket eet je los of op een broodje ");
    }
}

class Falafel extends Snack{
  //  @Override
    public  void frituren () {
        System.out.println("Falafel moet je 3 minuten frituren.");
    }
    public void opeten () {
        System.out.println("Falafel lekker op een broodje met sla en saus");
    }
}

class Kipnugget extends Snack {
    @Override
    public void frituren(){
        System.out.println("Kipnuggets moet je frituren tot ze krokant zijn.");
    }
    public void opeten() {
        System.out.println("Kipnuggets eet je met een sausje uit de hand ");
    }
}

