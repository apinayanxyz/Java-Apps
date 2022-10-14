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
        Student student = createStudent();
        createCourse(student);
        printStudentDetails(student);
    }

    private static void printStudentDetails(Student student) {
        
        System.out.println("StudentID: " + student.getId());
        System.out.println("Name: " + student.getFullName());
        System.out.println();
        System.out.println("Course Name:" + student.getCourse().getCourseName());
        System.out.println("Course code:" + student.getCourse().getCourseCode());
    }

    private static void createCourse(Student student) {
        String courseName;
        boolean cNameChecker = true;
        do {
            courseName = InputReader.getString("Enter your course name > ");
            String answer = InputReader.getString("Is " + courseName + " your correct course?");
            if (answer.contains("yess")) {
                cNameChecker = false;
            }
        } while (cNameChecker);
        String courseCode;
        boolean cCodeChecker = true;
        do {
            courseCode = InputReader.getString("Enter your course code > ");
            String answer = InputReader.getString("Is " + courseCode + " your correct Course code?");
            if (answer.contains("yess")) {
                cCodeChecker = false;
            }
        } while (cCodeChecker);
        Course course = new Course(courseName, courseCode);
        System.out.println();

        student.enroll(course);
    }

    /*
     * Method to instantiate a student class object using input from user
     */
    private static Student createStudent() {
        // System.out.println("Exercise 1");
        System.out.println();
        String fullName;
        boolean nameChecker = true;
        do {
            fullName = InputReader.getString("Enter your full name > ");
            String answer = InputReader.getString("Is " + fullName + " your correct name?");
            if (answer.contains("yess")) {
                nameChecker = false;
            }
        } while (nameChecker);
        String id;
        boolean idChecker = true;
        do {
            id = InputReader.getString("Enter your student ID > ");
            String answer = InputReader.getString("Is " + id + " your correct student ID?");
            if (answer.contains("yess")) {
                nameChecker = false;
            }
        } while (idChecker);
        Student student = new Student(id, fullName);
        System.out.println();
        return student;
    }

}
