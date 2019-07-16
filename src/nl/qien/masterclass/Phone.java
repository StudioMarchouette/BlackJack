package nl.qien.masterclass;

public class Phone {
    static boolean touchscreen = false;

    public static void main(String[] args) {

        Phone phone1=new Phone();
        Phone phone2=null;
        Phone.touchscreen= false;
        phone1.touchscreen =  true;


        System.out.println(phone1.touchscreen);
        System.out.println(phone2.touchscreen);

    }

    }

