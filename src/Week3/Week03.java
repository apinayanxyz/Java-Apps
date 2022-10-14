package Week3;

import helpers.InputReader;

public class Week03 {
    public static final String CONSOLE_CLEAR = "\033[H\033[2J";

    public static void main(String[] args) {
        System.out.println(CONSOLE_CLEAR);

        System.out.println("==================================");
        System.out.println("CO452 Programming Concepts 2022/23");
        System.out.println("==================================");
        System.out.println();
        System.out.println(" Week 3 Classes, Objects, Constructors ");
        System.out.println();
        System.out.println(" by Apinayan Kanenthirarasa");
        System.out.println();
        instantiateStudent();
    }

    /*
     * Method to instantiate a student class object using input from user
     */
    private static void instantiateStudent() {
        System.out.println("Exercise 1");
        System.out.println();
        String fullName = InputReader.getString("Enter your full name > ");
        String id = InputReader.getString("Enter your student ID > ");
        Student student = new Student(id, fullName);
        System.out.println();
        String courseName = InputReader.getString("Enter your course name > ");
        String courseCode = InputReader.getString("Enter your course code > ");
        Course course = new Course(courseName, courseCode);
        System.out.println();
        student.enroll(course);
        student.printDetails();
    }

}
