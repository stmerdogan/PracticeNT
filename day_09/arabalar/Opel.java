package day_09.arabalar;

public class Opel extends Araba {

    String hiz = "Opel arabalar max 220 km hiz yaparlar";
    String marka = "Opel";
    String sirketMerkezi = "Almanya";

    @Override
    protected void motor() {
        System.out.println("Opel arabalar opel marka motor kullanir");
    }

    protected void garanti() {
        System.out.println("Opel arabalar 2 yil garantilidir");
    }
}

