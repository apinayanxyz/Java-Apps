package Week1;

import helpers.InputReader;
public class Week1 
{
    public static final String CONSOLE_CLEAR = "\033[H\033[2J";
    public static void main(String[] args)
    {
        System.out.println(CONSOLE_CLEAR);

        System.out.println("==================================");
        System.out.println("CO452 Programming Concepts 2022/23");
        System.out.println("==================================");
        System.out.println();
        System.out.println("  Week 1 Java Basic Input/Output ");
        System.out.println();
        System.out.println(" by Apinayan Kanenthirarasa");
        System.out.println();
        //Exercise 1
        startExercise1();
        //Exercise 2
        startExercise2();
        //Exercise 3

    }


    private static void startExercise1() {
        //Exercise 1
        System.out.println("Hello world");
    }

    private static void startExercise2() {
        String name = InputReader.getString("Enter your name > ");
        System.out.println("Hello " + name);
        System.out.println();
    }
}
