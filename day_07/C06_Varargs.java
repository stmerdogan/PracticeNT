package day_07;

public class C06_Varargs {

    //Kac tane kelime verilirse verilsin iclerinden en uzun olani yazdiran bir method olusturun
    //bu methodun access modifier'ni public yapip ayni package'daki farkli bir class'tan calistiriniz
    public static void main(String[] args) {

        String str1 = "Ali";
        //String str2 = "Abdullah";
        String str3 = "Ahmet";
        String str4 = "Veli";
        String str6 = "Kemal";
        //String str5 = "Abdurrahman";
        System.out.println(enUzunKelime(str1, str6, str3, str4));
    }

    public static String enUzunKelime(String... str) {//parametre kismini ismi str olan bir array olarak dusunebiliriz.

        String enUzunKelime = "";//buldugum en uzun kelim eyi koyacagim bir konteyner olusturdum
        for (String w : str) {//str arrayindeki her bir elemani ele almak icin loop olusturduk
            if (w.length() > enUzunKelime.length()) {
                enUzunKelime = w;
            }
        }
        return enUzunKelime;
        //methoddan elde ettigimiz datayi yazdirmanin iki yolu vardir
        //1.return edip main methodun icinden yazdirmak
        //2.return etmeden methodun içinden yazdırmak
    }
}