package day_03;

import java.util.Scanner;

public class C01_Substring {

    /*

    Kullanıcıdan ad ve soyadını aralarında bir bosluk olacak sekılde sisteme girmesini isteyiniz
    NOT: Yalnızca bir ad bir soyad girilmeli
    Ad ve Soyadı ilk harfleri buyuk kalani kucuk olacak sekılde alt alta yazdırın
    Ad : Canan
    Soyad : Can

    */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen ad ve soyadinizi aralarında bir bosluk olacak sekılde sisteme giriniz");
        String adSoyad = input.nextLine();//next methodu space e kadar olan kismi alir.

        int spaceIndex = adSoyad.indexOf(" ");

        //substring methodunun iki kullanim sekli var

        //1.substring(index) --->> yazilan indexten String insonuna kadar olan kismi string olarak dondurur.
        //deniz--> substring(3)--->iz olur.

        //2.substring(index1, index2) --->index1 dahil, index2 haric olmak uzere
        // index1 den index2 ye kadar olan kisim string olarak doner
        //deniz-->substring (2,4)-->ni olur

        String ad = adSoyad.trim().substring(0, spaceIndex);
        String soyad = adSoyad.trim().substring(spaceIndex + 1);

        System.out.println("Ad = " + ad);
        System.out.println("Soyad = " + soyad);
        //canan can

        char adIlkHarf=ad.toUpperCase().charAt(0);
        String adKalani=ad.substring(1).toLowerCase();
        ad=adIlkHarf+adKalani;//concatenation-> ilk harf buyuk gerisi kucuk

        char soyadIlkHarf=soyad.toUpperCase().charAt(0);
        String soyadKalan=soyad.substring(1).toLowerCase();
        soyad=soyadIlkHarf+soyadKalan;

        System.out.println("===========================================");

        System.out.println("Ad : "+ ad);
        System.out.println("Soyad : "+ soyad);

    }
}
