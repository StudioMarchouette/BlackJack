package nl.qien.masterclass.LibraryQien.inheritance;

public class SpelenMetDieren2 {

    public static void main(String[] args) {

        Poes poespoes = new Poes ();
        Dier2 dierpoes = new Poes ();
        Object objectPoes = new Poes();
        Object objectje = new Object();
        Dier2 sssslang = new Snake() ;
        Snake sslang = new Snake ();

        poespoes.slapen();
        dierpoes.slapen();
        ((Poes)objectPoes).slapen();
        ((Dier2)objectPoes).slapen(); // omdat dit een statische methode is, is het gedrag anders.
        // je benadert een static member met een instance variabele, dat loopt niet chill
        // en je maakt dus een kat die zich door de statische methode gedraagt als dier ipv kat
        // terwijl je eigenlijk verwacht dat de dier kat zich wel gedraagt als kat en niet als dier
        // het is dus bij deze situatie afhankelijk van het type welke methode wordt aangeroepen
        // er is dan geen sprake van polymorphisme!!!!
        sssslang.slapen();
        sslang.slapen();
        // dit kan, ook al heeft slang de methode niet. Hij pakt de static methode van dier omdat slang een kind is van dier.
        // dit werkt dus heel anders! dan bij geen statische methode

        // bij niet statische methode kijkt de compiler aan de linkerkant of hij erbij kan, en dan rechts naar welk gedrag hij moet uitvoeren
        // bij statische methode wordt gekeken en bepaald door de linkerkant van het object, dus het type



    }
}

abstract class Dier2 extends Object {

    public static void slapen() {
        System.out.println("Het dier slaapt - static");
        // stel je maakt deze niet static, de code compileert dan niet
        // methodes met dezelfde naam moeten allemaal wel of niet static zijn binnen erfrelaties
        // je kan dus ook niet alleen poes.slapen static maken en de rest niet
        // overriden kan NIET bij statische methodes!!

    }
}
class Poes extends Dier2 {
    public static void slapen (){
        System.out.println("Het dier Poes slaapt- static");
    }
}

class Snake extends Dier2 {
//    public static void slapen(){
//        System.out.println("Het dier snake kan ook slapen - static");
//    }
}
