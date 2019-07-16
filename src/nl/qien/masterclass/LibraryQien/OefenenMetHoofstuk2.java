package nl.qien.masterclass.LibraryQien;

public class OefenenMetHoofstuk2
{
    public static void main(String[] args) {
       int a =10;
       int b =20;
       int c= 40;

        System.out.println(a++> 10 ||++b > 30); // eerste is false want a = 10( a = 12 na evaluatie), tweede is b = 21 is false
        System.out.println(a > 90 && ++ b < 30); // eerste is false (a = 12), dus false en stopt
        System.out.println(c > 20 && a == 10);// eerste is true dus gaat door, tweede is false dus false
        System.out.println(a >= 99 || a <= 33 && b ==10); // eerste is false dus gaat verder, tweede is true maar drie is fout dus false?  (begint rechts)
        System.out.println(a >= 99 && a <= 33 || b ==10); // eerste is false dus stopt


    }
}

