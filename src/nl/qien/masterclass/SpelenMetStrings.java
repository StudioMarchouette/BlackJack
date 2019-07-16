package nl.qien.masterclass;

import java.sql.SQLOutput;

public class SpelenMetStrings {

    public static void main(String[] args) {
        String tekst = "mijn tekst"; // tekst komt in een String pool
        System.out.println("tekst ==\"tekst\" " + (tekst == "mijn tekst"));
        String teksta = "mijn tekst"; // ook deze komt in de String pool
        System.out.println(tekst == teksta);
        // de string pool is een hele grote bak met objecten van het type string,
        // wanneer je een waarde meerdere keren gebruikt verwijst deze naar hetzelfde adres. de leash is gelijk
        // ook de losse string mijn tekst op regel 9 komt in de string pool.
        // een string is een class, dus je mag ook objecten aanmaken

        String tekstNewString = new String("mijn tekst"); // zodra je ergens een String object aanmaakt krijg je een apart object op de heap
        // en dus geen true meer
        // dit object bestaat dus niet meer in de Stringpool
        System.out.println(tekst == tekstNewString);
        String tekstNewStringa = new String ("mijn tekst");
        System.out.println( tekstNewString == tekstNewStringa);
        // dit object is dus niet hetzelfde als het andere object en dus false
        System.out.println(tekst.equals(tekstNewString)); // dit is dan weer true,
        // de objecten worden met elkaar vergeleken: zijn beiden een instantie van string? zo ja, erwordt gecast naar string en gekeken of de karakters gelijk zijn
        // dus gebruik in de praktijk altijd equals. OCA gaat bekijken of je weet wat er gebeurt als er == staat.
    }
}
