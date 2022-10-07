package Week1;

import helpers.*;
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
        startExercise3();
        //Exercise 4
        startExercise4();
        //Exercise 5
        startExercise5();
        //Exercise 6
        startExercise6();
        //Exercise 7
        //Exercise 8
        startExercise8();
        //
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
    
    private static void startExercise3(){
        int rectangleL = InputReader.getInt("Enter the length of your rectangle :");
        int rectangleH = InputReader.getInt("Enter the Height of your rectangle :");
        int rectangleArea = rectangleL*rectangleH;
        int rectanglePerimeter= (2 * rectangleH) + (2 * rectangleL);
        System.out.println("The area of your rectangle is " + rectangleArea);
        System.out.println("The perimeter of your rectangle is " + rectanglePerimeter);
    }
    
    private static void startExercise4() {
        System.out.println("Average finder");
        double userInt1 = InputReader.getDouble("Enter your first number");
        double userInt2 = InputReader.getDouble("Enter your second number");
        double average = (userInt1 + userInt2) / 2;
    }
    
    private static void startExercise5(){
        int userNum1 = InputReader.getInt("Enter your first value:");
        int userNum2 = InputReader.getInt("Enter your second value:");
        System.out.println("Original order:"+ userNum1 + "," + userNum2);
        System.out.println("Reversed order:"+ userNum2 + "," + userNum1);
    }
    
    private static void startExercise6(){
        int userAge = InputReader.getInt("Enter your age:");
        int userDOB = 2022 - userAge;
        System.out.println("You were born between "+ (userDOB-1)+ "-" + userDOB);
    }
    
    private static void startExercise8(){
        System.out.println("Feet to miles converter");
        double userFeet = InputReader.getDouble("Enter tht number of feet");
        double miles = userFeet / 5280;
        System.out.println(userFeet + " feet is " + miles +" miles");
    }
}
