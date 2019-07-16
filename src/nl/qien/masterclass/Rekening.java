package nl.qien.masterclass;

public class Rekening { // de blauwdruk van een rekening object. object bevat de kenmereken rekeningNummer, eigenaar en saldo


    private String rekeningNummer; // String vanwege mogelijke andere invoer dan nummers alleen
    private String eigenaar;
    private double saldo;
    public int afboeking;
    public int bijboeking;

    public Rekening(String rekeningNummer, String eigenaar, double saldo) { // constructor van de instantie nl.qien.masterclass.Rekening, deze parameters moeten worden opgegeven om een rekening te maken
        this.eigenaar = eigenaar;
        this.rekeningNummer = rekeningNummer;
        setSaldo(saldo);


    }

    public void setSaldo(double saldo) { // setter voor variabele saldo, deze methode zorgt ervoor dat je een waarschuwing krijgt als je niet genoeg saldo hebt
        if (saldo <= 0) {
            this.saldo = 0;
            System.out.println("Je hebt niet genoeg geld, je moet eerst geld storten!");
        } else {
            this.saldo = saldo;
        }
    }


        public double getSaldo () { //getter voor variabele saldo
            return this.saldo;
        }

        public void toonSaldo () { // methode om het saldo te tonen, void want er wordt niks teruggegeven
            System.out.println("Het saldo van de rekening is " + saldo);
        }

        public void toonEigenaar () { // methode om de eigenaar te tonen
            System.out.println("De eigenaar van de rekening is " + eigenaar);
        }

        public void toonRekeningNummer () {// methode om het rekeningnummer te tonen
            System.out.println("Het rekening nummer is: " + rekeningNummer);
        }

        public void afboeken () { // methode die aangeeft wat er moet gebeuren als er geld afgeboekt wordt
            if (afboeking > 0) {
                saldo = saldo - afboeking;
                System.out.println("Er is " + afboeking + " afgeboekt. Het saldo is nu " + saldo);
            } else {
                System.out.println("Er zijn geen afboekingen.");
            }
        }

        public void bijboeken () {// methode die aangeeft wat er moet gebeuren als er geld bijgeboekt wordt
            if (bijboeking > 0) {
                saldo = saldo + bijboeking;
                System.out.println("Er is " + bijboeking + " bijgeboekt. Het saldo is nu " + saldo);
            } else {
                System.out.println("Er zijn geen bijboekingen.");
            }
        }
    }









