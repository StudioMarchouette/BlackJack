package nl.qien.masterclass;

public class SpelenMetRekening {
    public static void main(String[] args) {
        Rekening rekening1 = new Rekening("589834", "John", 0);
        // wanneer het saldo te laag is komt de waarschuwing bovenaan.

//        rekening1.eigenaar = "John";
//        rekening1.rekeningNummer = "57976";
//        rekening1.saldo = 1000;


        rekening1.toonEigenaar();
        rekening1.toonRekeningNummer();
        rekening1.toonSaldo();

        rekening1.afboeking = 800; // bedrag dat je wil afboeken, instantie variabele
        rekening1.afboeken();

        rekening1.bijboeking = 0; // bedrag dat je wil bijboeken, instantie variabele
        rekening1.bijboeken();

        rekening1.toonSaldo();



    }
}

