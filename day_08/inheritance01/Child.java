package day_08.inheritance01;

public class Child extends Parent {

    // static variable'lari ve static method'lari farkli bir class'dan cagirabilmek icin
    // class ismi kullanilir,fakat bu iki class arasinda parent-child iliskisi varsa direk kullanilabilir.


    int yas = 10;

    public static void main(String[] args) {
        //Math.abs(1);
        Parent.method1();
        method1();
        System.out.println("isim = " + isim);
        System.out.println("soyisim = " + soyisim);
        isim = "Veli";
        System.out.println("isim = " + isim);
        method2();

        Child obj1 = new Child();
        obj1.method3();
        System.out.println("obj1.yas = " + obj1.yas);//10 ---- once child class'a bakiyor ve yazdiriyor.
        // Cunku bu class'ta olusturduk

        Parent obj2 = new Parent();
        System.out.println("obj2.yas = " + obj2.yas);//30
        //Java variable ararklen her zaman yukari dogru bakar is a relation
        obj2.method3();
        obj2.method4();
    }
}
