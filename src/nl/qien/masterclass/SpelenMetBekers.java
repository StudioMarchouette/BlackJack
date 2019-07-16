package nl.qien.masterclass;

public class SpelenMetBekers {
    public static void main(String[] args) {
        Beker beker = new Beker(500);
        beker.toonMaxInhoud();
        System.out.println("Ik ga nu inschenken");
        beker.inschenken(300);
        System.out.println("Ik ga nu inschenken");
        beker.inschenken(300);
        System.out.println("Ik ga nu een slok nemen");
        beker.uitdrinken( 50);
        System.out.println("Nog een dikke slok nu");
        beker.uitdrinken( 900);





    }
}

class Beker {
    private int maxInhoud;
    private int huidigeInhoud = 0;


    public Beker(int maxInhoud) {
        this.maxInhoud = maxInhoud;

    }

    public void toonMaxInhoud() {
        System.out.println("De inhoud van de beker is " + maxInhoud);
    }

    public void inschenken(int ingeschonkenHoeveelheid) {
        huidigeInhoud = huidigeInhoud + ingeschonkenHoeveelheid;
        System.out.println("Er zit nu " + huidigeInhoud + " in de beker.");
        if (huidigeInhoud > maxInhoud) {
            huidigeInhoud = maxInhoud;
            System.out.println("De beker overstroomt aaaaaah. Dus de inhoud is " + huidigeInhoud);
        }
    }
    public void uitdrinken (int gedronkenHoeveelheid){
        if ( gedronkenHoeveelheid > huidigeInhoud) {
            System.out.println("Ik kan maar "+ huidigeInhoud + " drinken.");
            huidigeInhoud = 0;
            System.out.println("Drinken is op. De inhoud van de beker is: "+ huidigeInhoud);
        }
    }

//    public void uitdrinken (int gedronkenHoeveelheid){
//        huidigeInhoud = huidigeInhoud - gedronkenHoeveelheid;
//        System.out.println( "Er zit nu nog "+ huidigeInhoud + " in de beker.");
//        if (huidigeInhoud <0){
//            System.out.println("Er zat niet genoeg in de beker voor mijn gewenste slok, dus ik nam een slok van "+ huidigeInhoud);
//            huidigeInhoud  = 0;
//            System.out.println("Drinken is op. De inhoud van de beker is: "+ huidigeInhoud);
//        }
//    }


}