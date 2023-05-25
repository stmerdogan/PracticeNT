package day_01;

public class C05_MethodCreation {
    //Create a method that finds and prints the sum of the squares of two numbers
    //Create a method that finds and prints the sum of the squares of the two numbers I defined inside the main method

    public static void main(String[] args) {
        squareSumPrint(2, 3);

    }
    public static void squareSumPrint(int a, int b) {
        int sum = a * a + b * b;
        System.out.println(sum);
    }


}
