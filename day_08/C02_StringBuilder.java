package day_08;

public class C02_StringBuilder {
    public static void main(String[] args) {

        /*
        kapasitesi 7 olan bir stringbuilder objesi olusturun, capacity, lenght yazdırın
        "Hava guzel" verisini ekleyin, yazdırın
        sb'deki boslugu silin
        sb'yi ters cevirin
        sb'nin son 4 karakterini silin
        sb'yi tekrar ters cevirin ve "Java guzel" yazısını elde edin
        */

        StringBuilder sb = new StringBuilder(7);

        System.out.println("sb.capacity() = " + sb.capacity());//7

        System.out.println("sb.length() = " + sb.length());//0

        sb.append("Hava guzel");
        System.out.println(sb);//Hava guzel

        //Once space characterinin index'ini buluruz sonra deletecharAt yapariz.
        int idx = sb.indexOf(" ");
        sb.deleteCharAt(idx);
        System.out.println(sb);//Havaguzel

        sb.reverse();
        System.out.println(sb);//lezugavaH

        sb.delete(sb.length() - 4, sb.length());
        System.out.println(sb);//lezug

        sb.reverse();
        System.out.println(sb);//guzel

        sb.insert(0, "Java ");
        System.out.println(sb);//Java guzel
    }
}
