package day_07;

public class C04_Constructor {
    public static void main(String[] args) {

        //instance bir variable'a static bir method'dan ulasabilmek icin mutlaka object olusturmaliyiz.

        C02_Constructor obj1 = new C02_Constructor();//default constructor

        System.out.println(obj1.marka);
        System.out.println(obj1.model);
        System.out.println(obj1.yil);
        System.out.println(obj1.yakit);

        //C_02'e ait obje olusturalim
        C02_Constructor obj2 = new C02_Constructor();
        obj2.marka = "Mercedes";
        obj2.model = "C180";
        obj2.yil = 2023;
        obj2.yakit = "Benzin";

        System.out.println(obj2.marka);
        System.out.println(obj2.model);
        System.out.println(obj2.yil);
        System.out.println(obj2.yakit);

        //C_03'e ait obje olusturalim
        C03_Constructor obj3 = new C03_Constructor("Honda","Civic",2021,"Dizel" );

        System.out.println(obj3.marka);
        System.out.println(obj3.model);
        System.out.println(obj3.yil);
        System.out.println(obj3.yakit);
    }
}
