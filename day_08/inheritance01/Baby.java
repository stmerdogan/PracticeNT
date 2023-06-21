package day_08.inheritance01;

public class Baby extends Child {
    int kilo = 45;

    public static void main(String[] args) {

        //static variable ve method'lara direk ulasabiliriz
        method1();
        method2();
        System.out.println("isim = " + isim);
        System.out.println("soyisim = " + soyisim);

        //instance data'lara ulasmak icin object olusturmaliyiz

        Baby obj1 = new Baby();
        obj1.method3();
        System.out.println(obj1.yas);//10
        System.out.println(obj1.kilo);//45

        Child obj2 = new Child();
        //obj2.kilo

        //ilk olarak child class'a bakar child class'ta kilo yok, o zaman
        //parent'a bakar.Parent'ta da kilo olmadigi icin java cte(compile time error) verir,cocuklara bakmaz
    }
}
