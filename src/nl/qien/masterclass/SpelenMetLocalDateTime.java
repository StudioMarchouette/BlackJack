package nl.qien.masterclass;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

public class SpelenMetLocalDateTime


{
    public static void main(String[] args) {
        LocalDate vandaag = LocalDate.now();
        System.out.println("vandaag = " + vandaag);
       // LocalDate anderedatum = new LocalDate(); // dit compileert niet omdat LocalDate een private class is.
        // alleen maar muteeerbaar binnen de class
        LocalDate andereDatum = LocalDate.of (2019, 2, 28);
        // de maand is hier octaal als je er een 0 voor zet! dus bijv. 09 compileert niet want deze maand in octaal is ongeldig!!!
        System.out.println(andereDatum);

        // zo kan deze wel gemuteerd worden
        // deze vraag zit bijna zeker op het oca.
        // wanneer je ongeldige waarden invoert komt er een DateTimeException
        // een waarde die niet kan is bijv LocalDate.of (2019, 05, 32)
        // Exception in thread "main" java.time.DateTimeException: Invalid date 'February 29' as '2019' is not a leap year
        LocalDate anderedatum1 = LocalDate.parse("2019-05-09"); // als je 2019-5-1 typt oid dan krijg je een DateTimeParseException
        // de datum moet voldoen aan het format 9999-99-99
        System.out.println("Andere datum 1 is "+ anderedatum1);
        // deze methode heeft ook een aantal methodes onder zich om gegevens op te vragen
        System.out.println(anderedatum1.getDayOfMonth());
        // date time is immutable maar je kan wel dingen optellen en aftrekken, wordt dan dus niet aangepast in de originele variabele
        System.out.println(andereDatum.withYear(2000)); // verandert het jaar in de print, methode levert iedere keer een nieuwe local date dus een nieuw object
        // wanneer je met with year het jaar verandert in geen schrikkeljaar
        // maar je hebt 29-02 ingevuld, dan zal de code wel compileren en een dag terug gaan
        // practise met deze code opties!
        // artihmatic operators werken niet want de data zijn objecten/
        // deze class heeft zijn eigen methodes hiervoor: Period.between rekent de periode uit tussen twee data
        // je kan ook zelf periodes aanmaken en hiermee allerlei mutaties doen
        System.out.println("andereDatum is " + andereDatum); // de waarde is dus niet aangepast
        LocalDate datumVanGisteren = LocalDate.of( 2019, 07, 06);
        System.out.println( datumVanGisteren.atTime ( 14,15));
        LocalTime nu = LocalTime.of(12,12);
        // er is geen am of pm, gebruik 23 uursnotering
        // jke krijgt een runtime exception als je er iets instopt dat niet kan
        LocalTime.now();
        System.out.println(LocalTime.now());

        // periods
        LocalDate vandaag1 = LocalDate.now();
        LocalDate andereDatum1 = LocalDate.of (2019, 7, 11);
        Period verschil = (Period.between(andereDatum1, vandaag)); // wordt P0D, dit ide manier waarop de output geleverd wordt
        System.out.println(verschil);// wanneer je 1 waarde invult bij Period.of, zet ie de andere waarden op 0
        Period testPeriode;
        testPeriode = Period.of (2, 4,67);
        System.out.println( vandaag.plus (testPeriode)); // op deze manier compileer dit en telt hij het bij elkaar op
        // er zijn wel regels over het parsen van een periode. zie boek
        // het is een hele flexibele methode en er kan veel in het opzetten en omzetten ervan
        // de standaard schrijfwijze is P x Y x M x D
        // weken worden daarom omgezet in dagen
        // 1 wordt naar binnen toe gehaald als die vooraan staat, daarnaast worden + niet getoond in de output
     // deze doet het niet   testPeriode = Period.parse("+P+5y3M+-7D");
        // als je een andere volgorde aanhoud van de dagen, dan compileert de code niet
        System.out.println(testPeriode);
        testPeriode = Period.parse("p5y");
        System.out.println(testPeriode);
        vandaag.atTime(14, 14);










    }
}
