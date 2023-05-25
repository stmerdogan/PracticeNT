package day_01;

public class C01_Variables {

    public static void main(String[] args) {

        //Create a variable and print it to the screen.

        //syntax : data type    +   variable name   +  assignment operator +  variable value.

        int age = 32;
        System.out.println(age);//CTRL+D duplicate
        System.out.println(age);
        System.out.println(age);
        System.out.println(age);


        int number = 50;
        System.out.println(number);

        //write number = 50 on console
        System.out.println("number = " + number);//write number variable with its label

        //ctrl alt L =arrange your codes

        //if you want to wwrite your variable with its label you should write soutv
        System.out.println("number = " + number);
        System.out.println("age = " + age);

        //Create a String variable.=>Non primitive data type is written in double quotes "", starts with capital letter.
        String name = "Ali";
        System.out.println("name = " + name);

        //Copy the variable you create to an other variable so that two variables have the same value.
        int myAge = age;
        System.out.println("myAge = " + myAge);

        String hisName = name;
        System.out.println("hisName = " + hisName);


        //camelCase
        //PascalCase
        //snake_case
        //kebab-case


        //Declare many variables at the same line.

        int year = 2023, month = 5, day = 15;
        System.out.println("year = " + year);
        System.out.println("month = " + month);
        System.out.println("day = " + day);

        //Update a variable value
        // Upddate name variable as Veli

        name = "Veli";
        System.out.println("name = " + name);
        System.out.println("hisName = " + hisName);
        //Java runs up to down - left to right.


        /*
        Declare a variable x, start a variable y, start another variable z,
        start variable x with variable y, update variable y, print them on console
         */

        double x;
        double y = 12.50;
        double z = 33;// java accepts it as 33.0
        x = y;// A variable is only used once in a scope(main method).
        y = 13.9;// We use full stop with decimal numbers.

        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);


    }


}
