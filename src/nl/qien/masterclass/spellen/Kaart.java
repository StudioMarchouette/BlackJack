//package nl.qien.masterclass.spellen;
//
//
//public class Kaart {
//    // hieronder worden de variabelen geinitialiseerd die nodig zijn voor het genereren van kaarten: waarde en soort
//    private String  kaartSoort;
//    private int kaartWaarde;

//
//    // elke mogelijke kaart moet een bestaand object zijn
//    // een kaart moet een waarde hebben en een soort
//    // met de waarde en de soort moet gerekend kunnen worden
//    // een kaart moet in een deck zitten
//
//
//
//    private static String [] soorten = { "harten", "klaveren", "ruiten", "schoppen"}; // array van soorten
//    private static int [] waarden = { 2,3, 4, 5, 6, 7, 8, 9, 10, 11,12,13};// array van waarden in int. voor lezen op console moet dit nog aangepast worden naar de kaart vormen
//    // 11 is een aas = 11
//    // 12 is een boer =10
//    // 13 is een vrouw = 10
//    // 14 is een heer  = 10
//
//    public Kaart(String kaartSoort, int kaartWaarde) { // constructor van een kaart
//
//        setKaartWaarde(kaartWaarde);
//        setKaartSoort(kaartSoort);
//
//
//    }
//
//
//
//    public void setKaartWaarde(int kaartWaarde) {
//        this.kaartWaarde = kaartWaarde;
//
//    }
//
//    public int getKaartWaarde() { // methode zet de waardes van de kaarten Boer, Heer en Vrouw om naar 10
//        if (kaartWaarde == 12 || kaartWaarde == 13 || kaartWaarde == 14)
//        return 10 ;
//        else return kaartWaarde;
//
//    }
//
//    public void setKaartSoort(String kaartSoort) {
//        this.kaartSoort = kaartSoort;
//
//    }
//
//    public String getKaartSoort() {
//        return kaartSoort;
//
//    }
//
//    public String getNaamWaarde(){ // deze methode zet de int om naar een soort in een String zodat deze op de console gelezen kan worden door de speler
//        if (kaartWaarde == 11)
//            return "Aas" ;
//            else if (kaartWaarde == 12)
//                return "Boer";
//            else if (kaartWaarde == 13 )
//                return "Vrouw";
//            else if (kaartWaarde == 14)
//                return "Heer";
//            else
//                return String.valueOf(kaartWaarde);
//
//
//
//
//
//
//
//
//
//    }
//
//    public void toonKaart (){
//        System.out.println("De kaart die je hebt getrokken is: " + kaartSoort + " "+ kaartWaarde );
//    }
//
//
//}
