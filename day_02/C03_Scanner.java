package day_02;

import java.util.Scanner;

public class C03_Scanner {
     /*
     Kullanicidan aldiginiz character ile asagidaki gibi bir gorunum olusturunuz

                  A
                 A A
                A A A
      */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz");

        char ch = scan.next().charAt(0);

          /*
            Scanner objesinin nextChar diye bir metodu yok
            bu yuzden kullanicinin girdigi dtayi once string olarak aliyorum
            daha sonra bu string in 0.indexindeki karakteri charAt(0) methodu ile aliyorum
            String variable larda index yapisi vardir ve index 0 dan baslar.
            charAt(0) sifirinci index yani ilk karakter demektir.
          */
        System.out.println("ch = " + ch);
        System.out.println("==============================CEVAP=======================================");

        /*

          A
         A A
        A A A

        */

        //Consolda space yapmak icin sout'un icinde space i mutlaka "" icinde yazmaliyiz
        System.out.println("  " + ch + "  ");
        System.out.println(" " + ch + " " + ch);
        System.out.println(ch + " " + ch + " " + ch);

        //\n isareti bir alt satira gecmeye yarar. "" icinde yazilir
        System.out.println("  " + ch + "\n " + ch + " " + ch + "\n" + ch + " " + ch + " " + ch);
    }


}
