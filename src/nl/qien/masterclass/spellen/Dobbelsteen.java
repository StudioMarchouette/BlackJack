package nl.qien.masterclass.spellen;

import java.util.Random;


public class Dobbelsteen {

    private Random rd = new Random();

    int waarde;

    public int gooiDobbelsteen() {
        int waarde = 1 + rd.nextInt(6);
        return waarde;
    }


}







