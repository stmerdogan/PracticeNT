package day_08;

import java.util.Scanner;

public class C01_StringBuilder {
    public static void main(String[] args) {

        //kullanıcıdan aldiginiz veriyi stringbuilder objesine atayın
        //capasity lenght yazdırın
        //capasity i lenghte esıtleyın tekrar yazdırın
        //ikinci bir stringbuilder objesi olusturun, kullanıcıdaan aldıgınız veriyi atayın
        //iki objeyi karsılastırın(== , equals , compareTo ile)

        Scanner input = new Scanner(System.in);
        //neden obje olustururuz==>instance method/variable'lara ulasmak icin
        System.out.println("Lutfen bir kelime giriniz");
        String kelime = input.next();

        // Kullanicinin girdigi veriyi iceren bir StringBuilder olusturalim.
        //Ilk asamada String parametreli bir constructor olusturdum
        StringBuilder sb = new StringBuilder(kelime);
        System.out.println(sb);

        System.out.println("sb.capacity() = " + sb.capacity());
        //Parametreli constructor kullanarak olusturdugumuz sb objesinin kapasitesi==>>16
        //Arti parametre olarak verilen String'in uzunlugu 16+3
        //Parametresiz constructor kullansaydik default olarak 16 olurdu.
        System.out.println("sb.length() = " + sb.length());

        sb.trimToSize();//Bu method capacity'i lenght'e esitler
        System.out.println("sb.capacity() = " + sb.capacity());
        System.out.println("sb.length() = " + sb.length());


        //Parametresiz constructor kullanarak sb objesi olusturalim
        StringBuilder sb2 = new StringBuilder();
        sb2.append(kelime);
        System.out.println(sb2);
        System.out.println("sb2.capacity() = " + sb2.capacity());
        System.out.println("sb2.length() = " + sb2.length());

        //Iki objeyi karsilastir.
        System.out.println(sb == sb2);//false-hem referansa hem degere bakar
        System.out.println(sb.equals(sb2));//false==>String builder'daki equals methodu String 'deki gibidegildir.
        //Burada hem degere hem referansa bakar yine.

        System.out.println(sb.compareTo(sb2));//0 (int return eder)
        //compareTo methodu 0 veya baska deger dondurur.
        //Bizim icin onemli olan sonucun 0 olup olmamasidir.0 ise iki obj.degerleri esit demektir.
    }
}
