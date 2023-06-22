package day_09.inheritance;

public class Child extends Parent {

    protected Child() {
        //super();//yazsa da yazmasa da bu super() hep var
        //bu ifade parent classtaki parametresiz constructor'i isaret eder
        System.out.println("child class parametresiz constructer");
    }

    protected Child(int a) {
        super(1);
        System.out.println("child class tek parametreli constructor");
        //super() ifadesi her zaman ilk kod satirinda olmalidir aksi halde cte verir
    }
    protected Child(int a,int b){
        super(1,4);
        System.out.println("child class iki parametreli constructor");
    }

    public static void main(String[] args) {

        //Child obj1 = new Child();
        //Child obj2 = new Child(1);
        Child obj3 = new Child(1,5);

        /*
        Ali b = new C();
        1.Ali class'in olmasi gerek
        2.C class'in Ali'nin child class'i olmasi gerek
        3.C class'inda parametresiz constructor olmali.
         */













    }

}
