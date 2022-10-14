package Week3;

public class Course {
    private String courseName;
    private String courseCode;

    public Course(String courseName, String courseCode) {
        this.courseCode = courseCode;
        this.courseName = courseName;
    }

    // Course Code getter, setter and printer
    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void printCourseCode() {
        System.out.println(courseCode);
    }

    // Couse name getter, setter and printer
    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void printCourseName() {
        System.out.println(courseName);
    }

}
