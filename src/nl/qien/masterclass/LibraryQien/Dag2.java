package nl.qien.masterclass.LibraryQien;

public class Dag2 {
    public static void main(String[] args) {


        Byte b = 5; // de int waarde 5 wordt automatisch ingepakt  (autoboxing) als een Byte instantie
        // de variabele is van het type Byte, niet man de primitive byte
        // de compiler herkent ook weer de byte range en de waarde moet hierbinnen vallen
        Short s = 12;
        Integer i = 100;
        Long l = 12L; // wanneer je een Long wil assignmen moet een Long waarde opgegeven worden
        // dat werkt dus anders dan bij de primitive, daarbij hoeft dit niet!
        long l2 = 62;
        Float f = 12f; // ook bij een Float class moet er een F bij
        // bij de primitive gehele getallen hoeft dit niet, bij de decimalen wel
        // Double d = 12; een int waarde mag niet direct geassignt in een Double, een Float ook niet, dit werkt dus niet
        Double d = 12d;
        d = 12.5; // dit is automatisch een dubbel en mag wel, float mag niet. Bij de primitives mag dit wel

        Character c = 12; // geeft de ascii waarde
        c = 'f'; // Character mag met int zowel als char waarde

        Boolean bool;
        //System.out.println("bool = " + bool);// werkt niet want nog niet geÏntitialiseerd
        bool = false;
        // daarnaast heeft de Boolean class een eigen constante
        bool = Boolean.FALSE;
        System.out.println("bool = " + bool);

        Byte b1 = 127;
        b1 = b1++; // dit compileert, b1 = b1+ 1 mag niet, maar gebruik dit niet want de +1 wordt niet opgeslagen
        // definitie dus niet ervoor zetten!!
        // wat wel kan:
        b1++; // dit werkt wel en mag wel gebruikt worden!
        System.out.println("b1 is " + b1); // waarom komt hier 127 uit? variabele is immutable dus waarde verandert niet
        b1 = ++b1;
        System.out.println(b1);// dit rekent hij wel uit

        // verschil tussen ++b1 en b1++
        b1 = 12;
        System.out.println("b1 = " + b1);
        ++b1; // b1 = b1 + 1
        System.out.println("b1 = " + b1);
        b1 = b1++; // b1 = b1;  + 1, de waarde van de b1 + 1 wordt niet opgeslagen
        // zie aantekeningen van Cor voor meer info.

        // hoe zit dat met een constructor:
        // je mag geen constructor zonder argumenten gebruiken

        // Byte b2 = new Byte (byte)5;
        // we casten een 5 integer naar een byte en gebruiken deze byte om een nieuwe byte te maken
        byte bPrimitive = 5;
        Byte b4 = new Byte(bPrimitive);
        // b4 = bPrimitive mag ook
        b4 = new Byte("5");  // mag ook
        // je mag er ook tekst in zetten maar dat levert een NumberFormatException op!! Omdat de String niet omgezet kan worden naar een numerieke waarde
        // wrapper classes hebben geen intelligentie ingebouwd over _, deze kan je dus niet gebruiken
        // een waarde buiten de range levert een value out of range exception op

        // Double d = new Double ("12");
        // dit compileert ook zonder de d erachter te zetten
        // als je er wel een d achter zou zetten doet hij het ook, maar het hoeft dus niet persé
        // ook een F erachter compileert
        // wordt geparset naar andere waarde
        // dit kan bij een primitive dus niet!

        Boolean bool1 = new Boolean(false);
        // mag maar is langer dan nodig, daarom streept intelliJ dit door
        bool1 = new Boolean("false");
        // mag ook
        // zodra de input van de string niet gelijk is aan true wordt de boolean false! maar compileert dus wel
        bool1 = new Boolean("bluh");
        System.out.println(bool1);

        // Character char = new Character ("c"); // dit mag niet, een Character wrapper accepteert geen String waarden
        // compileert niet en je krijgt een compile error


// de derde optie is om een statische methode te gebruiken: parse Byte of value of

        Byte b8 = Byte.parseByte("78");
        b8 = Byte.valueOf((byte) 78);
        b8 = Byte.valueOf("78");
        // deze opties zijn alledrie geldig


    }
}