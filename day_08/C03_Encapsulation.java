package day_08;

public class C03_Encapsulation {

    /*
    bir class olusturun
    private access mod sahip variablelar olusturun: isim, soyisim, yas seklinde
    parametreli ve parametresiz constructor olusturun
    bu variablelara ait getter setter methodlarını olusturun
    toString methodunu olusturun
     */

    private String isim; //instance variable
    private String soyIsim;
    private int yas;

    public C03_Encapsulation(String isim, String soyIsim, int yas) {
        if (isim.charAt(0) >= 'A' && isim.charAt(0) <= 'Z') {
            this.isim = isim;
        } else {
            System.out.println("Isim buyuk harfle baslamalidir");
        }
        this.soyIsim = soyIsim;
        if (yas >= 0) {
            this.yas = yas;
        } else {
            System.out.println("Negatif yas girilemez");
        }//yas negatif deger alamayacak sekilde set meyhodunu guncelleyin

    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        if (isim.charAt(0) >= 'A' && isim.charAt(0) <= 'Z') {
            this.isim = isim;
        } else {
            System.out.println("Isim buyuk harfle baslamalidir");
        }

    }

    public String getSoyIsim() {
        return soyIsim;
    }

    public void setSoyIsim(String soyIsim) {
        this.soyIsim = soyIsim;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        if (yas >= 0) {
            this.yas = yas;
        } else {
            System.out.println("Negatif yas girilemez");
        }//yas negatif deger alamayacak sekilde set meyhodunu guncelleyin
    }

    public C03_Encapsulation() {
        /*
        constructor'larin method'lardan farki nelerdir?
        1-return type yoktur
        2-isimleri class ismi ile aynidir buyuk harfle baslar
         */
    }

    @Override
    public String toString() {
        return "C03_Encapsulation{" +
                "isim='" + isim + '\'' +
                ", soyIsim='" + soyIsim + '\'' +
                ", yas=" + yas +
                '}';
    }
}
