package day_05;

import java.util.Arrays;

import java.util.Scanner;

public class C06_Array {

    public static void main(String[] args) {

        // Kullanıcıdan 4 tane rakam sisteme girmesini isteyiniz

        Scanner scan = new Scanner(System.in);
        int arr[] = new int[4];
        System.out.println(Arrays.toString(arr));//[0, 0, 0, 0]

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Lutfen bir sayı giriniz");
            int sayi = scan.nextInt();
            arr[i] = sayi;
        }
        System.out.println(Arrays.toString(arr));

        /*
        [0,0,0,0]
        [3,0,0,0]
        [3,2,0,0]
        */

        //loopun bir dongusu bittiği anda arraye assign ettigimiz variablelar sabit kalır,
        //ancak loop icinde olusturdugumuz variablelar yok olur loop her calıstıgında tekrar olusur
        // ve bu rakamları bir array'e assign ediniz. Olusturdugunuz array'i yazdırınız

        // Array'in icindeki elemanların ortalamasını bulunuz. Ortalamayı yazdırınız
        //ilk önce for each ile arrayın elemanlarını toplayalım, daha sonra array'in uzunluguna boleriz

        double toplam = 0;

        for (int each : arr) {
            toplam += each;
        }
        System.out.println("toplam = " + toplam);

        double ortalama = toplam/arr.length;

        System.out.println("ortalama = " + ortalama);

        // Ortalamadan daha buyuk olan array elemanlarını yazdırınız

        for (int each : arr) {
            if (each > ortalama) {
                System.out.print(each + " / ");
            }
        }
    }
}