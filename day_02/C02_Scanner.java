package day_02;

import java.util.Scanner;

public class C02_Scanner {

    //kullanıcıdan aldıgınız iki sayının karelerinin birbirine esıt olup olmadıgını kontrol eden bir method yazınız
    //yani alınan iki sayının kareleri esıt ıse true, degıl ıse false dondursun

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen birinci sayiyi giriniz");
        int a = scan.nextInt();

        System.out.println("Lutfen ikinci sayiyi giriniz");
        int b = scan.nextInt();

        boolean result = isSquareEqual(a, b);
        System.out.println("result = " + result);

    }
    public static boolean isSquareEqual(int a, int b) {
        boolean result = (a * a) == (b * b);
        return result;
    }

}
