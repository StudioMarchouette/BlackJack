package nl.qien.masterclass;

public class SpelenMetBomen {
    public static void main(String[] args) {
        Boom Gerrit = new Boom(500, "berk", 80);
        Boom Cynthia = new Boom(600, "eik", 60);
        Boom Hans = new Boom(500, "kastanje", 30);

        System.out.println(" De boom Hans is een  " + Hans.getSoort() + " van " + Hans.getLeeftijd() + " jaar oud en " + Hans.getHoogte() + " cm hoog.");
        System.out.println(" De boom Cynthia is een  " + Cynthia.getSoort() + " van " + Cynthia.getLeeftijd() + " jaar oud en " + Cynthia.getHoogte() + " cm hoog.");
        System.out.println(" De boom Gerrit is een  " + Gerrit.getSoort() + " van " + Gerrit.getLeeftijd() + " jaar oud en " + Gerrit.getHoogte() + " cm hoog.");

        System.out.println("Als er processierupsen in de boom zitten moet de boom weg.");
        System.out.println(" Hoe zit het met boom Cynthia?");
        Cynthia.setRups(true);
        Cynthia.rupsInBoom();
        System.out.println("En met boom Hans? ");
        Hans.rupsInBoom();


        System.out.println("Als de boom in bloei staat kun je last hebben van hooikoorts");
        System.out.println("Hoe zit het met boom Gerrit?");
        Gerrit.setBloei(true);
        Gerrit.boomInBloei();
        System.out.println("En met boom Hans?");
        Hans.boomInBloei();



    }


}


class Boom {
    private int hoogte;
    private String soort;
    private boolean bloei;
    private int leeftijd;
    private boolean rups;

    public Boom(int hoogte, String soort, int leeftijd) { // constructor van een boom object
        setHoogte(hoogte);
        setSoort(soort);
        setLeeftijd(leeftijd);

    }

    public void setRups(boolean rups) {
        this.rups = rups;
    }

    public boolean getRups() {
        return rups;

    }

    public void setLeeftijd(int leeftijd) {
        this.leeftijd = leeftijd;
    }

    public int getLeeftijd() {
        return leeftijd;
    }


    public void setSoort(String soort) {
        this.soort = soort;
    }

    public String getSoort() {
        return soort;

    }

    public void setHoogte(int hoogte) {
        this.hoogte = hoogte;

    }

    public int getHoogte() {
        return hoogte;

    }

    public void setBloei(boolean bloei) {
        this.bloei = bloei;

    }

    public boolean getBloei() {
        return bloei;

    }

    public void rupsInBoom() {
        if (rups) {
            System.out.println("Steek de boom maar in de fik.");
        } else {
            System.out.println("Niks aan het handje, lekker laten staan.");
        }
    }

        public void boomInBloei () {
            if (bloei) {
                System.out.println("Kijk uit met hooikoorts! Deze boom staat in bloei!");
            } else {
                System.out.println("Je kan prima chillen bij deze boom. Wijntje erbij, gitaartje erbij. Lekker.");
            }

    }

}