package Week2;

import helpers.InputReader;

public class Week02
{
    public final static int ZERO=0;
    public final static int SEVEN=7;
    public final static int NINE=9;
    public final static int TWELVE=12;
    //public static final String CONSOLE_CLEAR = "\033[H\033[2J";
    public static void main(String[] args)
    {
        //System.out.println(CONSOLE_CLEAR);

        System.out.println("==================================");
        System.out.println("CO452 Programming Concepts 2022/23");
        System.out.println("==================================");
        System.out.println();
        System.out.println("  Week 2 Java Selection & Iteration ");
        System.out.println();
        System.out.println(" by Apinayan Kanenthirarasa");
        System.out.println();

        startExercise1();
        startExercise2();
        startExercise3();
        startExercise4();
        startExercise5();
    }

    /*
     * Exercise 5
     * Now extend the previous program to ask the user to choose which number they would like to see.
     */
    private static void startExercise5() {
        System.out.println("Exercise 5");
        int product;
        int userValue=InputReader.getInt("Enter your final number");
        for (int value=ZERO;value<=userValue;value++){
            product=value*SEVEN;
            System.out.println(SEVEN + "*" + value + "=" + product);
        }
    }


    /*
    * Exercise 4
    * Write a program that uses a loop to efficiently print the "seven times multiplication table".
    */
    private static void startExercise4() {
        System.out.println("Exercise 4");
        int product;
        for (int value=ZERO;value<=TWELVE;value++){
            product=value*SEVEN;
            System.out.println(SEVEN + "*" + value + "=" + product);
        }
    }

    /*
     * Exercise 3
     * Output the digits between the range of 0 to 9 using a loop.
     */
    private static void startExercise3() {
        System.out.println("Exercise 3");
        for (int currentValue=ZERO;currentValue<=NINE;currentValue++){
            System.out.println(currentValue);

        }
    }

    /*
     * Exercise 2
     * Write a program that enables a student to enter a letter grade (A, B, C, D, E or F),
     * then convert that to a university undergraduate classification (1st, 2:1, 2:2, 3rd, ordinary, fail).
     */

    private static void startExercise2() {
        System.out.println("Exercise 2");
        String stringGrade=InputReader.getString("Enter your age");
        char studentGrade=stringGrade.charAt(0);
        switch(studentGrade){
            case 'A':
                System.out.println("This is a 1st.");
                break;
            case 'B':
                System.out.println("This is a 2:1.");
                break;
            case 'C':
                System.out.println("This is a 2:2.");
                break;
            case 'D':
                System.out.println("This is a pass.");
                break;
            case 'E':
                System.out.println("This is a failed attempt.");
                break;
            default:
                System.out.println("This is an invalid mark,");
        }
    }

    /*
    * Exercise 1
    * Extend exercise 6 from Week 1 to output a message if the user is 18 or older.
    */
    private static void startExercise1() {
        System.out.println("Exercise 1");
        int userAge = InputReader.getInt("Enter your age:");
        int userDOB = 2022 - userAge;
        final int EIGHTEEN=18;
        System.out.println("You were born between "+ (userDOB-1)+ "-" + userDOB);
        if (userAge>=18){
            System.out.println("You are 18 or over");

        }
    }
}
