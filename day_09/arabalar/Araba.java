package day_09.arabalar;

public class Araba {

    // Araba, Opel, Corsa adında farklı class'lar olusturunuz.
    // Opel class'ı Araba class'ına baglı olacak
    // Corsa class'ı Opel class'ına baglı olacak
    // Araba class'ına genel bilgileri, variable ve method olarak yazınız.
    // Opel class'ına gerekli bilgileri, variable ve method olarak yazınız.
    // Corsa class'ına en spesifik bilgileri, variable ve method olarak yazınız.
    // Corsa class'ından obje olusturarak variableları ve methodları yazdırınız.

    //tum arablar icin ortak olan ozellikleri variable olarak tanimlayalim

    protected String hareket = "Arabalar teker ile hareker eder";
    protected String hiz = "Arabalar motor gucunu gore hareket eder";
    protected String yakit = "Arabalar farkli yakitlar kullanirlar";
    protected String marka = "Arabalar uretildikleri markalara sahiptir";

    //tum arabalar icin ortak olan ozellikleri method olarak tanimlayalim

    protected void motor() {
        System.out.println("Arabalar farkli markalarda motor kullanir");
    }

    protected void yakitTuketimi() {
        System.out.println("Arabalar motor gucu ve yakit turune gore yakit kullanirlar");
    }
}
