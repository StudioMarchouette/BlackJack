package nl.qien.masterclass;

import java.util.concurrent.TimeUnit;

public class Klok {
    public static void main(String[] args) throws Exception {

        for (int Uren= 0; Uren < 24; Uren  ++){
            for (int Minuten = 0; Minuten <60; Minuten ++){
                for (int Seconden = 0 ; Seconden < 60; Seconden ++){
                    System.out.println("Tijd op de klok: "+ Uren + ":"+ Minuten+ ":"+ Seconden);
                    TimeUnit.MILLISECONDS.sleep (1000); // is 1 seconde, dit is meer een timer dan een klok natuurlijk, en hij draait maar 24 uur

                }
            }
        }
    }
}
