package Week3;

public class Student {
    private String id;
    private String fullName;
    private Course course;

    /*
     * Constructor for student objects
     */
    public Student(String id, String fullName) {
        this.id = id;
        this.fullName = fullName;
    }

    // Course getter and "setter"
    public Course getCourse() {
        return course;
    }

    public void enroll(Course course) {
        this.course = course;
    }

    // Full name getter, setter and printer
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void printFullName() {
        System.out.print(fullName);
    }

    // ID getter, setter and printer
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void printId() {
        System.out.println(id);
    }
}
