package day_07;

public class C07_Varargs {

    // parametre olarak bir int ve istediginiz kadar String alan bir method olusturun,
    // en uzun String'in harf sayisi ile int parametre degerini carpıp sonucu yazdıranız.

    public static void main(String[] args) {

        int sayi = 5;//local variable
        String str1 ="Zulal";
        String str2 ="Zeynep";
        String str3 ="Can";

        carpim(sayi, str1, str2, str3);
        System.out.println(C06_Varargs.enUzunKelime(str1, str2, str3));
    }

    private static void carpim(int sayi,String... str) {//eger tekil bir data ve varargs'i bir arada kullanacaksak
                                                        //varargs her zaman sonda kullanilmalisir

        String enUzunKelime = "";

        for (String w :str) {

            if(w.length()>enUzunKelime.length()){
                enUzunKelime=w;
            }
        }
        System.out.println(enUzunKelime.length()*sayi);
    }
}
