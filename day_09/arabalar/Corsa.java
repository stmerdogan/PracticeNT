package day_09.arabalar;

public class Corsa extends Opel {

    //Corsa model arabaya ait en specific ozzellikleri bu class'ta tanimlayalim ve daha sonra
    //bu class'da main method olusturup objeler uzerinden variable ve methodlari cagiralim

    String hiz = "Corsa mx 200 km hiz yapar";
    String yakit = "Corsa arabalar benzinli veya elektriklidir";
    String model = "Corsa";

    @Override
    protected void motor() {
        System.out.println("Corsa arabalar cevreci motor kullanirlar");
    }

    @Override
    protected void yakitTuketimi() {
        System.out.println("Corsa arabalar 5.6 lt yakit tuketirler");
    }

    protected void vitesSayisi() {
        System.out.println("Corsa 5 viteslidir");
    }

    public static void main(String[] args) {

        //Bir tane corsa objesi olusturalim.
        // static method'tan instance datalara ulasmak icin object olustururu

        Corsa araba1 = new Corsa();
        System.out.println("araba1.hareket = " + araba1.hareket);               //Araba class'indan
        System.out.println("araba1.hiz = " + araba1.hiz);                       //Corsa class'indan
        System.out.println("araba1.yakit = " + araba1.yakit);                   //Corsa class'indan
        System.out.println("araba1.marka = " + araba1.marka);                   //Opel class'indan
        System.out.println("araba1.sirketMerkezi = " + araba1.sirketMerkezi);   //Opel class'indan
        System.out.println("araba1.model = " + araba1.model);                   //Corsa class'indan
        araba1.motor();                                                         //Corsa class'indan

        //bir tane de opel objesi olusturalim
        Opel araba2 = new Corsa(); //data turu parent, constructor child'dan gelecek sekilde de obj.olusturulur
        //ayni package olmak sarti ile

        System.out.println("araba2.hareket = " + araba2.hareket);                //Araba class'indan
        System.out.println("araba2.hiz = " + araba2.hiz);                        //Opel class'indan
        System.out.println("araba2.yakit = " + araba2.yakit);                    //Araba class'indan
        System.out.println("araba2.marka = " + araba2.marka);                    //Opel class'indan
        System.out.println("araba2.sirketMerkezi = " + araba2.sirketMerkezi);    //Opel class'indan

        //araba2.model==>compile time error verir..opelde veya opelin parentinda model variable olmadigi
        //icin cte (compile time error verir)

        araba2.motor();
        /*
        Inheritance'da variable'lar
        Aramaya data turu neyse (class ismi)  oradan baslar.Bulamazsa parent'a bakar ve ilk buldugu yerden alir

        Inheritance'de methodlar
        Aramaya data turu (class ismi) oradan baslar ama bulamazsa parent'a bakar.Ilk buldugunu almaz
        constructor'in oldugu class'a kadar override edilmis mi diye bakar ve son buldugu yerden alir

        arama islemi hem variable hem de methodlar icin asagidan yukari dogrudur..child>parent
        override control islemi ise yukaridan asagiya dogrudur
        */

        araba2.garanti();//opel
        araba2.yakitTuketimi();//corsa

        //methodlar icin 2 asama var.
        //1.asama==> arama ve bulma islemi-asagidan yukariya dogru
        //2.asama ==>bulduktan sonra sagiya dogru override edilmis mi diye bakacak

        //araba2.vitesSayisi();==>surec sekteye ugramis oldugu icin bu methodu override edilmis olsa bile bulamiyor

        Araba araba3 = new Araba();

        System.out.println("araba3.hareket = " + araba3.hareket);   //Araba baska secenegi yok
        System.out.println("araba3.hiz = " + araba3.hiz);           //Araba baska secenegi yok
        System.out.println("araba3.yakit = " + araba3.yakit);       //Araba baska secenegi yok
        System.out.println("araba3.marka = " + araba3.marka);       //Araba baska secenegi yok

        //araba3.sirketMerkezi(); ===>cte verdi

        araba3.yakitTuketimi();//corsa
        araba3.motor();//corsa
        //araba3.garanti();//cte verir
        //araba3.vitesSayisi();//cte verir

        Araba araba4 = new Opel();
        araba4.motor();//opel
    }
}

