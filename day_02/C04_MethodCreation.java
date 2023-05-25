package day_02;

public class C04_MethodCreation {
     /*

     Verilen sayi1 ve sayi2 variable'larinin degerlerini degistiren (SWAP) bir program yaziniz
     Orn: sayi1=10 ve sayi2=20;
     kod calistiktan sonra
     sayi1=20 ve sayi2=10

     */

    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 20;

        System.out.println("swaptan once num1 ; " + num1);
        System.out.println("swaptan once num2 ; " + num2);

        //method iki sayinin degerlerini degistirip yazdiracak ==> return type void

        swaplaYazdir(num1, num2);
    }

    private static void swaplaYazdir(int num1, int num2) {

        int num3 = num1;
        num1 = num2;//num1 in degeri 20 olmus oldu
        num2 = num3;
        System.out.println("swaptan sonra num1 ; " + num1);
        System.out.println("swaptan sonra num2 ; " + num2);

    }
}
