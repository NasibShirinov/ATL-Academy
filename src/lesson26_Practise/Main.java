package lesson26_Practise;

public class Main {

    public static void main(String[] args) {
        Motherboard asus_Prime_Z790A = new Motherboard(Chipset.Z790, "Intel", "DDR5", "ATX", 4, true, true, true);
        Motherboard asus_TUFGaming_Z790PRO = new Motherboard(Chipset.Z790, "Intel", "DDR5", "ATX", 4, true, true, true);

        asus_Prime_Z790A.start_stop("start");


    }
}
