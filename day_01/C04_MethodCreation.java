package day_01;

public class C04_MethodCreation {
     /*
       Print on the console
       hello world
       Hello World
       HEllo WOrld
       HELLo WORLd
       HELLO WORLD
        */


    public static void main(String[] args) {

        write();
        write();
        write();

    }
    //Method creation
    // syntax : access modifier + static keyword + return type +  method name (){}-->{body}

    public static void write() {
        System.out.println("hello world");
        System.out.println("Hello World");
        System.out.println("HEllo WOrld");
        System.out.println("HELLo WORLd");
        System.out.println("HELLO WORLD");

    }


}
