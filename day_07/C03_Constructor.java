package day_07;

public class C03_Constructor {

    //bu class'ta parametreli constructor olusturunuz.
    //ve farkli bir class'tan deger atamasi yapacagiz

    String marka;
    String model;
    int yil;
    String yakit;

    public C03_Constructor(String marka, String model, int yil, String yakit) {
        this.marka = marka;
        this.model = model;
        this.yil = yil;
        this.yakit = yakit;
    }
    //parametreli veya parametresiz constructor olusturuldugunda default constructor devre disi kalir
    //eger bir class'a parametreli bir constructor eklendiyse mutlaka default constructor'a
    // benzer parametresiz bir constructor eklenmeli.

    public C03_Constructor() {//hazirda bir adet parametresiz constructor da eklenir calisma ortaminda
    }
}
