package day_02;

import java.util.Scanner;

public class C01_MethodCreation {

    //Kullanicidan fahrenheit cinsi bir deger girmesini isteyiniz
    // Fahrenheit değeri, Celsius değere çeviren method yazınız.
    // formül: c = (f-32)/1.8
    //yani fahrenheit degerini bu methoda gonderdıgımde bana celsius cinsinden sıcaklık donmeli

    public static void main(String[] args) {

        // kullanicidan veri almak icin Scanner objesi olusturulur.
        Scanner scan = new Scanner(System.in);

        //kullaniciya bir mesaj gonderelim
        System.out.println("Fahrenheit cinsi bir sicaklik giriniz");
        double fahrenheit = scan.nextDouble();

        System.out.println("fahrenheit = " + fahrenheit);

        //main method icinden method olustururken methodumuza verecegimiz ismi yaziyoruz.
        //method pantezinin icine argument yaziyoruz.

        double celsius = fahrToCels(fahrenheit);//method parantezinin icine neyi degistireceksek onu yazariz.
        System.out.println("celsius = " + celsius);

    }

    public static double fahrToCels(double fahrenheit) {
        double celcius = (fahrenheit - 32) / 1.8;
        return celcius;


    }


}
